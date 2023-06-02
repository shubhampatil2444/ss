package assertion;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest20 {
  @Test
  public void f() {
	  
	  SoftAssert as=new SoftAssert();
	  
	  as.assertNotNull(9);
	  
	  as.assertAll();
	  
	  System.out.println("this is assert last statement");
  }
}
