package assertion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest5 {
  @Test
  public void f() {
	  
	  Assert.assertNull(null);
	  
	  System.out.println("yes null");
  }
}
