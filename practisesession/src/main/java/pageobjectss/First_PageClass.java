package pageobjectss;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class First_PageClass {
	
	WebDriver driver;
	
	@FindBy(xpath ="//*[@id=\"headerMyAccountTitle\"]/div")
	WebElement myAcc;
	
	@FindBy(xpath = "//*[@id='SPSORegister']/a/span")
	  WebElement reg;
	
	public First_PageClass(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	
	}
	public void Account() {
		myAcc.click();
	}
	public void Regs() {
		reg.click();
		
	}

}
