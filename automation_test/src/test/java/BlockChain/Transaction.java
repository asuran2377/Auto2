package BlockChain;

import java.security.*;
import java.util.ArrayList;

public class Transaction {
    public String transactionId;
    public PublicKey sender;
    public PublicKey reciepient;
    public float value;
    public byte[] signature;

    public String id;
    public String parentTransactionId;

    //public ArrayList<TransactionInput> inputs = new ArrayList<TransactionInput>();
    public ArrayList<Transaction> inputs = new ArrayList<Transaction>();
    //public ArrayList<TransactionOutput> outputs = new ArrayList<TransactionOutput>();

    //private static int sequence = 0;

    //Khởi tạo
    public Transaction(PublicKey from, PublicKey to, float value, ArrayList<Transaction> inputs){
        this.sender = from;
        this.reciepient = to;
        this.value = value;
        this.inputs = inputs;
    }

    // public TransactionOutput(PublicKey reciepient, float value, String parentTransactionId){
    //     this.reciepient = reciepient;
    //     this.value = value;
    //     this.parentTransactionId = parentTransactionId;
    //     this.id = Helper.applySha256(Helper.getStringFromKey(reciepient) + Float.toString(value) + parentTransactionId);
    // }

    // private String calulateHash(){
    //     sequence++;
    //     return Helper.applySha256(Helper.getStringFromKey(sender) + Helper.getStringFromKey(reciepient) + Float.toString(value) + sequence);
    // }

    public void generateSignature(PrivateKey privateKey){
        String data = Helper.getStringFromKey(sender) + Helper.getStringFromKey(reciepient) + Float.toString(value);
        signature = Helper.applyECDSASig(privateKey, data);
    }

    public boolean verifiySignature(){
        String data = Helper.getStringFromKey(sender) + Helper.getStringFromKey(reciepient) + Float.toString(value);
        return Helper.verifyECDSASig(sender, data, signature);
    }
}
