package newpackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class basic {

	WebDriver driver;
	WebElement myElement;

	public void openBrowser(String myUrl) {
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
			String baseUrl = myUrl;
			driver.get(baseUrl);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*public void tryFindElement(String a) {

		myElement = driver.findElement(By.cssSelector(a));

	}*/

	public void tryClick(String a) {
		driver.findElement(By.cssSelector(a)).click();;
	}

	public void tryInput(String a, String b) {
		driver.findElement(By.cssSelector(a)).sendKeys(b);
	}

	public void tryClose() {
		driver.close();
		System.exit(0);
	}

}
