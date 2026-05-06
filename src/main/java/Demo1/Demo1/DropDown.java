package Demo1.Demo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	
	public static void main(String[] args) {
		
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
	  WebElement element=	driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
	  Select dropdown = new Select(element);
	  dropdown.selectByIndex(1);
	  System.out.println(dropdown.getFirstSelectedOption().getText());
	  dropdown.selectByVisibleText("AED");
	  System.out.println(dropdown.getFirstSelectedOption().getText());
	  dropdown.selectByValue("INR");
	  System.out.println(dropdown.getFirstSelectedOption().getText());
	  
	  driver.findElement(By.name("ctl00_mainContent_ddl_originStation1_CTXT")).click();
	  driver.findElement(By.xpath("//a[@value='BLR']")).click();
	  //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();
	  driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"));
	  
	  
	}

}
