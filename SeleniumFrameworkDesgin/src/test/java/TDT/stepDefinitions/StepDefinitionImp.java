package TDT.stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;

import TDT.TestComponents.BaseTest;
import TDT.pageobjects.HomePage;
import TDT.pageobjects.LoginPage;
import TDT.pageobjects.NewsPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitionImp extends BaseTest {
	
	public LoginPage loginPage;
	
	@Given("I landed on LoginPage")
	public void firstStart() throws IOException {
		loginPage=launchApplication();
	}
	
	@Given("^Logged in with user phone number (.+) and password (.+)$")
	public void logged_in_phonenumber_and_password(String phone,String password) throws InterruptedException {
		loginPage.LoginApplication(phone,password);
		
	}
	
	@When("I click the button creat news")
	public void click_creat_news_button() {
		HomePage homePage=new HomePage(driver);
		homePage.creatNews();
	}
	@And("Create a news post by filling in the fields that need information and submit")
	public void create_newsPost() throws InterruptedException {
		NewsPage newsPage= new NewsPage(driver);
		newsPage.CreateNews();
	}
	@Then("The title of the new post display")
	public void the_title_of_the_new_post_display() {
		NewsPage newsPage=new NewsPage(driver);
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='content'] p[class='title']")).getText(),
				newsPage.tileNew());
		driver.quit();
	}
	
	@Then("^(.+) message is display$") 
	public void error_message_is_display(String error_message) {
		Assert.assertEquals(error_message,
				loginPage.getErrorMessage().substring(0, 61));
		driver.quit();
	}
}
