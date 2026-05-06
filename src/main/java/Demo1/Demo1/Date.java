package Demo1.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Date {
 
	public static void main(String[] args) throws InterruptedException {
		 
		String date="06";
		String month="08";
		String year="2025";
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup__year")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label__labelText")).click();
		driver.findElement(By.xpath("//button[text()='" + year + "']")).click();
		driver.findElements(By.cssSelector(".react-calendar__year-view__months__month")).get(Integer.parseInt(month)).click();
		Thread.sleep(5000L);
		driver.findElement(By.xpath("//abbr[text()='" + year + "']")).click();


		
	}
}
