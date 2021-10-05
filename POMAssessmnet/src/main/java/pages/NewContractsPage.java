package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import base.ProjectSpecificMethods;

public class NewContractsPage extends ProjectSpecificMethods {
	public NewContractsPage(ChromeDriver driver) { 
		  this.driver = driver; 
		  }
	public NewContractsPage enterAccName(){
		driver.findElement(By.xpath("//input[@title='Search Accounts']")).sendKeys("test"); 
		  return this;
		  
		  }
	public NewContractsPage enterNextDay(){
		driver.findElement(By.xpath("(//span[text()='Contract Start Date'])[2]/following::input")).sendKeys("10/6/2021"); 
		  return this;
		  
		  }
	public NewContractsPage enterTerm(){
		driver.findElement(By.xpath("//input[@step='1']")).sendKeys("6");
		  return this;
		  
		  }

	public NewContractsPage clickSave(){
		WebElement save = driver.findElement(By.xpath("(//span[text()='Save'])[2]"));
		driver.executeScript("arguments[0].click();", save);		  
		return this;
		  
		  }

	
}
