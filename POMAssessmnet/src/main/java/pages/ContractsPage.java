package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class ContractsPage extends ProjectSpecificMethods {
	public ContractsPage(ChromeDriver driver) { 
		  this.driver = driver; 
		  }
	public NewContractsPage clickNewButton(){
		WebElement newButton = driver.findElement(By.className("forceActionLink"));
		driver.executeScript("arguments[0].click();", newButton);
		  return new NewContractsPage(driver);
		  
		  }
	
}
