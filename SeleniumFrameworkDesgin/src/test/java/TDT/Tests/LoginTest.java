package TDT.Tests;

import TDT.TestComponents.BaseTest;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import TDT.data.DataReader;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(dataProvider = "getData", groups = {"Logins"}, retryAnalyzer = TDT.TestComponents.Retry.class)
    public void LoginSuccess(HashMap<String, String> input) throws IOException, InterruptedException {

        // Đăng nhập
        loginPage.LoginApplication(input.get("phone"), input.get("password"));
        Assert.assertEquals(driver.findElement(By.xpath("(//div[@class='sc-bljvhv-1 bpNYcO'])[1]")).getText(),
                "Bất động sản");
    }

    @DataProvider
    public Object[][] getData() throws IOException {
        List<HashMap<String, String>> data = DataReader.getJsonDataToMap();
        return new Object[][]{{data.get(0)}, {data.get(1)}};
    }
}
