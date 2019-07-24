package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccessPage {
	
	public WebElement getCstId() {
		return cstId;
	}

	

	@FindBy(xpath="//h3[text()='287047']")
	private WebElement cstId;
}
