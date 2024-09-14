package Stepdefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignUp_step_defination {
    public WebDriver driver;
	@Given("I click on Try for free button")
	public void i_click_on_try_for_free_button() {
		driver.findElement(By.id("signup_link")).click();
	    
	}

	@Then("I verify sign up page is displyed")
	public void i_verify_sign_up_page_is_displyed() {
    Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"start-your-free-trial\"]")).isDisplayed());

	}

	@When("I enter the name {name}")
	public void i_enter_the_name(String name) {
		driver.findElement(By.id("UserFirstName-Vrsp")).sendKeys(name);
	    
	}

	@When("I enter the surname {string}")
	public void i_enter_the_surname(String surname) {
		driver.findElement(By.id("UserLastName-gVpJ")).sendKeys(surname);
	   
	}

	@When("I enter the email address {string}")
	public void i_enter_the_email_address(String address) {
     driver.findElement(By.id("UserEmail-vW9K")).sendKeys(address);
		
	}

	@When("I select the employee from dropdown")
	public void i_select_the_employee_from_dropdown() {
		WebElement dropdown = driver.findElement(By.id("CompanyEmployees-5bRb"));
		Select s = new Select(dropdown);
		s.selectByIndex(1);
	  
	}

	@When("I click on sign up button")
	public void i_click_on_sign_up_button() {

	}

	@Then("I validate that the error messege should be displyed")
	public void i_validate_that_the_error_messege_should_be_displyed() {
	  
	}



	
	
}
