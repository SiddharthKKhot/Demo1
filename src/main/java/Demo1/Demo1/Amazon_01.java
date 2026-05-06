package Demo1.Demo1;

import java.awt.Desktop.Action;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon_01 {
	public static void main(String[] args) throws InterruptedException {
		
		  WebDriver driver = new ChromeDriver();
	        driver.manage().window().maximize();
	   /*    driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
	       driver.findElement(By.cssSelector(".blinkingText")).click();
	       Set<String> windows= driver.getWindowHandles();
	       Iterator<String>i= windows.iterator();
	       String parentId=i.next();
	       String childIt=i.next();
	       driver.switchTo().window(childIt);
	      String text= driver.findElement(By.cssSelector(".im-para.red")).getText();
	      String email= text.split("with")[0].trim().split("at")[1].trim();
	      driver.switchTo().window(parentId);
	      driver.findElement(By.cssSelector("#username")).sendKeys(email);
	      System.out.println(driver.findElement(By.cssSelector("#username")).getAttribute("value"));
	     //  driver.close(); */
	        
	        
	        
	        driver.get("https://www.amazon.in/");
	        
	        Actions a= new Actions(driver);
	        
	        a.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	        //a.moveToElement(driver.findElement(By.cssSelector("#nav-link-accountList-nav-line-1"))).build().perform();
	       
	}

}
