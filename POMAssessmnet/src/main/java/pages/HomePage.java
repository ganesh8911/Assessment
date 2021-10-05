package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class HomePage extends ProjectSpecificMethods {
	
	public HomePage(ChromeDriver driver) { 
		  this.driver = driver; 
		  }
	
	public HomePage clickAppLauncher(){
		WebElement toggleMenu = driver.findElement(By.className("slds-icon-waffle"));
		driver.executeScript("arguments[0].click();", toggleMenu); 
		  return this;
		  
		  }
	public AppLauncherPage clickViewAll() throws InterruptedException{
		Thread.sleep(1000);
		WebElement viewAll = driver.findElement(By.xpath("//button[text()='View All']"));
		driver.executeScript("arguments[0].click();", viewAll);
		return new AppLauncherPage(driver);
		  
		  }

}
