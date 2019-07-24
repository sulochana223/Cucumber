package stepdefinition;

import cucumber.api.java.en.Then;
import junit.framework.Assert;
import objectrepository.AccessPage;

public class AccessPageSteps {
	@Then("the user should see the customer Id Generated")
	public void the_user_should_see_the_customer_Id_Generated() {
		AccessPage accPg = new AccessPage();
		Assert.assertTrue(accPg.getCstId().isDisplayed());
	}
	

}
