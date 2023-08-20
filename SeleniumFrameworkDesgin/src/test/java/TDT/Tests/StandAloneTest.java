package TDT.Tests;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StandAloneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		driver.get("https://muaban.net/");

		// Đăng nhập
		driver.findElement(By.xpath("//button[contains(text(),'Đăng nhập')]")).click();
		sleep(2000);
		driver.findElement(By.id("phone")).sendKeys("0888700954");
		driver.findElement(By.id("password")).sendKeys("Tuanlaiduy1*");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		sleep(5000);

		// Đăng tin
		driver.findElement(By.xpath("//button/span[.='Đăng tin']")).click();

		driver.findElement(By.xpath("//button[@class=\"sc-5fp63n-6 jEGfcq\"]")).click();
		sleep(2000);
		List<WebElement> topics = driver.findElements(By.xpath("//div[@class=\"sc-12fxoq3-4 hyuWUa\"]"));
		WebElement topic = topics.stream()
				.filter(topic1 -> topic1.findElement(By.cssSelector("p")).getText().equals("Việc làm")).findFirst()
				.orElse(null);
		topic.click();
		driver.findElement(By.xpath("//div[@class='sc-12fxoq3-7 bJOETV mb-scroll-y']/div[.=\"Việc tìm người\"]"))
				.click();
		driver.findElement(By.xpath("(//div[@class='sc-5fp63n-5 fOhFor'])[2]")).click();
		a.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Nhập để tìm Tỉnh/Thành']"))).click()
				.sendKeys("HCM").build().perform();
		driver.findElement(By.xpath("//div[@class='sc-12qow75-2 kEyocY'][1]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-5fp63n-5 fOhFor'])[3]")).click();
		a.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Nhập để tìm Quận/Huyện']"))).click()
				.sendKeys("7").build().perform();
		driver.findElement(By.xpath("//div[@class='sc-12qow75-2 kEyocY'][1]")).click();
		driver.findElement(By.xpath("//input[@name='company']")).sendKeys("CÔNG TY CỔ PHẦN CÔNG NGHỆ TIÊN PHONG ");
		driver.findElement(By.xpath("(//div[@class='sc-5fp63n-5 fOhFor'])[4]")).click();
		a.moveToElement(driver.findElement(By.xpath("//input[@placeholder='Nhập để tìm Ngành nghề']"))).click()
				.sendKeys("Công nghệ ").build().perform();
		driver.findElement(By.xpath("(//div[@class='sc-12qow75-2 kEyocY'])[1]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-5fp63n-5 fOhFor'])[5]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-12qow75-2 kEyocY'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='vacancies']")).sendKeys("1");
		driver.findElement(By.xpath("(//div[@class='sc-5fp63n-5 fOhFor'])[6]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-12qow75-2 kEyocY'])[4]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-5fp63n-5 fOhFor'])[7]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-12qow75-2 kEyocY'])[5]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-5fp63n-5 fOhFor'])[8]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-12qow75-2 kEyocY'])[1]")).click();
		driver.findElement(By.cssSelector("input[name='min_salary']")).sendKeys("18000000");
		driver.findElement(By.cssSelector("input[name='max_salary']")).sendKeys("30000000");
		driver.findElement(By.cssSelector("input[name='min_age']")).sendKeys("25");
		driver.findElement(By.cssSelector("input[name='max_age']")).sendKeys("40");
		driver.findElement(By.xpath("(//div[@class='sc-5fp63n-5 fOhFor'])[9]")).click();
		driver.findElement(By.xpath("(//div[@class='sc-12qow75-2 kEyocY'])[1]")).click();

		// Calendar
		driver.findElement(By.className("react-datepicker-wrapper")).click();
		
		while(!driver.findElement(By.cssSelector("[class=\"react-datepicker-popper\"] [class='react-datepicker__current-month']")).getText().contains("Tháng Mười")) {
		
					driver.findElement(By.cssSelector("[class=\"react-datepicker-popper\"] [aria-label$='Next Month']")).click();
		}
		List<WebElement> dates = driver.findElements(By.cssSelector(".react-datepicker__day"));
		int count = driver.findElements(By.cssSelector(".react-datepicker__day")).size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = driver.findElements(By.cssSelector(".react-datepicker__day")).get(i).getText();
			if(text.equalsIgnoreCase("21")) {
				driver.findElements(By.cssSelector(".react-datepicker__day")).get(i).click();
				break;
			}
		}

		String tilte = "BUSINESS ANALYST- DIGITAL TRANSFORMATION (MIDDLE/SENIOR)";
		// Tin
		driver.findElement(By.cssSelector("input[name='title']"))
				.sendKeys(tilte);
		driver.findElement(By.cssSelector("textarea[name='body']")).sendKeys("Mô tả công việc\r\n"
				+ "ITD Group là tập đoàn đa ngành, hoạt động trong lĩnh vực tích hợp hệ thống.\r\n" + "\r\n"
				+ "Với nhu cầu mạnh mẽ về chuyển đổi số hiện nay, chúng tôi cần tìm thêm đồng đội để cùng mở rộng thị trường.\r\n"
				+ "\r\n" + "Bạn phụ trách phân tích nghiệp vụ hệ thống theo yêu cầu dự án:\r\n" + "\r\n"
				+ "Thu thập thông tin và làm rõ yêu cầu của khách hàng, đội ngũ phát triển sản phẩm để chuyển thành software requirements/functional requirements\r\n"
				+ "Viết các tài liệu đặc tả yêu cầu nghiệp vụ, đặc tả chức năng.\r\n"
				+ "Hỗ trợ xây dựng kịch bản và thực hiện kiểm thử\r\n"
				+ "Truyền đạt nội dung, hỗ trợ cho designers và developers để hoàn thiện sản phẩm.\r\n"
				+ "Yêu cầu ứng viên\r\n" + "Chúng tôi mong đợi ở bạn:\r\n" + "\r\n"
				+ "Tốt nghiệp Đại học ngành Công Nghệ Thông tin hoặc các chuyên ngành khác (có học thêm về BA và làm việc tại các cty trong lĩnh vực IT)\r\n"
				+ "Kỹ năng viết và giao tiếp tốt bằng tiếng Anh\r\n"
				+ "Năng động, chịu áp lực cao trong công việc, sẵn sàng làm việc ngoài giờ\r\n"
				+ "Trung thực, tự tin năng động, trách nhiệm trong công việc\r\n"
				+ "Sáng tạo, tiếp thu nhanh công nghệ mới, đưa ra các cải tiến trong giải pháp và công nghệ\r\n"
				+ "Quyền lợi\r\n" + "Thời gian làm việc: Từ thứ 2 đến thứ 6\r\n"
				+ "Được tham gia vào dự án lớn, quy mô quốc gia\r\n"
				+ "Được tiếp cận với sản phẩm/ giải pháp mới với công nghệ hiện đại\r\n"
				+ "Công ty có ngân sách dành riêng cho cá nhân học tập, phát triển bản thân\r\n"
				+ "Quản lý và đánh giá hiệu quả công việc theo mô hình Agile/ OKR linh hoạt\r\n"
				+ "Địa điểm làm việc: ITD Building- Quận 7)");
		
		driver.findElement(By.cssSelector("button[class='sc-f1un1v-4 etAArU']")).click();

		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='content'] p[class='title']")).getText(), tilte);
		driver.quit();		

	}

	private static void sleep(int time) {
		try {
			Thread.sleep(time);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
	}
}
