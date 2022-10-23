package stepdefs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Then;

public class HomePageStepDefs {
	
	
	  WebDriver driver= HooksClass.driver;
	  
	@Then("Add this product into cart {string}")
	public void add_this_product_into_cart(String ProductName) {
	    // Write code here that turns the phrase above into concrete actions
     WebElement AddtoCartButton= driver.findElement(By.xpath("//div[text()= '"+ProductName +"']/parent::a/parent::div/following-sibling::div/button"));
		
		AddtoCartButton.click();
	}
}
