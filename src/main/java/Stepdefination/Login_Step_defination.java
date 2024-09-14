package Stepdefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Step_defination {
	
	public WebDriver driver;
	@Given("I inialize the browser")
	public void i_inialize_the_browser() {
		driver = new ChromeDriver();
	   	}

	@When("I enters the URL")
	public void i_enters_the_url() {
		driver.get("https://login.salesforce.com/?locale=in");
	    
	}

	@When("I click on usernametextfield")
	public void i_click_on_usernametextfield() {
		driver.findElement(By.id("username"));

	}

	@Then("I validate the UNTFis enabled")
	public void i_validate_the_unt_fis_enabled() {
		System.out.println(driver.findElement(By.id("username")).isEnabled());
	  
	}




}
