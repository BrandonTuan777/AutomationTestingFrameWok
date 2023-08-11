package TDT;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import TDT.pageobjects.HomePage;
import TDT.pageobjects.LoginPage;
import TDT.pageobjects.NewsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateNewsTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Actions a = new Actions(driver);

		// Đăng nhập
		LoginPage loginPage = new LoginPage(driver);
		loginPage.goTo();
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

	private static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
