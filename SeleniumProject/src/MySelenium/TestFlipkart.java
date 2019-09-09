package MySelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFlipkart {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		System.out.println(driver.getTitle());

		// UserName & Password
		WebElement userName = driver.findElement(By.cssSelector("input[class*='_2zrpKA _1dBPDZ']"));
		userName.sendKeys("8");
		WebElement password = driver.findElement(By.cssSelector("input[type*='password']"));
		password.sendKeys("933");

		// Login
		// Parent-Child xPath
		WebElement logIn = driver.findElement(By.xpath("//div[@class='_1avdGP']/button/span"));
		// WebElement logIn = driver.findElement(By.className("_7UHT_c"));
		logIn.click();

		// Search
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("Redmi" + Keys.ENTER);

		WebElement price = driver.findElement(By.cssSelector(
				"#container > div > div.t-0M7P._2doH3V > div._3e7xtJ > div > div:nth-child(1) > div > div:nth-child(1) > div > section._1MCcAi.D_NGuZ > div._3Uy12X > div._1qKb_B > select"));
		price.click();

		int i = 0;
		while (i <= 3) {
			price.sendKeys(Keys.ARROW_DOWN);
			i++;
		}
		price.click();

		/*
		 * WebElement select =
		 * driver.findElement(By.xpath("//*[text()='Redmi Note 7S (Onyx Black, 32 GB)']"
		 * )); select.click();
		 */

		// driver.close();

	}

}
