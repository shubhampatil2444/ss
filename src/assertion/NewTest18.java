package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest18 {
  @Test
  public void f() {
	  
	  SoftAssert as=new SoftAssert();
	  
	  as.assertNull(null);
	  
	  as.assertAll();
	  
	  System.out.println("last assert statement");
  }
}
