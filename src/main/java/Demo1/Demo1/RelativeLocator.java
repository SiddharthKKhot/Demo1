package Demo1.Demo1;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

public class RelativeLocator {

    public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/angularpractice/");
        driver.switchTo().newWindow(WindowType.WINDOW);

        Set<String> handles = driver.getWindowHandles();
        Iterator<String> it = handles.iterator();
        String first = it.next();
        String second = it.next();

        driver.switchTo().window(second);
        driver.get("https://rahulshettyacademy.com/");

        // Get the second course text
        String text = driver.findElements(By.cssSelector("[href*='https://courses.rahulshettyacademy.com/p']")).get(1).getText();

        driver.switchTo().window(first);

        // Locate Name field and enter text
        WebElement nameField = driver.findElement(By.cssSelector("[name='name']"));
        nameField.sendKeys(text);

        // Relative locator for Email field (below Name field)
        WebElement emailField = driver.findElement(with(By.tagName("input")).below(nameField));
        emailField.sendKeys("test@example.com");

        // Relative locator for Password field (below Email field)
        WebElement passwordField = driver.findElement(with(By.tagName("input")).below(emailField));
        passwordField.sendKeys("123456");

        // Relative locator for checkbox (to the right of the label)
        WebElement label = driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
        WebElement checkbox = driver.findElement(with(By.tagName("input")).toRightOf(label));
        checkbox.click();

        // Optional: Close browser
//        driver.quit();
        
        
       File file= nameField.getScreenshotAs(OutputType.FILE);
       FileUtils.copyFile(file, new File("logo.png"));
        
        
        
        System.out.println(nameField.getRect().getHeight());
        System.out.println(nameField.getRect().getWidth());
        
        
        
        
    }
}
