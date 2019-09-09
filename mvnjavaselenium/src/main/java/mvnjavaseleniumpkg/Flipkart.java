package mvnjavaseleniumpkg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Flipkart {

	WebDriver driver;

	@BeforeClass
	public void getUrl() {
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
	}

	@BeforeMethod
	public void login() {

		WebElement userName = driver.findElement(By.cssSelector("input[class*='_2zrpKA _1dBPDZ']"));
		userName.sendKeys(" ");
		WebElement password = driver.findElement(By.cssSelector("input[type*='password']"));
		password.sendKeys(" ");
		password.sendKeys(Keys.ENTER);
	}

	/*@Test
	public void select() {
		Actions ac= new Actions(driver);
		ac.moveToElement(driver.findElement(By.xpath("//div[@class='zi6sUf']/div/ul/li/span"))).build().perform();
		
	}*/
	
	
	@Test(priority=3)
	public void search() {
	
		// Explicit wait
	WebElement search=driver.findElement(By.name("q"));
	search.sendKeys("Apple"+Keys.ENTER);
	}
}
