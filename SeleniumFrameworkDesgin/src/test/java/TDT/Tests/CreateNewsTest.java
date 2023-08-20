package TDT.Tests;

import java.io.IOException;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import TDT.TestComponents.BaseTest;
import TDT.pageobjects.HomePage;
import TDT.pageobjects.NewsPage;

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
