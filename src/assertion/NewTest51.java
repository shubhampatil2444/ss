package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest51 {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver112\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
  @Test
  public void VerifyTital() {
	  String expectedTital = "Facebook - log in or sign up";
	  String actual=driver.getTitle();
	  System.out.println(actual);
	  Assert.assertEquals(actual, expectedTital, "tital not match");
	  
  }
  
  @Test
  public void verifaybutton() {
	  String expectedbuttonTital="Log in";
	 WebElement button= driver.findElement(By.xpath("//button[@type='submit']"));
	  Assert.assertEquals(button.getText(), expectedbuttonTital,"tital does not match");
	  Assert.assertTrue(button.isEnabled(), "button is not enabled");
}
}
