package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class E_BottommenuFunctionalities extends ProjectSpecification {

	public E_BottommenuFunctionalities(WebDriver driver) {	
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="(//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg'])[1]")
	private WebElement chooseCountry;
	
	@FindBy(xpath="//a[@data-track='ft_legal']")
	private WebElement accessibility;
	
	@FindBy(xpath="//a[@data-track='ft_legal_terms_conditions']")
	private WebElement termscondition;
	
	@FindBy(xpath="//a[@data-track='ft_legal_privacy']")
	private WebElement privacy;

	@FindBy(xpath="//a[@data-track='ft_legal_interest_based_ads']")
	private WebElement InterestBased;
	
	@FindBy(xpath="//a[@data-track='ft_legal_state_privacy_rights']")
	private WebElement stateprivacy;
	
	@FindBy(xpath="//a[@data-track='ft_legal_health_data_privacy']")
	private WebElement healthdataprivacy;
	
	@FindBy(xpath="//a[@data-track='ft_legal_do_not_sell_personal_info']")
	private WebElement donotcell;
	
	@FindBy(xpath="//a[@data-track='ft_legal_limit_use_sensitive_personal_info']")
	private WebElement limituse;

	
	public WebElement getChooseCountry() {
		return chooseCountry;
	}

	public WebElement getAccessibility() {
		return accessibility;
	}

	public WebElement getTermscondition() {
		return termscondition;
	}

	public WebElement getPrivacy() {
		return privacy;
	}

	public WebElement getInterestBased() {
		return InterestBased;
	}

	public WebElement getStateprivacy() {
		return stateprivacy;
	}

	public WebElement getHealthdataprivacy() {
		return healthdataprivacy;
	}

	public WebElement getDonotcell() {
		return donotcell;
	}

	public WebElement getLimituse() {
		return limituse;
	}
	
	
	
	
}
