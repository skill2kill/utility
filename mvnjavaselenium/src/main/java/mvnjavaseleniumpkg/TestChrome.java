package mvnjavaseleniumpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestChrome {
	WebDriver driver;

	@Test(priority=1)
	public void chrome() {
		// TODO Auto-generated method stub

		System.out.println(driver.getTitle());
		String a = driver.getCurrentUrl();
		System.out.println(a);

		if (a.contains("google.com/")) {
			System.out.println("you are on correct website");
		}

		else {
			System.out.println("you are not on correct website");
		}
	}

	@Test(priority=2)
	public void backspace() {

		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("JAVAhatargaayuuiklasbkaskihksalnasa");
		String value = textbox.getAttribute("value");
		int size = value.length();
		for (int i = 0; i < size; i++) {
			textbox.sendKeys(Keys.BACK_SPACE);
		}

		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		String fontsize = gmail.getCssValue("font_size");
		String color = gmail.getCssValue("color");
		System.out.println("Fontsize  " + fontsize);
		System.out.println("Color  " + color);
	}

	@AfterClass
	public void close() {
		driver.close();
	}

	@BeforeClass
	public void start() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://google.com");

	}
}
