package mvnjavaseleniumpkg;

import java.io.IOException;

import org.testng.annotations.Test;

public class Calling {

	@Test
	public static void call() throws IOException {
		// TODO Auto-generated method stub

		
		Utility.getDataFromExcel("C:\\Users\\Code\\eclipse-workspaceNew\\mvnjavaselenium\\exceldata\\Excel1.xlsx\\", "Sheet1", 0, 2);
		
	}

}
