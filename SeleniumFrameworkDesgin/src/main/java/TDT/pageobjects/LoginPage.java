package TDT.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TDT.AbstractComponents.AbstractComponent;

public class LoginPage  {
	
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
//	driver.findElement(By.xpath("(//button[normalize-space()=\"Đăng nhập\"])")).click();
//	sleep(2000);
//	driver.findElement(By.id("phone")).sendKeys("0888700954");
//	driver.findElement(By.id("password")).sendKeys("Tuanlaiduy1*");
//	driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	@FindBy(xpath ="//button[contains(text(),'Đăng nhập')]")
	WebElement buttonSigIn;
	
	@FindBy(id="phone")
	WebElement phoneNumber;
	
	@FindBy(id="password")
	WebElement passwordEle;
	
	@FindBy(xpath = "//button[@type='submit']")
	WebElement submitButton;
	
	public void LoginApplication(String phone,String password) throws InterruptedException {
		buttonSigIn.click();
		Thread.sleep(2000);
		phoneNumber.sendKeys(phone);
		passwordEle.sendKeys(password);
		submitButton.click();
		Thread.sleep(5000);
	}
	
	public void goTo() {
		driver.get("https://muaban.net/");
	}
}
