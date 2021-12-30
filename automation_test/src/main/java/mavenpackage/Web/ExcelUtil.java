package mavenpackage.Web;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by obaskirt on 28-Oct-17. Updated by obaskirt on 02-Apr-2019
 */
public class ExcelUtil {
    // Location of Test data excel file
	public static String testDataExcelPath = null;
	public static String testDataExcelFileName = null;

		// Excel WorkBook
	private static XSSFWorkbook excelWBook;

	// Excel Sheet
	private static XSSFSheet excelWSheet;

	// Excel cell
	private static XSSFCell cell;

	// Excel row
	private static XSSFRow row;

	// Row Number
	public static int rowNumber;

	// Column Number
	public static int columnNumber;

	// Constructor
	public ExcelUtil(String testDataExcelFileNameLocal) {
		testDataExcelFileName = testDataExcelFileNameLocal;
	}
	
	// Setter and Getters of row and columns
	public void setRowNumber(int pRowNumber) {
		rowNumber = pRowNumber;
	}

	public int getRowNumber() {
		return rowNumber;
	}

	public void setColumnNumber(int pColumnNumber) {
		columnNumber = pColumnNumber;
	}

	public int getColumnNumber() {
		return columnNumber;
	}

	// This method has two parameters: "Test data excel file name" and "Excel sheet
	// name"
	// It creates FileInputStream and set excel file and excel sheet to excelWBook
	// and excelWSheet variables.
	public XSSFSheet setExcelFileSheet(String sheetName) {
		testDataExcelPath = Constants_Web.ROOT_FOLDER + Constants_Web.TEST_DATA_FOLDER;
		try {
			// Open the Excel file
			FileInputStream ExcelFile = new FileInputStream(testDataExcelPath + testDataExcelFileName);
			excelWBook = new XSSFWorkbook(ExcelFile);
			excelWSheet = excelWBook.getSheet(sheetName);
			return excelWSheet;
		} catch (Exception e) {
			try {
				throw (e);
			} catch (IOException e1) {
				e1.printStackTrace();
				return null;
			}
		}
	}

	// This method reads the test data from the Excel cell.
	// We are passing row number and column number as parameters.
	public String getCellData(XSSFSheet dataSheet, int RowNum, int ColNum) {
		try {
			cell = dataSheet.getRow(RowNum).getCell(ColNum);
			DataFormatter formatter = new DataFormatter();
			String cellData = formatter.formatCellValue(cell);
			return cellData;
		} catch (Exception e) {
			throw (e);
		}
	}

	// This method takes row number as a parameter and returns the data of given row
	// number.
	public XSSFRow getRowData(XSSFSheet dataSheet, int RowNum) {
		try {
			row = dataSheet.getRow(RowNum);
			return row;
		} catch (Exception e) {
			throw (e);
		}
	}

	// This method gets excel file, row and column number and set a value to the
	// that cell.
	public void setCellData(XSSFSheet dataSheet, String value, int RowNum, int ColNum) {
		try {
			row = dataSheet.getRow(RowNum);
			cell = row.getCell(ColNum);
			if (cell == null) {
				cell = row.createCell(ColNum);
				cell.setCellValue(value);
			} else {
				cell.setCellValue(value);
			}
			// Constant variables Test Data path and Test Data file name
			FileOutputStream fileOut = new FileOutputStream(testDataExcelPath + testDataExcelFileName);
			excelWBook.write(fileOut);
			fileOut.flush();
			fileOut.close();
		} catch (Exception e) {
			try {
				throw (e);
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}
	
	//This method counts number of rows
	   public int getRowCount(String sheetName)
	   {
		   excelWSheet = excelWBook.getSheet(sheetName);
	       int rowCount = excelWSheet.getLastRowNum();
	       System.out.println("Last row num: " + excelWSheet.getLastRowNum());
	       System.out.println("Row count: " + rowCount);
	       return rowCount;
	   }
}
