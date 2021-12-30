package BlockChain;

import java.security.Security;
import java.util.ArrayList;

//import java.util.*;

public class VutaChain {
    public static ArrayList<Block> blockchain = new ArrayList<Block>();
    public static int difficulty = 2;   
    public static Wallet walletB, walletA; 
    public static void main(String[] args) {
        // Block genesisBlock = new Block("First Block" , "0");
        // System.out.println("Hash for Block 1: " + genesisBlock.hash);

        // Block secondBlock = new Block("Second Block", genesisBlock.hash);
        // System.out.println("Hash for Block 2: " + secondBlock.hash);

        // Block thirdBlock = new Block("Third Block", genesisBlock.hash);
        // System.out.println("Hash for Block 3: " + thirdBlock.hash);

        // //add
        // System.out.println("Dao Block thu 1....");
        // addBlock(new Block("Block lan 1 first block", "0"));
        // System.out.println("Dao Block thu 2....");
        // addBlock(new Block("Block lan 2 second block", blockchain.get(blockchain.size() - 1).hash));    
        // System.out.println("Dao Block thu 3....");
        // addBlock(new Block("Block lan 3 third block", blockchain.get(blockchain.size() - 1).hash));
        // System.out.println("\n Kiem tra Blockchain la hop le: " + isChainVaild());
        // String blockchainJson = Helper.getJson(blockchain);
        // System.out.println("\nThe Block chain: ");
        // System.out.println(blockchainJson);

        //Scanner scan = new Scanner(System.in);
        System.out.println("Input name: ");
        //String name = scan.nextLine();
        //System.out.println("Hello " + name);
        

        //Tao vi moi
        Security.addProvider(new org.bouncycastle.jce.provider.BouncyCastleProvider());
        walletA = new Wallet();
        walletB = new Wallet();

        System.out.println("Private and Public Key: ");
        System.out.println("\n"+ Helper.getStringFromKey(walletA.privateKey));
        System.out.println("\n" + Helper.getStringFromKey(walletA.publicKey));

        Transaction transaction = new Transaction(walletA.publicKey, walletB.publicKey, 5, null);
        transaction.generateSignature(walletA.privateKey);

        System.out.println("\n" + "Is signature verified");
        System.out.println(transaction.verifiySignature());
    }

    public static Boolean isChainVaild(){
        Block currentBlock;
        Block previousBlock;

        String hasTarget = new String(new char[difficulty]).replace('\0', '0');

        for(int i = 1; i < blockchain.size(); i++){
            currentBlock = blockchain.get(i);
            previousBlock = blockchain.get(i - 1);

            if(!currentBlock.hash.equals(currentBlock.calculateHash())){
                System.out.println("Current Hashes not equal");
                return false;
            }
            if(!previousBlock.hash.equals(currentBlock.previousHash)){
                System.out.println("Previous Hashes not equal");
                return false;
            }
            if(!currentBlock.hash.substring(0,difficulty).equals(hasTarget)){
                System.out.println("Block nay ko the dao");
                return false;
            }
        }
        return true;
    }

    public static void addBlock(Block newBlock){
        newBlock.mineBlock(difficulty);
        blockchain.add(newBlock);
    }
}