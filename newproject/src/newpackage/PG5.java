package newpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG5 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String baseUrl = "http://ms.scrpower99.com//Member//MemberLogin";
		driver.get(baseUrl);

		String myString = "";
		myString = driver.findElement(By.id("username")).getTagName();
		System.out.println("the Text is: " + myString);
		myString = driver.findElement(By.className("page-title")).getText();
		System.out.println("the Text is: " + myString);
		myString = driver.findElement(By.id("Password")).getAttribute("placeholder");
		System.out.println("the Text is: " + myString);
		
		//driver.findElement(By.cssSelector("input#username")).sendKeys("1097768799");
		driver.findElement(By.cssSelector("input.form-control sm-width")).sendKeys("999999");
		//driver.close();
	}

}
