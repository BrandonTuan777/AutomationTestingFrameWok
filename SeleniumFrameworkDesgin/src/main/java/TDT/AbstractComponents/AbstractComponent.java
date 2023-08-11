package TDT.AbstractComponents;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AbstractComponent {
	WebDriver driver;
	

	public AbstractComponent(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@class='sc-12qow75-2 kEyocY'][1]")
	WebElement firstEle;
	@FindBy(xpath = "//div[@class='sc-12qow75-2 kEyocY'][2]")
	WebElement secondEle;
	@FindBy(xpath = "//div[@class='sc-12qow75-2 kEyocY'][3]")
	WebElement thirdEle;
	@FindBy(xpath = "//div[@class='sc-12qow75-2 kEyocY'][4]")
	WebElement fourthEle;
	@FindBy(xpath = "//div[@class='sc-12qow75-2 kEyocY'][5]")
	WebElement fifthtEle;
	@FindBy(xpath = "//div[@class='sc-12qow75-2 kEyocY'][6]")
	WebElement sixEle;
	
	public void moveElementAndClick(By findBy,String ele) {
		Actions a = new Actions(driver);
		a.moveToElement(driver.findElement(findBy)).click()
		.sendKeys(ele).build().perform();
		firstEle.click();
	}
	
	public void chooseFristElementAndClick(WebElement ele) {
		ele.click();
		firstEle.click();
	}
	public void chooseSecondElementAndClick(WebElement ele) {
		ele.click();
		secondEle.click();
	}
	public void chooseThirdElementAndClick(WebElement ele) {
		ele.click();
		thirdEle.click();
	}
	public void chooseFourthElementAndClick(WebElement ele) {
		ele.click();
		fourthEle.click();
	}
	public void chooseFifthElementAndClick(WebElement ele) {
		ele.click();
		fifthtEle.click();
	}
	public void chooseSixElementAndClick(WebElement ele) {
		ele.click();
		sixEle.click();
	}
	
	public void waitForElementToAppear(By findBy) {
		WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(findBy));
	}
}
