package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class B_CreateAccountFunctionalities extends ProjectSpecification {
	public B_CreateAccountFunctionalities(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath="(//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg'])[1]")
	private WebElement chooseCountry;
	
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	private WebElement accountCreation;
	
	@FindBy(xpath="//a[@class='c-button c-button-outline c-button-sm create-account-btn']")
	private WebElement createBtn;
	
	@FindBy(id="firstName")
	private WebElement firstname;
	
	@FindBy(id="lastName")
	private WebElement lastName;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="fld-p1")
	private WebElement passWord;
	
	@FindBy(id="reenterPassword")
	private WebElement confirmPassword;
	
	@FindBy(id="phone")
	private WebElement phoneNum;
	
	@FindBy(id="is-recovery-phone")
	private WebElement accountrecoverycheckbox;
	
	@FindBy(id="//button[@type='submit']")
	private WebElement submitBtn;

	public WebElement getChooseCountry() {
		return chooseCountry;
	}

	public WebElement getAccountCreation() {
		return accountCreation;
	}

	public WebElement getCreateBtn() {
		return createBtn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getPhoneNum() {
		return phoneNum;
	}

	public WebElement getAccountrecoverycheckbox() {
		return accountrecoverycheckbox;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
}
