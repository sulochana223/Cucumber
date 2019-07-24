package stepdefinition;



import java.util.Map;

import org.openqa.selenium.Alert;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;
import junit.framework.Assert;
import objectrepository.AddCustomer;

public class AddCustomerSteps {
	@When("the user fills the valid customer details")
	public void the_user_fills_the_valid_customer_details(DataTable customerDetails) {
		AddCustomer accPg = new AddCustomer();
		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		accPg.getDone().click();
		accPg.getFstName().sendKeys(customerDetailsMap.get("firstName"));
		accPg.getLstName().sendKeys(customerDetailsMap.get("lastName"));
		accPg.getEmail().sendKeys(customerDetailsMap.get("emailAddress"));
		accPg.getAddr().sendKeys(customerDetailsMap.get("address"));
		accPg.getTelephoneN().sendKeys(customerDetailsMap.get("phNo"));
	}
	
	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		AddCustomer accPg = new AddCustomer();
		accPg.getBtnsubmit().click();
	}

	@When("the user fills the invalid customer details")
	public void the_user_fills_the_invalid_customer_details(DataTable customerDetails) {
		AddCustomer accPg = new AddCustomer();
		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		accPg.getDone().click();
		accPg.getFstName().sendKeys(customerDetailsMap.get("firstName"));
		accPg.getLstName().sendKeys(customerDetailsMap.get("lastName"));
		accPg.getEmail().sendKeys(customerDetailsMap.get("emailAddress"));
		accPg.getAddr().sendKeys(customerDetailsMap.get("address"));
		accPg.getTelephoneN().sendKeys(customerDetailsMap.get("phNo"));
	    
	}

	@When("the user click the submit button")
	public void the_user_click_the_submit_button() {
		AddCustomer accPg = new AddCustomer();
		accPg.getBtnsubmit().click();
	}

	@Then("the user should see the error message displayed")
	public void the_user_should_see_the_error_message_displayed() {
		AddCustomer accPg = new AddCustomer();
		Assert.assertTrue(accPg.getErrMsg().isDisplayed());	}

	@When("the user missed to fill address customer details")
	public void the_user_missed_to_fill_address_customer_details(DataTable customerDetails) {
		AddCustomer accPg = new AddCustomer();
		Map<String, String> customerDetailsMap = customerDetails.asMap(String.class, String.class);
		accPg.getDone().click();
		accPg.getFstName().sendKeys(customerDetailsMap.get("firstName"));
		accPg.getLstName().sendKeys(customerDetailsMap.get("lastName"));
		accPg.getEmail().sendKeys(customerDetailsMap.get("emailAddress"));
		accPg.getTelephoneN().sendKeys(customerDetailsMap.get("phNo"));
	    
	}

	@When("the user clicks the submit button")
	public void the_user_clk_the_submit_button() {
		AddCustomer accPg = new AddCustomer();
		accPg.getBtnsubmit().click();
	}

	@Then("the user should see the popup message displayed")
	public void the_user_should_see_the_popup_message_displayed() {
	    Alert a = Hooks.driver.switchTo().alert();
	    a.accept();
	}

	@When("the user clicks the reset button")
	public void the_user_clicks_the_reset_button() {
		AddCustomer accPg = new AddCustomer();
		accPg.getBtnReset().click();
	}

	@Then("the user should see the empty fields")
	public void the_user_should_see_the_empty_fields() {
		AddCustomer accPg = new AddCustomer();
		Assert.assertEquals("", accPg.getFstName().getAttribute("value"));
	}


}