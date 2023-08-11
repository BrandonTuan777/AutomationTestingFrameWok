package TDT.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TDT.AbstractComponents.AbstractComponent;

public class HomePage extends AbstractComponent {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//button/span[.='Đăng tin']")
	WebElement buttonCrearteNews;
	
	By icon_house = By.cssSelector(".sc-bljvhv-5.kinNPk");
	
	public void creatNews() {
		waitForElementToAppear(icon_house);
		buttonCrearteNews.click();
	
	}
	

}
