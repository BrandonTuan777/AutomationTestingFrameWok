package TDT.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TDT.AbstractComponents.AbstractComponent;

public class NewsPage extends AbstractComponent {
	WebDriver driver;

	public NewsPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//button[@class=\"sc-5fp63n-6 jEGfcq\"]")
	WebElement buttonTopic;

	@FindBy(xpath = "//div[@class=\"sc-12fxoq3-4 hyuWUa\"]")
	List<WebElement> topics;

	@FindBy(xpath = "//div[@class='sc-12fxoq3-7 bJOETV mb-scroll-y']/div[.=\"Việc tìm người\"]")
	WebElement recruitment_Topic;

	@FindBy(xpath = "(//div[@class='sc-5fp63n-5 fOhFor'])[2]")
	WebElement table_provinces;

	By search_provinces = By.xpath("//input[@placeholder='Nhập để tìm Tỉnh/Thành']");

	@FindBy(xpath = "(//div[@class='sc-5fp63n-5 fOhFor'])[3]")
	WebElement districts;
	By search_district = By.xpath("//input[@placeholder='Nhập để tìm Quận/Huyện']");

	@FindBy(xpath = "//input[@name='company']")
	WebElement companyName;

	@FindBy(xpath = "(//div[@class='sc-5fp63n-5 fOhFor'])[4]")
	WebElement careers;

	By career_search = By.xpath("//input[@placeholder='Nhập để tìm Ngành nghề']");

	@FindBy(xpath = "(//div[@class='sc-5fp63n-5 fOhFor'])[5]")
	WebElement natural_of_work;

	@FindBy(xpath = "//input[@name='vacancies']")
	WebElement vacancies;
	//
	@FindBy(xpath = "(//div[@class='sc-5fp63n-5 fOhFor'])[6]")
	WebElement experience;
	@FindBy(xpath = "(//div[@class='sc-5fp63n-5 fOhFor'])[7]")
	WebElement educational_level;
	@FindBy(xpath = "(//div[@class='sc-5fp63n-5 fOhFor'])[8]")
	WebElement way_of_payment;

	@FindBy(css = "input[name='min_salary']")
	WebElement min_salary;

	@FindBy(css = "input[name='max_salary']")
	WebElement max_salary;

	@FindBy(css = "input[name='min_age']")
	WebElement min_age;

	@FindBy(css = "input[name='max_age']")
	WebElement max_age;

	@FindBy(xpath = "(//div[@class='sc-5fp63n-5 fOhFor'])[9]")
	WebElement sex;

	public List<WebElement> getTopicsList() {
		return topics;
	}

	public WebElement getTopicByName(String topicName) {
		WebElement topic = getTopicsList().stream()
				.filter(topic1 -> topic1.findElement(By.cssSelector("p")).getText().equals(topicName)).findFirst()
				.orElse(null);
		return topic;
	}
	
	

	@FindBy(className = "react-datepicker-wrapper")
	WebElement dealine_submission;

	@FindBy(css = "[class=\"react-datepicker-popper\"] [class='react-datepicker__current-month']")
	WebElement month;

	@FindBy(css = "[class=\"react-datepicker-popper\"] [aria-label$='Next Month']")
	WebElement next_month_button;

	@FindBy(css = ".react-datepicker__day")
	List<WebElement> days;
	
	@FindBy(css = "input[name='title']")
	WebElement title;
	
	@FindBy(css = "textarea[name='body']")
	WebElement describe;
	
//	driver.findElement(By.cssSelector("button[class='sc-f1un1v-4 etAArU']")).click();
	@FindBy(css = "button[class='sc-f1un1v-4 etAArU']")
	WebElement submit_button;
	
	
	String tilte_content ="BUSINESS ANALYST- DIGITAL TRANSFORMATION(MIDDLE/SENIOR)";
	String describe_content ="Mô tả công việc\r\n"
			+ "ITD Group là tập đoàn đa ngành, hoạt động trong lĩnh vực tích hợp hệ thống.\r\n"
			+ "\r\n"
			+ "Với nhu cầu mạnh mẽ về chuyển đổi số hiện nay, chúng tôi cần tìm thêm đồng đội để cùng mở rộng thị trường.\r\n"
			+ "\r\n"
			+ "Bạn phụ trách phân tích nghiệp vụ hệ thống theo yêu cầu dự án:\r\n"
			+ "\r\n"
			+ "Thu thập thông tin và làm rõ yêu cầu của khách hàng, đội ngũ phát triển sản phẩm để chuyển thành software requirements/functional requirements\r\n"
			+ "Viết các tài liệu đặc tả yêu cầu nghiệp vụ, đặc tả chức năng.\r\n"
			+ "Hỗ trợ xây dựng kịch bản và thực hiện kiểm thử\r\n"
			+ "Truyền đạt nội dung, hỗ trợ cho designers và developers để hoàn thiện sản phẩm.\r\n"
			+ "Yêu cầu ứng viên\r\n"
			+ "Chúng tôi mong đợi ở bạn:\r\n"
			+ "\r\n"
			+ "Tốt nghiệp Đại học ngành Công Nghệ Thông tin hoặc các chuyên ngành khác (có học thêm về BA và làm việc tại các cty trong lĩnh vực IT)\r\n"
			+ "Kỹ năng viết và giao tiếp tốt bằng tiếng Anh\r\n"
			+ "Năng động, chịu áp lực cao trong công việc, sẵn sàng làm việc ngoài giờ\r\n"
			+ "Trung thực, tự tin năng động, trách nhiệm trong công việc\r\n"
			+ "Sáng tạo, tiếp thu nhanh công nghệ mới, đưa ra các cải tiến trong giải pháp và công nghệ\r\n"
			+ "Quyền lợi\r\n"
			+ "Thời gian làm việc: Từ thứ 2 đến thứ 6\r\n"
			+ "Được tham gia vào dự án lớn, quy mô quốc gia\r\n"
			+ "Được tiếp cận với sản phẩm/ giải pháp mới với công nghệ hiện đại\r\n"
			+ "Công ty có ngân sách dành riêng cho cá nhân học tập, phát triển bản thân\r\n"
			+ "Quản lý và đánh giá hiệu quả công việc theo mô hình Agile/ OKR linh hoạt\r\n"
			+ "Địa điểm làm việc: ITD Building- Quận 7)";


	public void CreateNews() throws InterruptedException {
		buttonTopic.click();
		Thread.sleep(2000);
		getTopicsList();
		getTopicByName("Việc làm").click();
		recruitment_Topic.click();
		table_provinces.click();
		moveElementAndClick(search_provinces, "HCM");
		districts.click();
		moveElementAndClick(search_district, "7");
		companyName.sendKeys("CÔNG TY CỔ PHẦN CÔNG NGHỆ TIÊN PHONG");
		careers.click();
		moveElementAndClick(career_search, "Công nghệ");
		chooseFirstElementAndClick(natural_of_work);
		vacancies.sendKeys("1");
		//
		chooseFourthElementAndClick(experience);
		chooseFifthElementAndClick(educational_level);
		chooseFirstElementAndClick(way_of_payment);
		//
		min_salary.sendKeys("18000000");
		max_salary.sendKeys("30000000");
		min_age.sendKeys("25");
		max_age.sendKeys("40");
		chooseFirstElementAndClick(sex);
		calendarSelect("Tháng Mười","21");
		//
		title.sendKeys(tilte_content);
		describe.sendKeys(describe_content);
		
		submit_button.click();
	}

	public void calendarSelect(String month_pick, String day_pick) {
		dealine_submission.click();
		while (!month.getText().contains(month_pick)) {

			next_month_button.click();
		}
		
		int count = days.size();
		System.out.println(count);
		for (int i = 0; i < count; i++) {
			String text = days.get(i).getText();
			if (text.equalsIgnoreCase(day_pick)) {
				days.get(i).click();
				break;
			}
		}
	}
	
	public String tileNew() {
		return tilte_content;
	}
}
