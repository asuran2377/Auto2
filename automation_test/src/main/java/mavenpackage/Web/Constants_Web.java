package mavenpackage.Web;

public class Constants_Web {

    //Info Loading Web
    //public static final String _domain = "http://localhost:61809/";
    public static final String _domain = "https://bmc.biller.vn/";
    public static final String _phonelogin = "0936299652";
    public static final String _password = "12345678";
    public static final String _otp_login = "000000";
    public static final String _sothe_napas = "9704 0000 0000 0018";
    public static final String _chuthe_napas = "Nguyen Van A";
    public static final String _hieuluc_napas = "03/07";
    public static final String _otp_napas = "otp";

    public static final String ROOT_FOLDER = System.getProperty("user.dir");
	public static final String TEST_DATA_FOLDER = "\\src\\testdata\\";

    public static final long LONG_TIMEOUT = 30;
	public static final long SHORT_TIMEOUT = 1;
	
	//DYNAMIC LOCATOR
    public static final String DYNAMIC_XPATH_ID_INPUT = "//input[@id='%s']";
    public static final String DYNAMIC_XPATH_TEXT_INPUT_ = "//input[text()='%s']";
    public static final String DYNAMIC_XPATH_ID_BUTTON = "//button[@id='%s']";
    public static final String DYNAMIC_XPATH_TEXT_BUTTON_ = "//button[text()='%s']";
    public static final String DYNAMIC_XPATH_A = "//a[@href='%s']";
}
