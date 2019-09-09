package mvnjavaseleniumpkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.*;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Utility {
	static String data = null;

	public static void getDataFromExcel(String filepath, String sheetName, int row, int cell) throws IOException {

		File f = new File(filepath); // create object for File class and pass the file path
		FileInputStream fis = new FileInputStream(f); // create File input stream class object and pass the file ref
		Workbook wb = WorkbookFactory.create(fis); // covert regular file to workbook type
		Sheet st = wb.getSheet(sheetName); // get sheet by workbook
		Row r = st.getRow(row); // get row by sheet
		Cell c = r.getCell(cell); // get cell by row
		data = c.toString(); // convert cell value to string type
		// System.out.println(data);
	}

	public static void setDataToExcel(String filepath, String sheetName, int row, int cell, String data)
			throws EncryptedDocumentException, IOException {

		File f = new File(filepath);
		FileInputStream fis = new FileInputStream(f);
		Workbook wb = WorkbookFactory.create(fis);
		Sheet st = wb.getSheet(sheetName);
		Row r = st.getRow(row);
		Cell c = r.getCell(cell);
		c.setCellValue(data);
		FileOutputStream fos = new FileOutputStream(f);
		wb.write(fos);

	}

	public static void screenShot(WebDriver driver, String screenshotname) throws Exception {

		File src= ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:/selenium/" + System.currentTimeMillis() + screenshotname + ".png"));
		
		//FileUtils.copyFile(src, new File("C:/selenium/" + System.currentTimeMillis() + ".png")); //OLDCODE
	}
}
