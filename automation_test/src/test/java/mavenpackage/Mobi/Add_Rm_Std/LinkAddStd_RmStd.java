package mavenpackage.Mobi.Add_Rm_Std;

import java.net.MalformedURLException;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

import io.appium.java_client.android.AndroidDriver;
import mavenpackage.Mobi.CommonMethods_Mobi;
import mavenpackage.Mobi.Constants_Mobi;

public class LinkAddStd_RmStd {

    public static void addStd_op_code(AndroidDriver<WebElement> driver)
            throws MalformedURLException, InterruptedException {

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW, "@bounds='[54,267][126,339]'");
        WebElement element = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW,
                "@bounds='[54,267][126,339]'");
        element.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thêm học sinh");
        WebElement addStd_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thêm học sinh");
        addStd_.click();
        
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Tìm kiếm theo mã số học sinh");        
        WebElement txtcode_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW,
                "Tìm kiếm theo mã số học sinh");
        txtcode_.click();

        WebElement txtInputcode_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT,
                "Nhập mã số học sinh");
        txtInputcode_.sendKeys(Constants_Mobi._codeStd);

        WebElement btnTimKiem_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "TÌM KIẾM");
        btnTimKiem_.click();

        WebElement btnXacNhan_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "XÁC NHẬN");
        btnXacNhan_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Màn hình chính");
        WebElement btnManhinh_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Màn hình chính");
        btnManhinh_.click();        

        rmStd(driver);
    }

    public static void addStd_Ho_Ten(AndroidDriver<WebElement> driver)
            throws MalformedURLException, InterruptedException {
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW, "@bounds='[54,267][126,339]'");
        WebElement navi_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW,
                "@bounds='[54,267][126,339]'");
        navi_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thêm học sinh");
        WebElement addStd_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thêm học sinh");
        addStd_.click();
        Thread.sleep(2000);

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập họ tên học sinh");
        WebElement txtTenHocSinh_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT,
                "Nhập họ tên học sinh");
        Assert.assertEquals(txtTenHocSinh_.getText(), "Nhập họ tên học sinh");
        txtTenHocSinh_.click();
        txtTenHocSinh_.sendKeys(Constants_Mobi._txtHoTen);

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập năm sinh");
        WebElement txtNamsinh_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập năm sinh");
        Assert.assertEquals(txtNamsinh_.getText(), "Nhập năm sinh");
        txtNamsinh_.click();
        txtNamsinh_.sendKeys(Constants_Mobi._txtNamSinh);

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Chọn trường");
        WebElement txtChonTruong_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Chọn trường");
        Assert.assertEquals(txtChonTruong_.getText(), "Chọn trường");
        txtChonTruong_.click();
        txtChonTruong_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Tìm kiếm...");
        WebElement txtTimTruong_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Tìm kiếm...");
        Assert.assertEquals(txtTimTruong_.getText(), "Tìm kiếm...");
        txtTimTruong_.click();
        txtTimTruong_.sendKeys(Constants_Mobi._txtTimTruong);

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Trường test BMC");
        WebElement chonTruong_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Trường test BMC");
        Assert.assertEquals(chonTruong_.getText(), "Trường test BMC");
        chonTruong_.click();
        chonTruong_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "TÌM KIẾM");
        WebElement btnTimKiem_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "TÌM KIẾM");
        Assert.assertEquals(btnTimKiem_.getText(), "TÌM KIẾM");
        btnTimKiem_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "LIÊN KẾT");
        WebElement btnLienKet_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "LIÊN KẾT");
        Assert.assertEquals(btnLienKet_.getText(), "LIÊN KẾT");
        btnLienKet_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Màn hình chính");
        WebElement btnMain_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Màn hình chính");
        Assert.assertEquals(btnMain_.getText(), "Màn hình chính");
        btnMain_.click();

        rmStd(driver);
    }

    public static void rmStd(AndroidDriver<WebElement> driver) throws MalformedURLException, InterruptedException {
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW, "@bounds='[54,267][126,339]'");
        WebElement navi_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW,
                "@bounds='[54,267][126,339]'");
        navi_.click();
        
        MobileElement scroll = (MobileElement) driver
                .findElement(MobileBy.AndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
                        + "new UiSelector().text(\"Thông tin tài khoản\"));"));
        scroll.getLocation();

        // Remove
        WebElement txtInfoAcc_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thông tin tài khoản");
        txtInfoAcc_.click();
        Thread.sleep(2000);

        // Hàm để scroll màn hình đẩy lên 1 lần để màn hình scroll xuống
        /*
         * MobileElement scroll_find = (MobileElement)
         * driver.findElement(MobileBy.AndroidUIAutomator(
         * "new UiScrollable(new UiSelector().scrollable(true)).scrollForward()"));
         * scroll_find.getLocation(); Thread.sleep(2000);
         */

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, Constants_Mobi._codeStd);
        WebElement chkbox_ = driver.findElementByXPath("//android.widget.TextView[@text='" + Constants_Mobi._codeStd
                + "']/parent::android.view.ViewGroup[@index='0']/following-sibling::android.view.ViewGroup[@index='5']/android.widget.ImageView");
        chkbox_.click();

        // Hàm để scroll màn hình tìm element
        MobileElement scroll_1 = (MobileElement) driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector()).scrollIntoView(" + "new UiSelector().text(\"Xoá học sinh\"));"));
        scroll_1.getLocation();

        // WebElement btnRemove =
        WebElement btnRemove = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xoá học sinh");
        btnRemove.click();
        Thread.sleep(2000);

        WebElement btn_XacNhanRemove = driver
                .findElementByXPath("//android.widget.TextView[@bounds='[602,1253][916,1309]']");
        btn_XacNhanRemove.click();

        Thread.sleep(2000);
        WebElement btnDong_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Đóng");
        btnDong_.click();

        Thread.sleep(2000);
        WebElement back_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW,
                "@bounds='[54,267][126,339]'");
        back_.click();
    }
}


