package base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	public ChromeDriver driver;

	 
	
 @BeforeMethod
public void PreCodition() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	driver.get("https://login.salesforce.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("earth@testleaf.com");
	driver.findElement(By.id("password")).sendKeys("Bootcamp$123");
	WebElement loginButton = driver.findElement(By.id("Login"));
	driver.executeScript("arguments[0].click();", loginButton);
	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	
	}
 
 @AfterMethod
 public void postCondition() {
	 driver.close();
	 
 }
 
 
}
