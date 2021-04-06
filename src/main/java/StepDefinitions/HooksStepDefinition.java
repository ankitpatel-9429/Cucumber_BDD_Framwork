//package StepDefinitions;
//
//import java.util.List;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.After;
//import cucumber.api.java.Before;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//
//public class HooksStepDefinition {
//
//	WebDriver driver;
//	Actions aBuilder;
//
//	@Before
//	public void setUp() {
//		System.setProperty("webdriver.chrome.driver", "E:\\Java\\SeleniumJars\\chromedriver.exe");
//		driver = new ChromeDriver();
//		driver.get("https://www.flipkart.com/account/login");
//
//		driver.findElement(By.xpath("//div[@class='IiD88i _351hSN']/input[1]")).sendKeys("patel_ankit20@yahoo.com");
//		driver.findElement(By.xpath("(//div[@class='IiD88i _351hSN']/input)[2]")).sendKeys("Erpa_1992");
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
//
//	}
//
//	@After
//	public void tearDown() {
//		driver.quit();
//
//	}
//
//	@Given("^User on home page$")
//	public void user_on_home_page() throws InterruptedException {
//		Thread.sleep(4000);
//		String title = driver.getTitle();
//		Assert.assertEquals(
//				"Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!",
//				title);
//
//	}
//
//	@Then("^verify username$")
//	public void verify_username() throws InterruptedException {
//		Thread.sleep(3000);
//		boolean uname = driver.findElement(By.xpath("//div[contains(text(),'Ankit')]")).isDisplayed();
//		Assert.assertTrue(uname);
//	}
//
//	@Given("^User go on more options$")
//	public void user_go_on_more_options() throws InterruptedException {
//		aBuilder = new Actions(driver);
//
//		Thread.sleep(4000);
//
//		aBuilder.moveToElement(driver.findElement(By.xpath("//div[@class='go_DOp'][2]"))).build().perform();
//
//	}
//
//	@Then("^verify more manue options$")
//	public void verify_more_manue_options() throws InterruptedException {
//
//		List<WebElement> moreOptions = driver.findElements(By.xpath("//ul[@class='pO9syL']/li"));
//		int i = moreOptions.size();
//		Assert.assertEquals(5, i);
//		for (WebElement e : moreOptions) {
//			System.out.println(e.getText());
//		}
//
//	}
//
//}
