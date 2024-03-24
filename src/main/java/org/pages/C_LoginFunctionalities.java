package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class C_LoginFunctionalities extends ProjectSpecification{
	public C_LoginFunctionalities(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}	
	@FindBy(xpath="(//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg'])[1]")
	private WebElement chooseCountry;
	
	@FindBy(xpath="//span[@class='v-p-right-xxs line-clamp']")
	private WebElement accountButton;
	
	@FindBy(xpath="//a[@class='c-button c-button-secondary c-button-sm sign-in-btn']")
	private WebElement signInBtn;
	
	@FindBy(id="fld-e")
	private WebElement email;
	
	@FindBy(id="fld-p1")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement submitBtn;

	public WebElement getChooseCountry() {
		return chooseCountry;
	}

	public WebElement getAccountButton() {
		return accountButton;
	}

	public WebElement getSignInBtn() {
		return signInBtn;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitBtn() {
		return submitBtn;
	}
	
	
	
	
	
	
}
