package StepDefinitions;


import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinition {
	WebDriver driver;

	public static Actions aBuilder;

	@Given("^User is on login page$")
	public void user_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Java\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login");

	}

	@When("^Title is login page is flipkart login$")
	public void title_is_login_page_is_flipkart_login() {

		String title = driver.getTitle();
		Assert.assertEquals("Here's the amazing journey that you've had with Flipkart", title);

	}

	@Then("^user enters \"(.*)\" and \"(.*)\"$")
	public void user_enters_username_and_password(String uname, String psd) {
		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[1]")).sendKeys(uname);
		driver.findElement(By.xpath("(//div[@class='IiD88i _351hSN']/input)[2]")).sendKeys(psd);

	}

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();

	}

	@Then("^user redirected to home page$")
	public void user_redirected_ton_home_page() throws InterruptedException {
		Thread.sleep(3000);
		String title = driver.getTitle();
		Assert.assertEquals("Here's the amazing journey that you've had with Flipkart", title);

	}

	@Then("^verify username$")
	public void verify_username() throws InterruptedException {
	
		Thread.sleep(3000);
		
		boolean uname = driver.findElement(By.xpath("//div[contains(text(),'Ankit')]")).isDisplayed();
		Assert.assertTrue(uname);

	}

	@Then("^verify more manue options$")
	public void verify_more_manue_options() throws InterruptedException {
		aBuilder = new Actions(driver);
		Thread.sleep(3000);
		aBuilder.moveToElement(driver.findElement(By.xpath("//div[@class='go_DOp'][2]"))).build().perform();
		List<WebElement> moreOptions = driver.findElements(By.xpath("//ul[@class='pO9syL']/li"));
		int i = moreOptions.size();
		Assert.assertEquals(5, i);
		for (WebElement e : moreOptions) {
			System.out.println(e.getText());
		}

	}

	@Then("^close the browser$")
	public void close_browser() {
		driver.quit();
	}

}
