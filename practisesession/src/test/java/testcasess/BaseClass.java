package testcasess;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class BaseClass {
	
	
	
	public static WebDriver driver;
	
	@BeforeClass
	@Parameters({"browser","url"})
    public void beforeClass(String brw,String wbste) {
		
		if(brw.equalsIgnoreCase("chrome")) {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\kafle\\Desktop\\PNT\\practisesession\\Drivers\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(wbste);
	  driver.manage().window().maximize();
	  
		}
		else if(brw.equalsIgnoreCase("firefox")) {
	  
	  System.setProperty("webdriver.gecko.driver", "C:\\Users\\kafle\\Desktop\\PNT\\practisesession\\Drivers\\geckodriver.exe");
	  driver=new FirefoxDriver();
	  driver.get(wbste);
	  driver.manage().window().maximize();
		}
		
		else {
			System.out.println("something wrong");
		}
	
	 
	 
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
	  
  }
  
  public void screenshots( String sourseeee) throws IOException {
	  	
	 	File shots = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	 	FileUtils.copyFile(shots,new File(sourseeee+timestamp()+"mohankaf.png")); 
	 
	 
	 }
	
	public String timestamp() {
		
	 return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
	 
	 
}

}
