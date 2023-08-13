package TDT.Tests;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import TDT.TestComponents.BaseTest;
import TDT.pageobjects.HomePage;
import TDT.pageobjects.LoginPage;
import TDT.pageobjects.NewsPage;
import io.github.bonigarcia.wdm.WebDriverManager;


public class CreateNewsTest extends BaseTest {

	
	@Test
	public void createNew() throws IOException, InterruptedException {
		
		// Đăng nhập
		loginPage.LoginApplication("0888700954","Tuanlaiduy1*");
		
		//Tạo tin
		HomePage homePage=new HomePage(driver);
		homePage.creatNews();

		// Đăng tin
		NewsPage newsPage= new NewsPage(driver);
		newsPage.CreateNews();

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='content'] p[class='title']")).getText(),
				newsPage.tileNew());

	}

	


}
