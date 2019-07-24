package stepdefinition;

import cucumber.api.java.en.Given;
import objectrepository.HomePage;

public class HomePageSteps {
	@Given("the user is in add customer page")
	public void the_user_is_in_add_customer_page() {
	    HomePage page = new HomePage();
	    page.getLnk_addCustomer().click();
	    
	}
	@Given("the user is in Add Tariff Plan Page")
	public void the_user_is_in_Add_Tariff_Plan_Page() {
		HomePage page = new HomePage();
		page.getLnk_addTariffPlan().click();
	    
	}
}
