package assessmentweek3;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		List<WebElement> headers = driver.findElements(By.xpath("//table//tbody//th"));
		for (int i = 4; i <headers.size()-2; i++) {
			System.out.println(headers.get(i).getText()+" ");
		}
		List<WebElement> rows = driver.findElements(By.xpath("//table//tbody//tr"));
		for (int j = 0; j < rows.size()-11; j++) {
			System.out.println(rows.get(j).getText()+" ");

		}	
		}

	}

