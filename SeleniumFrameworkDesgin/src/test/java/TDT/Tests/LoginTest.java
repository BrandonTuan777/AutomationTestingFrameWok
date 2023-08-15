package TDT.Tests;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import TDT.TestComponents.BaseTest;
import TDT.pageobjects.HomePage;
import TDT.pageobjects.LoginPage;
import TDT.pageobjects.NewsPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest extends BaseTest {

	@Test(dataProvider = "getData",groups = { "Logins" },retryAnalyzer=TDT.TestComponents.Retry.class)
	public void LoginSucces(HashMap<String, String> input) throws IOException, InterruptedException {

		// Đăng nhập
		loginPage.LoginApplication(input.get("phone"), input.get("password"));
		Assert.assertEquals(driver.findElement(By.xpath("(//div[@class='sc-bljvhv-1 bpNYcO'])[1]")).getText(),
				"Bất động sản");

	}
	
	


	@DataProvider
	public Object[][] getData() throws IOException {

		List<HashMap<String,String>> data = getJsonDataToMap(System.getProperty("user.dir")+"//src//test//java//TDT//data//Login.json");
		return new Object[][] { { data.get(0) }, { data.get(1)} };

	}
	
//	HashMap<String, String> map = new HashMap<String, String>();
//	map.put("phone", "0888700954");
//	map.put("password", "Tuanlaiduy1*");
//
//	HashMap<String, String> map1 = new HashMap<String, String>();
//	map1.put("phone", "0902883759");
//	map1.put("password", "dinhthi3105");
}
