package stepdefs;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

	WebDriver driver= HooksClass.driver;
	
	@Given("I have launched the application")
	public void i_have_launched_the_application() {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
	}

	@When("I enter the username as {string} and Password as {string}")
	public void i_enter_the_username_as_and_Password_as(String str1, String str2) {
	    // Write code here that turns the phrase above into concrete actions
		 WebElement username = driver.findElement(By.id("user-name"));
		 WebElement password = driver.findElement(By.id("password"));
	   username.sendKeys(str1);
	   password.sendKeys(str2);
	   
	}

	@When("I click on the Login Button")
	public void i_click_on_the_Login_Button() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement Button = driver.findElement(By.id("login-button"));
		 Button.click();
	}

	@Then("I should land on the home page")
	public void i_should_land_on_the_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		WebElement logo = driver.findElement(By.xpath("//span[@class = 'title']"));
		Assert.assertTrue(logo.isDisplayed());
	}

	@When("I enter the incorrect username as {string} and Password as {string}")
	public void i_enter_the_incorrect_username_as_and_Password_as(String str1, String str2) {
	    // Write code here that turns the phrase above into concrete actions
	 WebElement username = driver.findElement(By.id("user-name"));
		 WebElement password = driver.findElement(By.id("password"));
		   username.sendKeys(str1);
		   password.sendKeys(str2);
	}

	@Then("I should get the error message {string}")
	public void i_should_get_the_error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
		WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
		String err= error.getText();
		Assert.assertTrue(err.equals(string));
		
	}
}
