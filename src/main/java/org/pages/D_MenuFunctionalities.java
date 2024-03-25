package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class D_MenuFunctionalities extends ProjectSpecification{

	public D_MenuFunctionalities(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	@FindBy(xpath="(//img[@src='https://www.bestbuy.com/~assets/bby/_intl/landing_page/images/maps/usa.svg'])[1]")
	private WebElement chooseCountry;
	
	@FindBy(xpath="//a[@data-lid='hdr_td_topdeals']")
	private WebElement topdeals;
	
	@FindBy(xpath="//a[@data-lid='hdr_dotd']")
	private WebElement dealofday;
	
	@FindBy(xpath="//a[@data-lid='hdr_finds']")
	private WebElement bestbuysellyes;
	
	@FindBy(xpath="//button[@data-lid='hdr_utility_more']")
	private WebElement moreBtn;
	
	@FindBy(xpath="(//a[text()='Credit Cards'])[2]")
	private WebElement creditcrd;
	
	@FindBy(xpath="(//a[text()='Gift Cards'])[2]")
	private WebElement giftcard;
	
	@FindBy(xpath="(//a[text()='Gift Ideas'])[2]")
	private WebElement giftIdeas;
	
	public WebElement getChooseCountry() {
		return chooseCountry;
	}

	public WebElement getTopdeals() {
		return topdeals;
	}

	public WebElement getDealofday() {
		return dealofday;
	}

	public WebElement getBestbuysellyes() {
		return bestbuysellyes;
	}

	public WebElement getMoreBtn() {
		return moreBtn;
	}
	
	public WebElement getCreditcrd() {
		return creditcrd;
	}

	public WebElement getGiftcard() {
		return giftcard;
	}

	public WebElement getGiftIdeas() {
		return giftIdeas;
	}
	
	
	
	
}
