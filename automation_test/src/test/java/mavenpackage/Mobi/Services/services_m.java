package mavenpackage.Mobi.Services;

import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;
import mavenpackage.Mobi.CommonMethods_Mobi;
import mavenpackage.Mobi.Constants_Mobi;

public class services_m {

    public static void NapTienDienThoai(AndroidDriver<WebElement> driver) {

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xem thêm");
        WebElement xemthem_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xem thêm");
        xemthem_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Nạp tiền điện thoại");
        WebElement naptienDT_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Nạp tiền điện thoại");
        naptienDT_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập số điện thoại");
        WebElement txtphone_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập số điện thoại");
        txtphone_.click();
        txtphone_.sendKeys(Constants_Mobi._phonelogin);

        WebElement chonNhamang_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Chọn nhà mạng");
        chonNhamang_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Mobifone");
        WebElement nhamang_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Mobifone");
        nhamang_.click();

        WebElement menhgia_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "100,000");
        menhgia_.click();

        WebElement btnTiepTuc_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "TIẾP TỤC");
        btnTiepTuc_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        WebElement btnThanhToan_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        btnThanhToan_.click();
    }

    public static void MuaTheDienThoai(AndroidDriver<WebElement> driver) throws InterruptedException {

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xem thêm");
        WebElement xemthem_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xem thêm");
        xemthem_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Mua thẻ cào");
        WebElement muathecao_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Mua thẻ cào");        
        muathecao_.click();        

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Chọn nhà mạng");
        WebElement chonNMthecao_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Chọn nhà mạng");        
        chonNMthecao_.click();
        
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Mobifone");
        WebElement mangdt_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Mobifone");         
        mangdt_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW, "@bounds='[906,855][996,945]'");
        WebElement soluongthe_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_IMAGE_VIEW, "@bounds='[906,855][996,945]'");          
        for (int i = 1; i < 11; i++) {
            soluongthe_.click();
        }

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "100,000");
        WebElement menhgia_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "100,000");          
        menhgia_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "TIẾP TỤC");
        WebElement btnTiepTuc_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "TIẾP TỤC");         
        btnTiepTuc_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        WebElement btnThanhToan_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");         
        btnThanhToan_.click();
    }

    public static void DienThoaiTraSau(AndroidDriver<WebElement> driver) {
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xem thêm");
        WebElement xemthem_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xem thêm");
        xemthem_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Điện thoại di động trả sau");
        WebElement dtTraSau_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW,
                "Điện thoại di động trả sau");
        dtTraSau_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Mobifone");
        WebElement nhamang_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Mobifone");
        nhamang_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập mã khách hàng");
        WebElement txtMaKH_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập mã khách hàng");
        txtMaKH_.click();
        txtMaKH_.sendKeys(Constants_Mobi._DTtrasau);

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "TÌM KIẾM");
        WebElement btnTimKiem_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "TÌM KIẾM");
        btnTimKiem_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        WebElement btnThanhToan_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "THANH TOÁN");
        btnThanhToan_.click();
        btnThanhToan_.click();
    }

    public static void TienDien(AndroidDriver<WebElement> driver) {
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Tất cả dịch vụ");
        WebElement xemthem_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Tất cả dịch vụ");
        xemthem_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Điện");
        WebElement ttDien_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Điện");
        ttDien_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "EVN HCMC");
        WebElement chonKhuvuttDien_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "EVN HCMC");
        chonKhuvuttDien_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập mã khách hàng");
        WebElement txtMaKH_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_EDIT_TEXT, "Nhập mã khách hàng");
        txtMaKH_.click();
        txtMaKH_.sendKeys(Constants_Mobi._tiendien);
        driver.hideKeyboard();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Tìm kiếm");
        WebElement btnTimKiem_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Tìm kiếm");
        btnTimKiem_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thanh toán");
        WebElement btnThanhToan_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Thanh toán");
        btnThanhToan_.click();
    }

    public static void CapKp(AndroidDriver<WebElement> driver) {
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xem thêm");
        WebElement xemthem_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xem thêm");
        xemthem_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Truyền hình cáp");
        WebElement capSCTV_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Truyền hình cáp");
        capSCTV_.click();

    }

    public static void CapSCTVHCM(AndroidDriver<WebElement> driver) {
        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xem thêm");
        WebElement xemthem_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Xem thêm");
        xemthem_.click();

        CommonMethods_Mobi.waitForElementClickable(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Truyền hình cáp");
        WebElement capSCTV_ = CommonMethods_Mobi.findElement(driver, Constants_Mobi.DYNAMIC_XPATH_TEXT_VIEW, "Truyền hình cáp");
        capSCTV_.click();
    }
}