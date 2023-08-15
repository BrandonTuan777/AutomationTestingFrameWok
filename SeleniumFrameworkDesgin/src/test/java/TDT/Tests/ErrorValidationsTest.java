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
import org.testng.IRetryAnalyzer;
import org.testng.annotations.Test;

import com.sun.net.httpserver.Authenticator.Retry;

import TDT.TestComponents.BaseTest;
import TDT.pageobjects.HomePage;
import TDT.pageobjects.LoginPage;
import TDT.pageobjects.NewsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ErrorValidationsTest extends BaseTest {

	@Test(groups = {"Error"},retryAnalyzer=TDT.TestComponents.Retry.class)
	public void errorValidationLogin() throws IOException, InterruptedException {

		// Đăng nhập
		loginPage.LoginApplication("0888700954", "Tuanlaiduy12*");
		loginPage.getErrorMessage();
//		Số điện thoại hoặc mật khẩu chưa đúng
		Assert.assertEquals("Số điện thoại hoặc mật khẩu chưa đúng, vui lòng kiểm tra lại.",
				loginPage.getErrorMessage().substring(0, 61));

	}

}
