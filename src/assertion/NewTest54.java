package assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest54 {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void init() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Desktop\\chromedriver112\\chromedriver.exe" );
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(12));
	}
  @Test
  public void verifytital() {
	  String exp="facebook - log in or sign in";
	  String act=driver.getTitle();
	  System.out.println(act);
	  Assert.assertEquals(act, exp, "Tital does not matched");
  }
  @Test
  public void verifybutton() {
	  String exp="Log in";
	 WebElement button= driver.findElement(By.xpath("//button[@type=\"submit\"]"));
	  Assert.assertEquals(button.getText(), exp, "tital not matched");
	  System.out.println("after frist validation");
	  
	  Assert.assertTrue(button.isEnabled(), "button is enable");
	  System.out.println("after second validation");
  }
  
  @Test
  public void verifyurl() {
	  String exp="https://www.facebook.com/";
	  String act=driver.getCurrentUrl();
	  
	  SoftAssert as=new SoftAssert();
	  System.out.println("before assert");
	  
	  as.assertEquals(act, exp, "does not match");
	  
	  
	  System.out.println("after assert");
	  as.assertAll();
  }
}
