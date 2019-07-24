package objectrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hooks;

public class AddTariffPlan {
public AddTariffPlan()
{
	PageFactory.initElements(Hooks.driver, this);
}
@FindBy(name="rental")
private WebElement monthRent;

@FindBy(name = "local_minutes")
private WebElement localMin;

@FindBy(name="inter_minutes")
private WebElement intMin;

@FindBy(id="sms_pack")
private WebElement smsPck;

@FindBy(id="minutes_charges")
private WebElement locMinCrgs;

@FindBy(id="inter_charges")
private WebElement intChrgs;

@FindBy(id="sms_charges")
private WebElement smsCrgs;

@FindBy(name="submit")
private WebElement submit;

@FindBy(xpath="//h2[text()='Congratulation you add Tariff Plan']")
private WebElement successMsg;

public WebElement getMonthRent() {
	return monthRent;
}

public void setMonthRent(WebElement monthRent) {
	this.monthRent = monthRent;
}

public WebElement getLocalMin() {
	return localMin;
}

public void setLocalMin(WebElement localMin) {
	this.localMin = localMin;
}

public WebElement getIntMin() {
	return intMin;
}

public void setIntMin(WebElement intMin) {
	this.intMin = intMin;
}

public WebElement getSmsPck() {
	return smsPck;
}

public void setSmsPck(WebElement smsPck) {
	this.smsPck = smsPck;
}

public WebElement getLocMinCrgs() {
	return locMinCrgs;
}

public void setLocMinCrgs(WebElement locMinCrgs) {
	this.locMinCrgs = locMinCrgs;
}

public WebElement getIntChrgs() {
	return intChrgs;
}

public void setIntChrgs(WebElement intChrgs) {
	this.intChrgs = intChrgs;
}

public WebElement getSmsCrgs() {
	return smsCrgs;
}

public void setSmsCrgs(WebElement smsCrgs) {
	this.smsCrgs = smsCrgs;
}

public WebElement getSubmit() {
	return submit;
}

public void setSubmit(WebElement submit) {
	this.submit = submit;
}

public WebElement getSuccessMsg() {
	return successMsg;
}

public void setSuccessMsg(WebElement successMsg) {
	this.successMsg = successMsg;
}










}
