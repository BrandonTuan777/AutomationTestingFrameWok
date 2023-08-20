package TDT.Tests;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import TDT.TestComponents.BaseTest;

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
