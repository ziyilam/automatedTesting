package newpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;;

public class PG2 {
	public static void main (String[] args) {
		 System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 String baseUrl = "http://ms.scrpower99.com//Member//MemberLogin";
		 String tagName = "";
		 
		 driver.get(baseUrl);
		 tagName = driver.findElement(By.id("requestPin")).getTagName();
		 System.out.println(tagName);
		 driver.close();
		 System.exit(0);
				
	}
}
