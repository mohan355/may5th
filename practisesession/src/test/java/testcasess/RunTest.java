package testcasess;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import pageobjectss.First_PageClass;
import pageobjectss.Second_PageClass;

public class RunTest extends  BaseClass {
	
	@Test(priority=1)
	public void f() throws InterruptedException {
	  
	  First_PageClass obj1=new First_PageClass(driver);
	  obj1.Account();
	  Thread.sleep(6000);
	  obj1.Regs();
	 
	        }
	
	  @Test(priority=2)
	  public void g() {
		  
		  Second_PageClass obj2=new Second_PageClass( driver);
		 
		  obj2.email("mohanmvsj@gmail.com");
		  obj2.passd("nkhff");
		  obj2.zpcd();
		  obj2.phnnum();
		  obj2.ctreacct();
		  obj2.clr();
		  obj2.clrer();
		  
		  
	  }
	  
	
	  
	  
  
}
