package StepDefinitions;

import java.awt.Desktop.Action;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.Select;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTableStepDefination {
	WebDriver driver;
	Action aBuilder;

	@Given("^user on contact page$")
	public void user_on_contact_page() {

		System.setProperty("webdriver.chrome.driver", "E:\\Java\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();

		// System.setProperty("webdriver.gecko.driver","E:\\Java\\SeleniumJars\\geckodriver.exe");

		// driver = new FirefoxDriver();
		driver.get("https://help.smartsheet.com/contact/smartsheetapp");
		// driver.findElement(By.id("CybotCookiebotDialogBodyButtonAccept")).click();

	}

	@When("^Check the page title$")
	public void check_the_page_title() {
		String title = driver.getTitle();
		Assert.assertEquals("Contact Smartsheet Application | Smartsheet Learning Center", title);

	}

	@Then("^Enter contact informations$")
	public void enter_contact_informations(DataTable data) {
		List<List<String>> contactData = data.raw();
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement cat = driver
				.findElement(By.id("edit-please-choose-a-category-that-best-describes-your-reason-for-con"));

		Select select = new Select(cat);
		int i = Integer.parseInt(contactData.get(0).get(0));
		select.selectByIndex(i);

		driver.findElement(By.xpath("(//input[@form='coveo-dummy-form'])[2]")).sendKeys(contactData.get(0).get(1));
		driver.findElement(By.xpath("//textarea[@id='edit-message']")).sendKeys(contactData.get(0).get(2));
		driver.findElement(By.id("edit-your-name")).sendKeys(contactData.get(0).get(3));
		driver.findElement(By.id("edit-email")).sendKeys(contactData.get(0).get(4));
		driver.findElement(By.id("edit-phone-number")).sendKeys(contactData.get(0).get(5));

	}

	@Then("^user click on submit button$")
	public void user_click_on_submit_button() throws InterruptedException {
		JavascriptExecutor jr = (JavascriptExecutor) driver;

		WebElement submit = driver.findElement(By.xpath("//div[@id='edit-actions']"));

		jr.executeScript("scroll(63,2000)");
		Thread.sleep(2000);
		submit.click();

	}

	@Then("^confirm the submit message$")
	public void confirm_the_submit_message() {

		String msg = driver.findElement(By.xpath("//div[@class='webform-confirmation__message']/h1")).getText();
		Assert.assertEquals("Thank you for contacting us", msg);

	}
	@Then("^close the contact page browser$")
	public void close_the_contact_page_browser()  {
	    driver.quit();
	    
	}

}
