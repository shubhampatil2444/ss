package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver;
 @Test
public void f1() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver_win32 (1)\\chromedriver.exe");
	
	driver=new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	
	String tital=driver.getTitle();
	
	Assert.assertEquals(tital, "Google", "pass");
	
	Thread.sleep(2000);
	
	driver.close();
	
	
}
}