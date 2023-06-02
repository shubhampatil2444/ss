package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest6 {
  @Test
  public void f() {
	  
	  Assert.assertNotNull(9);
	  
	  System.out.println("pass not null");
  }
}
