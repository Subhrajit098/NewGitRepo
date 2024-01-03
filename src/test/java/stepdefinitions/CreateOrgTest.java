package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateOrgTest {
	
	
	WebDriver driver;
	
	@Given("I want to launch the browser")
	public void i_want_to_launch_the_browser() {
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	@Given("I want to load the URL")
	public void i_want_to_load_the_url() {
	    driver.get("http://localhost:8888/");
	}
	@When("login page is displayed provide the Username and Password")
	public void login_page_is_displayed_provide_the_username_and_password() {
	    driver.findElement(By.name("user_name")).sendKeys("admin");
	    driver.findElement(By.name("user_password")).sendKeys("admin");
	}
	@When("Click on login")
	public void click_on_login() {
	    driver.findElement(By.id("submitButton")).click();
	}
	@When("Home page is displayed")
	public void home_page_is_displayed() {
	    driver.findElement(By.linkText("Organizations")).click();
	}
	@Then("Click on create org feature")
	public void click_on_create_org_feature() {
	    driver.findElement(By.xpath("//img[@alt='Create Organization...']")).click();
	    driver.findElement(By.name("accountname")).sendKeys("System");
	    driver.findElement(By.xpath("//input[@title='Save [Alt+S]']")).click();
	}
	@Then("validate created id")
	public void validate_created_id() {
		String expTitle = "[ ACC32 ] System -  Organization Information";
		System.out.println(expTitle);
	    String actTitle=driver.getTitle();
	    System.out.println(actTitle);
	    assertEquals(expTitle, actTitle);
	    
	    
	}
	

}
