package testing.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.setProperty("webdriver.chrome.driver", "D:\\chrome\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
        System.out.println( "Hello World!" );
        
    }
}
