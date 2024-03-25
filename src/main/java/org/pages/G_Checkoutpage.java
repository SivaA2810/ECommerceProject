package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class G_Checkoutpage extends ProjectSpecification{


	public G_Checkoutpage(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//span[@class='cart-label']")
	private WebElement addtocartmainbtn;
	
	@FindBy(xpath="//button[@data-track='Checkout - Top']")
	private WebElement checkoutboxbtn;
	
	@FindBy(xpath="//button[@class='c-button c-button-secondary c-button-lg cia-guest-content__continue guest']")
	private WebElement guest;
	
	@FindBy(name="emailAddress")
	private WebElement giveemail;
	
	@FindBy(id="user.phone")
	private WebElement givephno;
	
	@FindBy(id="text-updates")
	private WebElement confirmcheckbox;
	
	@FindBy(xpath="//button[@class='btn btn-lg btn-block btn-secondary']")
	private WebElement sumbitbtn;

	
	@FindBy(id="number")
	private WebElement ccnumber;
	
	@FindBy(id="first-name")
	private WebElement firstname;
	
	@FindBy(id="last-name")
	private WebElement lastname;
	
	@FindBy(id="address-input")
	private WebElement adress;
	
	@FindBy(id="city")
	private WebElement city;
	
	@FindBy(id="state")
	private WebElement state;
	
	@FindBy(id="postalCode")
	private WebElement postalCode;

	public WebElement getAddtocartmainbtn() {
		return addtocartmainbtn;
	}

	public WebElement getCheckoutboxbtn() {
		return checkoutboxbtn;
	}

	public WebElement getGuest() {
		return guest;
	}

	public WebElement getGiveemail() {
		return giveemail;
	}

	public WebElement getGivephno() {
		return givephno;
	}

	public WebElement getConfirmcheckbox() {
		return confirmcheckbox;
	}

	public WebElement getSumbitbtn() {
		return sumbitbtn;
	}

	public WebElement getCcnumber() {
		return ccnumber;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAdress() {
		return adress;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getPostalCode() {
		return postalCode;
	}
	
	

	
	
	
	
	
	
	
}

