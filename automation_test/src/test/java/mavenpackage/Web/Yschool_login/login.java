package mavenpackage.Web.Yschool_login;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import mavenpackage.Web.Initial_Web;
import mavenpackage.Web.ExcelUtil;

public class login extends Initial_Web {

	private ExcelUtil exelUtil;
	private XSSFSheet dataSheet1, dataSheet2;
	private int i, i2;
	private int rowCount, rowCount2;

	private String testDataExcelFileName = "DS tk Huyen Tay Giang.xlsx";
	//private String sheet1 = "DS Truong H.Nui Thanh";
	private String sheet1 = "Sheet1";
	//private String sheet2 = "Huyen Bac Tra My";
	//private String sheet2 = "DS TRUONG DAI LOC";

	@BeforeClass
	public void beforeClass() throws InterruptedException {
		driver = openBrowser();

		exelUtil = new ExcelUtil(testDataExcelFileName);

		dataSheet1 = exelUtil.setExcelFileSheet(sheet1);
		rowCount = exelUtil.getRowCount(sheet1);

		//dataSheet2 = exelUtil.setExcelFileSheet(sheet2);
		//rowCount2 = exelUtil.getRowCount(sheet2);

	}

	@Test
	public void TestLogin_Yschool() throws Exception {
		for (i = 1; i <= rowCount; i++) {
			String nameSchoolSheet1  = exelUtil.getCellData(dataSheet1, i, 1);
			System.out.println("Sheet 1 dòng số " + i + " - " + "Trường: " + nameSchoolSheet1);
			exelUtil.getRowData(dataSheet1, i);
			login_info.TC_Login(driver, exelUtil, dataSheet1, i, 4, 5);
			login_info.checkFillHS_Class(driver);
			login_info.logout(driver);
		}
		// for (i2 = 1; i2 <= rowCount2; i2++) {
		// 	String nameSchoolSheet2  = exelUtil.getCellData(dataSheet2, i, 1);
		// 	System.out.println("Sheet 2 dòng số " + i2 + " - " + "Trường: " + nameSchoolSheet2);
		// 	exelUtil.getRowData(dataSheet2, i2);
		// 	login_info.TC_Login(driver, exelUtil, dataSheet2, i2, 3, 4);
		// 	login_info.checkFillHS_Class(driver);
		// 	login_info.logout(driver);
		// }
		driver.quit();
	}
}
