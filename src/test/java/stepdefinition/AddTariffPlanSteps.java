package stepdefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import objectrepository.AddTariffPlan;

public class AddTariffPlanSteps {
	@When("the user fills the valid tariff plan details {string},{string},{string},{string},{string},{string}")
	public void the_user_fills_the_valid_tariff_plan_details(String monthRent, String freeLocal, String freeIntMin, String freeSMS, String localCharges, String interCharges, String smsCharges) {
		AddTariffPlan accTarfPlan = new AddTariffPlan();
		accTarfPlan.getMonthRent().sendKeys(monthRent);
		accTarfPlan.getLocalMin().sendKeys(freeLocal);
		accTarfPlan.getIntMin().sendKeys(freeIntMin);
		accTarfPlan.getSmsPck().sendKeys(freeSMS);
		accTarfPlan.getLocMinCrgs().sendKeys(localCharges);
		accTarfPlan.getIntChrgs().sendKeys(interCharges);
		accTarfPlan.getSmsCrgs().sendKeys(smsCharges);
	}
	@When("the user clicks the submit button")
	public void the_user_clicks_the_submit_button() {
		AddTariffPlan accTarfPlan = new AddTariffPlan();
		accTarfPlan.getSubmit().click();
	}
	@Then("the user shoould see the success message")
	public void the_user_shoould_see_the_success_message() {
		AddTariffPlan accTarfPlan = new AddTariffPlan();
		Assert.assertTrue(accTarfPlan.getSuccessMsg().isDisplayed());
	}
}
