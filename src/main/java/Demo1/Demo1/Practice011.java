package Demo1.Demo1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;

public class Practice011 {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));

		SoftAssert assert1 = new SoftAssert();

		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();

			int respCode = conn.getResponseCode();

			if (respCode >= 400) {
				assert1.assertTrue(respCode < 400,
						"The link with Text" + link.getText() + " is broken with code" + respCode);
			}

		}
		assert1.assertAll();

	}

}
