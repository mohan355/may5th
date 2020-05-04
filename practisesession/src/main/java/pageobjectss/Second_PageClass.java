package pageobjectss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Second_PageClass {
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement emill;
	
	@FindBy(id = "password-input-field")
	WebElement paswd;
	
	@FindBy(id = "zipCode")
	WebElement zip;
	
	@FindBy(id ="phone")
	WebElement phn;
	
	@FindBy(xpath = "//*[@id='single-signin__body']/div/div[2]/form/button/span")
	WebElement create;
	
	public Second_PageClass(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void email(String eml) {
		emill.sendKeys(eml);
	}
	public void passd(String pawd) {
		paswd.sendKeys(pawd);
		
	}
	public void zpcd() {
		zip.sendKeys("21043");
		
	}
	public void phnnum() {
		phn.sendKeys("4431234121");
	}
	public void ctreacct() {
		create.click();
		
	} 
		public void clr() {
			emill.clear();
		}
		public void clrer() {
			paswd.clear();
			
		}

}
















