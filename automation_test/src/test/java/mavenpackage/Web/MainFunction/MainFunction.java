package mavenpackage.Web.MainFunction;

import org.testng.annotations.Test;

import mavenpackage.Web.Initial_Web;
import mavenpackage.Web.Functions.Deposit.Deposit;
import mavenpackage.Web.Functions.Transfer.TransferBank;
import mavenpackage.Web.Functions.Withdrawal.Withdrawal;

public class MainFunction extends Initial_Web {

    @Test
    public void function_Deposit() throws InterruptedException{
        Deposit.deposit();                
    }
    @Test
    public void function_WithDrawal() throws InterruptedException{
        Withdrawal.withdrawal();
    }
    @Test
    public void function_Transfer() throws InterruptedException{
        TransferBank.Transfer();
    }
}
