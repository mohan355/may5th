package testdetaa;

import org.testng.annotations.Test;

import pageobjectss.First_PageClass;
import pageobjectss.Second_PageClass;
import testcasess.BaseClass;

import org.testng.annotations.DataProvider;

public class NewTest extends BaseClass {
	
	@Test( priority=1)
	
	public void first() throws InterruptedException {
		 First_PageClass obj1=new First_PageClass(driver);
		  obj1.Account();
		  Thread.sleep(6000);
		  obj1.Regs();
		
		
	}
	
	
  @Test( priority=2, dataProvider = "createAcc")
  
  public void f(String n, String s) {
	  Second_PageClass obj2=new Second_PageClass( driver);
		 
	  obj2.email(n);
	  obj2.passd(s);
	  obj2.zpcd();
	  obj2.phnnum();
	  obj2.ctreacct();
	  obj2.clr();
	  obj2.clrer();
	  
	  
  }

  @DataProvider
  public Object[][] createAcc() {
    return new Object[][] {
      new Object[] { "nmvs@gmail.com", "ajviu" },
      new Object[] { "naufg@yahoo.com", "bbvusv" },
      new Object[] { "nvsokf@gmail.com", "f02nvfj"}
    };
  }
}
