package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String baseUrl = "http://ms.scrpower99.com//Member//MemberLogin";
		driver.get(baseUrl);
		WebElement myElement = driver.findElement(By.id("username"));
		myElement.sendKeys("0197768799");
		myElement = driver.findElement(By.id("Password"));
		myElement.sendKeys("999999");
		// Thread.sleep(3000);
		driver.findElement(By.id("btnSubmitLogin")).click();
	}

}
