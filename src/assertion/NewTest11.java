package assertion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest11 {
  @Test
  public void f() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\chromedriver112\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  driver.get("https://www.google.com/");
	  
	  String tital=driver.getTitle();
	  
	  SoftAssert as=new SoftAssert();
	  
	  as.assertNotEquals(tital, "google", "done");
	  
	  as.assertAll();
	  
	  System.out.println("last assert");
  }
}
