package mavenpackage.Mobi;

public class Constants_Mobi {

	//Info device
	public static final String _PLATFORM_NAME = "Android"; //Tên hệ điều hành
	public static final String _PLATFORM_VERSION = "10.0"; //Phiên bản HĐH
	public static final String _DEVICE_NAME = "Xiaomi Redmi Note 7"; //Tên máy khởi tạo
	public static final String _APPLICATION_NAME = "YSchool Phụ Huynh"; //Tên ứng dụng
	public static final String _app_packge = "com.yschool.app"; //Tên của app muốn dùng.
	public static final String _app_activity = "MainActivity";  //Dùng app "Application info apk" để check -- Để chạy app
	public static final String _local_appium = "http://127.0.0.1:4723/wd/hub";  //Link local của Appium     

	public static final long LONG_TIMEOUT = 30;
	public static final long SHORT_TIMEOUT = 1;
	
	//DYNAMIC LOCATOR
	public static final String DYNAMIC_XPATH_TEXT_VIEW = "//android.widget.TextView[@text='%s']";
    public static final String DYNAMIC_XPATH_EDIT_TEXT = "//android.widget.EditText[@text='%s']";
    public static final String DYNAMIC_XPATH_IMAGE_VIEW = "//android.widget.ImageView[%s]";

	public static final String DYNAMIC_XPATH_TEXT_VIEW_RESOURCE = "//android.widget.TextView[@resource-id='%s']";
	public static final String DYNAMIC_XPATH_EDIT_TEXT_RESOURCE = "//android.widget.EditText[@resource-id='%s']";
	public static final String DYNAMIC_XPATH_BUTTON_RESOURCE = "//android.widget.Button[@resource-id='%s']";



	// ---- List Variable ----
	//Info user login main
	public static final String _phonelogin = "0936299652";
	public static final String _passlogin = "12345678";
	public static final String _codeStd = "1579000221000025";
    public static final String _txtHoTen = "Phạm Thị Kim Hoa";
    public static final String _txtNamSinh = "2010";
    public static final String _txtTimTruong = "Trường test BMC";

	//info card Napas
	public static final String _sothe = "9704 0000 0000 0018";
    public static final String _hotenThe = "Nguyen Van A";
    public static final String _hansd = "03/07";
    public static final String _optNP = "otp";

	//info list payment_method
	public static final String _token = "HDBank";
    public static final String _Atm = "Thẻ ATM nội địa";
    public static final String _Visa = "Thẻ Quốc tế (Visa/MasterCard)";
    public static final String _transf = "Chuyển khoản ngân hàng";
	
	//List extension
    public static final String _DTtrasau = "0903786440";
    //public static final String _tiendien = "PE01000111111";
	public static final String _tiendien = "PE00000001_S";
	
    public static final String _capKp = "135259695670";
    public static final String _capSCTVHCM = "051405505A";
}
