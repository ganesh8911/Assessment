package assessmentweek2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Salesforce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("earth@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Bootcamp$123");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'tooltipTrigger tooltip-trigger')]//div)[3]")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("//p[text()='Contacts']/following::p")).click();
		driver.findElement(By.xpath("//div[@class='slds-context-bar__label-action slds-p-left--none slds-p-right--x-small']")).click();
		driver.findElement(By.xpath("//a[@role='menuitem']")).click();
		driver.findElement(By.xpath("//input[@role='combobox'])[3]")).click();
		driver.findElement(By.xpath("//div[text()='testcom']")).click();
		driver.findElement(By.xpath("//div[@class='form-element']//a")).click();
		driver.findElement(By.xpath("//span[text()='8']")).click();
		driver.findElement(By.xpath("//input[@class='input uiInputSmartNumber']")).sendKeys("6");
		driver.findElement(By.xpath("(//span[text()='Save'])[2]")).click();
		
		
	}

}
