package Stepdefs;

import io.cucumber.java.en.*;
import mavenpackage.Web.Initial_Web;
import mavenpackage.Web.Functions.Deposit.Deposit_info;
import mavenpackage.Web.Functions.Transfer.TransferBank_info;
import mavenpackage.Web.Functions.Withdrawal.Withdrawal_info;
import mavenpackage.Web.LoginUser.LoginUser;
import mavenpackage.Web.Napas.formNapas;
import mavenpackage.Web.Services.services;
import mavenpackage.Web.VerifyPass.formVerifyPass;

public class StepDefinitions extends Initial_Web {
    @Given("Mo trinh duyet de nap tien")
    public void Mo_trinh_duyet() {
        openBrowser();
    }

    @When("Dang nhap so dien thoai vao web")
    public void Dang_nhap_so_dien_thoai_va_web() throws InterruptedException {
        LoginUser.Login(driver);
    }

    @When("Thuc hien nap tien vao vi")
    public void Thuc_hien_nap_tien_vao_vi() throws InterruptedException {
        services.NapTien(driver);
        Deposit_info.infoNapTien(driver);
        Deposit_info.verifyNaptien(driver);
        formNapas.Napas_Otp(driver);        
    }

    @Then("Giao dich nap tien thanh cong")
    public void Giao_dich_thanh_cong() {
        Deposit_info.formSuccess(driver);        
        driver.quit();
    }

    @Given("Chon dich vu rut tien khoi vi")
    public void chon_dich_vu_rut_tien_khoi_vi() throws InterruptedException {
        openBrowser();
        LoginUser.Login(driver);
        services.RutTien(driver);
    }

    @When("Nhap thong tin rut tien")
    public void thuc_hien_rut_tien_khoi_vi() {
        Withdrawal_info.InfoWithDrawal(driver);
        Withdrawal_info.VeryinfoWithDrawal(driver);
        formVerifyPass.formverifypass(driver);
    }

    @Then("Giao dich rut tien thanh cong")
    public void giao_dich_rut_tien_thanh_cong() {
        Withdrawal_info.formSuccess(driver);
    }

    @Given("Chon dich vu chuyen tien khoi vi")
    public void chon_dich_vu_chuyen_tien_khoi_vi() {
        services.ChuyenTien(driver);
    }

    @When("Nhap thong tin chuyen tien")
    public void nhap_thong_tin_chuyen_tien() throws InterruptedException {
        TransferBank_info.infoChuyenTien(driver);
        TransferBank_info.verifyChuyentien(driver);
        formVerifyPass.formverifypass(driver);        
    }

    @Then("Giao dich chuyen tien thanh cong")
    public void giao_dich_chuyen_tien_thanh_cong() {
        TransferBank_info.formSuccess(driver);
        driver.quit();
    }
}
