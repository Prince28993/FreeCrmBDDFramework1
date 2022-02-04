//package stepDefinition;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class LoginStepDefinition {
//
//	WebDriver driver;
//	
//	@Given("^User is already on Login Page$")
//	public void user_already_on_login_page() {
//		
//		System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		driver.get("https://freecrm.com/");
//
//	}
//	
//	@When("^title of login page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM()  {
//	   String title = driver.getTitle();
//	   System.out.println(title);
//	   Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
//	}
//	//reg expe
//	//\"(.*)\"
//	
//	@Then("^user enters \"(.*)\" and \"(.*)\"$")
//	public void user_enters_username_and_enters_password(String username ,String password) throws InterruptedException{
//		driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
//		Thread.sleep(4000);
//	    driver.findElement(By.name("email")).sendKeys(username);
//	    driver.findElement(By.name("password")).sendKeys(password);
//	}
//	@Then("^user Clicks on login button$")
//	public void user_Clicks_on_login_button() {
//		driver.findElement(By.xpath("//div[contains(@class,'submit')]")).click();
//		
//	}
//	
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() {
//		
//	
//	}
//	
//	@Then("^user enters contact details \"(.*)\" and \"(.*)\" and \"(.*)\"$")
//	public void user_enters_contacts_details(String firstname,String lastname,String position) {
//	}
//	
//	
//	@Then("^Close the browser$")
//	public void close_the_browser() {
//		driver.quit();
//	}
//	
//}
