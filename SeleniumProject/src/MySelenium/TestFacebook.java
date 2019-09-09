package MySelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestFacebook {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			System.out.println(driver.getTitle());
			String a =driver.getCurrentUrl();
			
					if (a.equals("https://www.facebook.com/")) 
					{
						System.out.println("you are on correct website");
					} 
					
					else
					{
						System.out.println("you are not on correct website");
					}
					
					//Login
					WebElement userName = driver.findElement(By.cssSelector("input.inputtext"));
					userName.sendKeys("arien.dyan@gmail.com");
					WebElement password = driver.findElement(By.name("pass"));
					password.sendKeys("9337885883F");
					WebElement logIn = driver.findElement(By.xpath("//input[@value='Log In']"));
					logIn.click();
					
					//Exceptions Wait
					Thread.sleep(6000);
					
					
					//Profile
					
					WebElement profile = driver.findElement(By.xpath("//span[@class='_1vp5']"));
					profile.click();
					
					
					
					
					
					//Logout
					
					WebElement logOutMenu = driver.findElement(By.id("userNavigationLabel"));
					logOutMenu.click();
					Thread.sleep(4000);
					//WebElement logOut = driver.findElement(By.xpath("//span[@class='_54nh'][contains(.,'Log Out')]"));
					//logOut.click();*/
					WebElement signOut = driver.findElement(By.partialLinkText("Log Out"));
					signOut.click();
					
					
					
					
					
					
	
					
					
					
					driver.close();
			
		}
	}