package MySelenium;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\selenium\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		Thread.sleep(5000);
		driver.close();

	}

}
