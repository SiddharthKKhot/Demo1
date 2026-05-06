package Demo1.Demo1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class JavaScriptExecuter {

	public static void main(String[] args) {

		
		

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("window.scrollBy(0,500)");
		executor.executeScript("document.querySelector('.tableFixHead').scrollTop = 5000");


		List<WebElement> elements = driver.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < elements.size(); i++) {
			sum = sum + Integer.parseInt(elements.get(i).getText());
		}

		String value = driver.findElement(By.cssSelector(".totalAmount")).getText().split(":")[1].trim();
	
		Assert.assertEquals(Integer.parseInt(value), sum);
		

	}

}
