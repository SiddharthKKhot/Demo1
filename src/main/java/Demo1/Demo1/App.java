package Demo1.Demo1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
		/*
		 * WebDriver driver= new ChromeDriver();
		 * driver.get("https://jqueryui.com/droppable/");
		 * driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		 * Actions a= new Actions(driver); WebElement source=
		 * driver.findElement(By.id("draggable")); WebElement target=
		 * driver.findElement(By.id("droppable"));
		 * 
		 * a.dragAndDrop(source, target).build().perform();
		 * driver.switchTo().defaultContent(); //
		 * driver.findElement(By.cssSelector("li a")).click();
		 */    
    	
     
    	WebDriver driver= new ChromeDriver();
    	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(	driver.findElements(By.cssSelector("a")).size());
      WebElement foterdriver=  driver.findElement(By.id("gf-BIG"));
             System.out.println( foterdriver.findElements(By.tagName("a")).size());
             
       WebElement columndriver=      driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
       for(int i=1;i<columndriver.findElements(By.tagName("a")).size();i++)
       {
    	   String clickonlinktab= Keys.chord(Keys.CONTROL,Keys.ENTER);
    	   columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
    	   Thread.sleep(5000L);
       }
       
      Set<String> abc= driver.getWindowHandles();
                Iterator<String> it =abc.iterator();
                
                
                while(it.hasNext())
                {
                	driver.switchTo().window(it.next());
                	System.out.println(driver.getTitle());
                }
      
      
      
      
      
      
      
      
      
      
    
    
    
    }
}
