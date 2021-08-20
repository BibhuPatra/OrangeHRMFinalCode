package step_definitions;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import com.test_runner.Orangehrmpagefactory;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class Test_steps {
	private WebDriver driver;
	private Orangehrmpagefactory orange;
	XSSFWorkbook wb;
    XSSFSheet sh;

	@Before
	public void openBrowser() throws Exception{
		//launching web browser....
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		orange=new Orangehrmpagefactory(driver);
		driver.manage().window().maximize();
		
		//using pagefactory file as reference....
		orange=PageFactory.initElements(driver, Orangehrmpagefactory .class);
		
		//reading file from excel....
		FileInputStream fread=new FileInputStream("./exceldata/orangehrm_cucumber.xlsx");
		wb=new XSSFWorkbook(fread);
	}


	@Given("user is on login page")
	public void user_is_on_login_page() {
		System.out.println("User is on Login Page");
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
	}

	@When("user do not enter username and password")
	public void user_do_not_enter_username_and_password() {
		System.out.println("user do not enter username and password");
		sh=wb.getSheet("Sheet1");
		orange.setUname("");
		orange.setPassword("");
	}

	@When("click on login button")
	public void click_on_login_button() {
		System.out.println("hi");
		orange.clickLogin();
	}

	@Then("Alert username should not be empty")
	public void alert_username_should_not_be_empty() {
		System.out.println("Alert username should not be empty");
	}

	@Then("close")
	public void close() throws InterruptedException {
		Thread.sleep(2000);
		System.out.println("Closing the Browser");
		driver.close();
	}

	@When("user entered username")
	public void user_entered_username() {
		System.out.println("username");
		sh=wb.getSheet("Sheet1");
		orange.setUname(sh.getRow(2).getCell(0).getStringCellValue());
		orange.setPassword("");
	}

	@Then("Alert password should not be  empty")
	public void alert_password_should_not_be_empty() {
		System.out.println("Alert password should not be  empty");
	}

	@When("user entered password")
	public void user_entered_password() {
		System.out.println("user entered password");
		sh=wb.getSheet("Sheet1");
		orange.setUname("");
		orange.setPassword(sh.getRow(3).getCell(1).getStringCellValue());
	}

	@Then("Alert username  should not be  empty")
	public void alert_username_should_not_be_empty1() {
		System.out.println("Alert username  should not be  empty");
	}

	@When("user  entered invalid  username and password")
	public void user_entered_invalid_username_and_password() {
		System.out.println("user  entered invalid  username and password");
		sh=wb.getSheet("Sheet1");
		orange.setUname(sh.getRow(4).getCell(0).getStringCellValue());
		orange.setPassword(sh.getRow(4).getCell(1).getStringCellValue());
	}

	@Then("Alert invalid credentials")
	public void alert_invalid_credentials() {
		System.out.println("Alert invalid credentials");
	}

	@When("user entered valid username and password")
	public void user_entered_valid_username_and_password() {
		System.out.println("user entered valid username and password");
		sh=wb.getSheet("Sheet1");
		orange.setUname(sh.getRow(5).getCell(0).getStringCellValue());
		orange.setPassword(sh.getRow(5).getCell(1).getStringCellValue());

	}

	@Then("navigate user to welcome page")
	public void navigate_user_to_welcome_page() throws InterruptedException {
		System.out.println("navigate user to welcome page");
		Thread.sleep(2000);

	}

	@When("user enters valid username and password")
	public void user_enters_valid_username_and_password() {
		System.out.println("user enters valid username and password");
		sh=wb.getSheet("Sheet2");
		orange.setUname(sh.getRow(1).getCell(0).getStringCellValue());
		orange.setPassword(sh.getRow(1).getCell(1).getStringCellValue());

	}

	@Then("user navigate to welcome page")
	public void user_navigate_to_welcome_page() throws InterruptedException {
		System.out.println("navigates to welcome page");
		Thread.sleep(2000);
	}

	@Then("user navigate to search page")
	public void user_navigate_to_search_page() throws InterruptedException {
		System.out.println("search page open");
		orange.clickPIM();
		Thread.sleep(2000);

	}

	@When("user enters wrong employee name")
	public void user_enters_wrong_employee_name() {
		System.out.println("wrong name");
		sh=wb.getSheet("Sheet2");
		orange.enterEname(sh.getRow(1).getCell(2).getStringCellValue());


	}

	@When("click on search button")
	public void click_on_search_button() {
		orange.clickSearch();
	}

	@Then("Display no records")
	public void display_no_records() {
		System.out.println("Display no records");
	}

	@When("user enters wrong employee id")
	public void user_enters_wrong_employee_id() {
		System.out.println("wrong id ");
		sh=wb.getSheet("Sheet2");
		orange.enterId(sh.getRow(2).getCell(3).getStringCellValue());

	}

	@When("user enters invalid employee details")
	public void user_enters_invalid_employee_details() {
		System.out.println("invalid");
		sh=wb.getSheet("Sheet2");
		orange.enterEname(sh.getRow(3).getCell(2).getStringCellValue());
		orange.enterId(sh.getRow(3).getCell(3).getStringCellValue());

	}

	@When("user enters valid  employee details")
	public void user_enters_valid_employee_details() {
		System.out.println("valid details");
		sh=wb.getSheet("Sheet2");
		orange.enterEname(sh.getRow(4).getCell(2).getStringCellValue());
		orange.enterId(sh.getRow(4).getCell(3).getStringCellValue());

	}

	@Then("Display all records")
	public void display_all_records() {
		System.out.println("Display all records");
	}

	@Then("user navigate to  add page")
	public void user_navigate_to_add_page() throws InterruptedException {
		orange.clickPIM();
		Thread.sleep(2000);
		orange.clickAdd();
}

	@When("user enters data without first name")
	public void user_enters_data_without_first_name() {
		System.out.println("user enters data without first name");
		sh=wb.getSheet("Sheet3");
		orange.enterFirstName1("");
		orange.enterLastName1(sh.getRow(1).getCell(3).getStringCellValue());
	}

	@When("click on save  button")
	public void click_on_save_button() {
		System.out.println("clicking save button");
		orange.clickSave();
	}

	@Then("Alert fill required fields")
	public void alert_fill_required_fields() {
		System.out.println("Alert fill required fields");
	}

	@When("user enters data without last  name")
	public void user_enters_data_without_last_name() {
		System.out.println("user enters data without last  name");
		sh=wb.getSheet("Sheet3");
		orange.enterFirstName1(sh.getRow(2).getCell(2).getStringCellValue());
		orange.enterLastName1("");

	}

	@When("user enters data with existing employee id")
	public void user_enters_data_with_existing_employee_id() {
		System.out.println("user enters data with existing employee id");
		sh=wb.getSheet("Sheet3");
		orange.enterFirstName1(sh.getRow(3).getCell(2).getStringCellValue());
		orange.enterLastName1(sh.getRow(3).getCell(3).getStringCellValue());
		orange.clearid();
		orange.enteremployeeid(sh.getRow(3).getCell(4).getStringCellValue());

	}

	@Then("Alert cannot be saved...Already employee exists")
	public void alert_cannot_be_saved_Already_employee_exists() {
		System.out.println("Alert cannot be saved...Already employee exists");
	}

	@When("user enters data with valid employee details")
	public void user_enters_data_with_valid_employee_details() {
		System.out.println("user enters data with valid employee details");
		sh=wb.getSheet("Sheet3");
		orange.enterFirstName1(sh.getRow(4).getCell(2).getStringCellValue());
		orange.enterLastName1(sh.getRow(4).getCell(3).getStringCellValue());

	}

	@Then("navigate to profile page")
	public void naviagte_to_profile_page() {
		System.out.println("navigate to profile page");

	}
	@Then("user navigates to welcome page")
	public void user_navigates_to_welcome_page() {
		System.out.println("user navigates to welcome page");
	}

	@Then("user navigates to delete page")
	public void user_navigates_to_delete_page() throws InterruptedException {
		System.out.println("user navigates to delete page");
		orange.clickPIM();
		Thread.sleep(3000);
	}

	@Then("user search for valid employee name")
	public void user_search_for_valid_employee_name() {
		System.out.println("user search for valid employee name");
		sh=wb.getSheet("Sheet4");
		orange.enterEname(sh.getRow(1).getCell(2).getStringCellValue());
	}

	@Then("user clicks checkbox")
	public void user_clicks_checkbox() {
		orange.clickCheckBox1();
	}

	@Then("user click on delete button")
	public void user_click_on_delete_button() {
		orange.clickDelete();
	}

	@Then("click on ok in dialog box")
	public void click_on_ok_in_dialog_box() {
		orange.clickDialogueBoxOk();
	}

	@Then("Display successfully deleted")
	public void display_successfully_deleted() {
		System.out.println("Display successfully deleted");
	}

}	