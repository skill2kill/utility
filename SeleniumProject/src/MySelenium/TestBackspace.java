package MySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBackspace {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.google.com/");
		WebElement textbox = driver.findElement(By.name("q"));
		textbox.sendKeys("JAVAhatargaayuuiklasbkaskihksalnasa");
		String value=textbox.getAttribute("value");
		int size=value.length();
		for (int i = 0; i < size; i++) {
			textbox.sendKeys(Keys.BACK_SPACE);
			
		}

		WebElement gmail=driver.findElement(By.linkText("Gmail"));
		String fontsize=gmail.getCssValue("font_size");
		String color=gmail.getCssValue("color");
		System.out.println("Fontsize  " +fontsize);
		System.out.println("Color  " +color);
	}

}
