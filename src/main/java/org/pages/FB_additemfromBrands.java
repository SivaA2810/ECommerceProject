package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_additemfromBrands extends ProjectSpecification{
	
	public FB_additemfromBrands(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@aria-controls='flyout-container']")
	private WebElement menu;
	
	@FindBy(xpath="//button[@data-id='node-81']")
	private WebElement brandbtn;
	
	@FindBy(xpath="//a[text()='Microsoft']")
	private WebElement microsoft;
	
	@FindBy(xpath="//img[@alt='All-in-one PC']")
	private WebElement desktop;
	
	@FindBy(xpath="//a[contains(text(),'Lenovo - IdeaCentre 3i Desktop - Celeron G6900 - 8GB Memory - 256GB SSD - Cloud Grey')]")
	private WebElement desktopbtn;
	
	@FindBy(xpath="(//button[@data-sku-id='6535561'])[1]")
	private WebElement addtocartbtn;
	
	@FindBy(xpath="//button[@class='c-button-link continue-shopping']")
	private WebElement continuetoshoping;

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getBrandbtn() {
		return brandbtn;
	}

	public WebElement getMicrosoft() {
		return microsoft;
	}

	public WebElement getDesktop() {
		return desktop;
	}

	public WebElement getDesktopbtn() {
		return desktopbtn;
	}

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}

	public WebElement getContinuetoshoping() {
		return continuetoshoping;
	}
	

	
	
}
