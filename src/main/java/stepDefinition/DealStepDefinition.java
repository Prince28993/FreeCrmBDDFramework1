//package stepDefinition;
//
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class DealStepDefinition {
//
//WebDriver driver;
//	
//@Given("^user is already on Login Page$")
//public void user_already_on_login_page() {
//
//	System.setProperty("webdriver.gecko.driver", "C:\\SeleniumJars\\geckodriver.exe");
//	driver = new FirefoxDriver();
//	driver.get("https://freecrm.com/");
//
//}
//
//@When("^title of login page is Free CRM$")
//public void title_of_login_page_is_Free_CRM() {
//	String title = driver.getTitle();
//	System.out.println(title);
//	Assert.assertEquals("#1 Free CRM customer relationship management software cloud", title);
//}
//
//@Then("^user enters email and password$")
//public void user_enters_email_and_enters_password(DataTable credentials) throws InterruptedException {
//	driver.findElement(By.xpath("//span[contains(text(),'Log In')]")).click();
//	Thread.sleep(4000);
//	List<List<String>> data = credentials.raw();
//	driver.findElement(By.name("email")).sendKeys(data.get(0).get(0));
//	driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//}
//
//@Then("^user clicks on login button$")
//public void user_Clicks_on_login_button() throws InterruptedException {
//	driver.findElement(By.xpath("//div[contains(@class,'submit')]")).click();
//	Thread.sleep(4000);
//}
//
//@Then("^user moves to new deal page$")
//public void user_moves_to_new_deal_page() throws InterruptedException {
//	 driver.findElement(By.xpath("//div[@id='main-nav']/div[5]//button")).click();
//	 Thread.sleep(4000);
//	 
//}
//
//@Then("^user enters deal details$")
//public void user_enters_contacts_details(DataTable dealData) throws InterruptedException {
//	List<List<String>> dealValues = dealData.raw();
//	driver.findElement(By.name("title")).sendKeys(dealValues.get(0).get(0));
//	driver.findElement(By.name("amount")).sendKeys(dealValues.get(0).get(1));
//	driver.findElement(By.name("probability")).sendKeys(dealValues.get(0).get(2));
//	driver.findElement(By.name("commission")).sendKeys(dealValues.get(0).get(3));
//	Thread.sleep(3000);
//}
//
//@Then("^close the browser$")
//public void close_the_browser() {
//	driver.quit();
//}
//
//
//
//
//}
