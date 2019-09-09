package MySelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		String a = driver.getCurrentUrl();
		System.out.println(a);
		if (a.contains("http://google.com")) {
			System.out.println("you are on correct website");
		}

		else {
			System.out.println("you are not on correct website");
		}
		driver.close();

	}

}
