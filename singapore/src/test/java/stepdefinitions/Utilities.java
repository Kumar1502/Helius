package stepdefinitions;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;



public class Utilities{

	public static WebDriver driver;

	public static XSSFSheet excelWsheet;

	public static XSSFWorkbook excelWBook;

	public static XSSFCell cell;

	public static XSSFRow row;
	public static String path=System.getProperty("user.dir")+"\\excel\\testdata.xlsx";
	
	public void setExcelFile(String path, String SheetName) throws Exception {

		FileInputStream ExcelFile = new FileInputStream(path);
		excelWBook = new XSSFWorkbook(ExcelFile);
		excelWsheet = excelWBook.getSheet(SheetName);

		
	}

	public void setCellData(int RowNum, int ColNum, String Result) throws Exception {
		setExcelFile(path, "Sheet1");
	    if(excelWsheet.getRow(RowNum)==null){
		excelWsheet.createRow(RowNum);
	    }
		excelWsheet.getRow(RowNum).createCell(ColNum).setCellValue(Result);
		FileOutputStream fos = new FileOutputStream(path);
		excelWBook.write(fos);
		fos.close();

	}
 public static void captureScreenshot(WebDriver driver) throws IOException{
		
		File scrFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Date d=new Date();
		String screenShotName=d.toString().replace(":", " ").replace(" ", "_")+".jpg";
		FileUtils.copyFile(scrFile, new File(path+screenShotName));
	}
}