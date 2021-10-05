package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class AppLauncherPage extends ProjectSpecificMethods {

	public AppLauncherPage(ChromeDriver driver) { 
		  this.driver = driver; 
		  }
	
	public ContractsPage clickContracts(){
		WebElement contract = driver.findElement(By.xpath("//p[text()='Contracts']"));
		driver.executeScript("arguments[0].click();", contract);
		  return new ContractsPage(driver);
		  
		  }
}
