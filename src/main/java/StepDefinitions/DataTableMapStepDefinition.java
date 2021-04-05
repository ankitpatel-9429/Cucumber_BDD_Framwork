package StepDefinitions;

import java.awt.Desktop.Action;

import java.util.Map;

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

public class DataTableMapStepDefinition {

	static WebDriver driver;
	Action aBuilder;
	public static void user_click_on_submit_button() throws InterruptedException {
		JavascriptExecutor jr = (JavascriptExecutor) driver;

		WebElement submit = driver.findElement(By.xpath("//div[@id='edit-actions']"));

		jr.executeScript("scroll(63,2000)");
		Thread.sleep(2000);
		submit.click();

	}

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
	public void enter_contact_informations(DataTable data) throws InterruptedException {
		driver.manage().window().maximize();

		for (Map<String, String> contactData : data.asMaps(String.class, String.class)) {

			WebElement cat = driver
					.findElement(By.id("edit-please-choose-a-category-that-best-describes-your-reason-for-con"));

			Select select = new Select(cat);
			int i = Integer.parseInt(contactData.get("cat"));
			select.selectByIndex(i);

			driver.findElement(By.xpath("(//input[@form='coveo-dummy-form'])[2]")).sendKeys(contactData.get("subject"));
			driver.findElement(By.xpath("//textarea[@id='edit-message']")).sendKeys(contactData.get("message"));
			driver.findElement(By.id("edit-your-name")).sendKeys(contactData.get("name"));
			driver.findElement(By.id("edit-email")).sendKeys(contactData.get("email"));
			driver.findElement(By.id("edit-phone-number")).sendKeys(contactData.get("phono"));

			user_click_on_submit_button();
			driver.navigate().back();
			driver.navigate().refresh();

		}

	}

	
	@Then("^close the contact page browser$")
	public void close_the_contact_page_browser() {
		driver.quit();

	}

}
