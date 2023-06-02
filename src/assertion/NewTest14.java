package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest14 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver112\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com/");
	  
	  String tital=driver.getTitle();
	  
	  Boolean b=tital.equalsIgnoreCase("Google");
	  
	  SoftAssert as=new SoftAssert();
	  
	  as.assertTrue(b);
	  
	  as.assertAll();
	  
	  System.out.println("this last assert");
	  
  }
}
