package testing.testing;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
///import org.testng.annotations.Test;

import junit.framework.TestCase;

public class TestSeleniumJenkins extends TestCase {

	@Test
	public void test() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		assertEquals("Google", driver.getTitle());
       // driver.manage().window().maximize();
		// Thread.sleep(5000);
		driver.close();
	}

}