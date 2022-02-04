package stepDefinition;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//data tables with maps:for paramaterization of test casexc


public class DealStepWithMapDefinition {
	WebDriver driver;
	
	@Given("^user is already on Login Page$")
	public void user_already_on_login_page() {

		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://freecrm.com/");

	}

	@When("^title of login page is Free CRM$")
	public void title_of_login_page_is_Free_CRM() {
		String title = driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
	}

	@Then("^user enters email and password$")
	public void user_enters_email_and_enters_password(DataTable credentials) throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
		Thread.sleep(4000);
		 for(Map<String, String>data :credentials.asMaps(String.class,String.class)) {
			 
		driver.findElement(By.name("email")).sendKeys(data.get("email"));
		driver.findElement(By.name("password")).sendKeys(data.get("password"));
	}
	}
	
	@Then("^user clicks on login button$")
	public void user_Clicks_on_login_button() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(@class,'submit')]")).click();
		Thread.sleep(4000);
	}

	@Then("^user moves to new deal page$")
	public void user_moves_to_new_deal_page() throws InterruptedException {
		 driver.findElement(By.xpath("//div[@id='main-nav']/div[5]//button")).click();
		 Thread.sleep(4000);
		 driver.getWindowHandle();
	}

	@Then("^user enters deal details$")
	public void user_enters_contacts_details(DataTable dealData) {
		for(Map<String, String> data :dealData .asMaps(String.class,String.class)) {
			
		
		driver.findElement(By.name("title")).sendKeys(data.get("title"));
		driver.findElement(By.name("amount")).sendKeys(data.get("amount"));
		driver.findElement(By.name("probability")).sendKeys(data.get("probability"));
		driver.findElement(By.name("commission")).sendKeys(data.get("commission"));
		
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	}
	}

	@Then("^close the browser$")
	public void close_the_browser() {
		//driver.quit();
	}

}
