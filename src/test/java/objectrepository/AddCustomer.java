package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import stepdefinition.Hooks;

public class AddCustomer {
	public AddCustomer() {
PageFactory.initElements(Hooks.driver,this);
}
@FindBy(xpath="//label[text()='Done']")
private WebElement done;

@FindBy(id="fname")
private WebElement fname;

@FindBy(id="lname")
private WebElement lname;

@FindBy(id="email")
private WebElement email;

@FindBy(name="addr")
private WebElement addr;

@FindBy(id="telephoneno")
private WebElement telephoneno;

@FindBy(name="submit")
private WebElement btnsubmit;

@FindBy(xpath="//label[text()='Email-ID is not valid']")
private WebElement inValidEmail;

@FindBy(xpath="//input[@type='reset']")
private WebElement btnReset;

public WebElement getErrMsg() {
	return inValidEmail;
}


public WebElement getBtnReset() {
	return btnReset;
}

public WebElement getinValidEmail() {
	return inValidEmail;
} 

public WebElement getBtnsubmit() {
	return btnsubmit;
} 
public WebElement getTelephoneN() {
	return telephoneno;
} 

public WebElement getEmail() {
	return email;
} 

public WebElement getLstName() {
	return lname;
} 

public WebElement getFstName() {
	return fname;
}

public WebElement getDone() {
	return done;
}

public WebElement getAddr() {
	return addr;
}

































}
