package Demo1.Demo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowProperties {
   public static void main(String[] args) {
	
	   
	   WebDriver driver= new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://www.amazon.in/");
	   System.out.println(   driver.getTitle());
	   driver.navigate().to("https://www.flipkart.com/");
	   System.out.println(   driver.getTitle());
	   driver.navigate().back();
	   System.out.println(   driver.getTitle());
	   driver.navigate().forward();
	   System.out.println(   driver.getTitle());
}
}
