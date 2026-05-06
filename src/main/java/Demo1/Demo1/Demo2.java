package Demo1.Demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Demo2 {
	public static void main(String[] args) throws InterruptedException {
		
		String name="siddharth";
		 WebDriver driver= new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	String password=	 getpassword(driver);
         
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.id("inputUsername")).sendKeys(name);
         driver.findElement(By.name("inputPassword")).sendKeys(password);
         driver.findElement(By.className("signInBtn")).click();
         Thread.sleep(1000);
        System.out.println( driver.findElement(By.tagName("p")).getText());
         Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
         driver.findElement(By.xpath("//*[text()='Log Out']")).click();
        
         //driver.close();
		
		
		
	}
	
	public static String getpassword(WebDriver driver) throws InterruptedException
	{
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
		 driver.findElement(By.linkText("Forgot your password?")).click();
		   Thread.sleep(1000);
		     driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String text= driver.findElement(By.cssSelector("form p")).getText();
		String passwords[]=text.split("'");
		  String password=     passwords[1].split("'")[0].trim();
		  return password;
	}

}
