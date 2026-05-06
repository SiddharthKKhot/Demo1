package Demo1.Demo1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prcatice1 {
	public static void main(String[] args) throws InterruptedException {
		
         WebDriver driver= new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
         driver.get("https://rahulshettyacademy.com/locatorspractice/");
         driver.findElement(By.id("inputUsername")).sendKeys("siddharth");
         driver.findElement(By.name("inputPassword")).sendKeys("12345");
         driver.findElement(By.className("signInBtn")).click();
         System.out.println(driver.findElement(By.cssSelector(".error")).getText());
         driver.findElement(By.linkText("Forgot your password?")).click();
         Thread.sleep(1000);
         driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("siddharth");
         driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("siddharthkhot@gmail.com");
         driver.findElement(By.cssSelector("input[type='text']:nth-child(4)")).sendKeys("7760024248");
         driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        System.out.println( driver.findElement(By.cssSelector("form p")).getText());
        driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.cssSelector("#inputUsername")).sendKeys("siddharth");
        driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
         
         
	}

}
