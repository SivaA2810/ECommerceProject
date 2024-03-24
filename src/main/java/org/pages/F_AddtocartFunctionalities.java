package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class F_AddtocartFunctionalities extends ProjectSpecification {

	public F_AddtocartFunctionalities(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	
	}
	@FindBy(id="gh-search-input")
	private WebElement searchBox;
	
	@FindBy(xpath="//button[@title='submit search']")
	private WebElement submitbtn;
	
	@FindBy(xpath="//a[text()='Samsung - Galaxy S24 256GB (Unlocked) - Cobalt Violet']")
	private WebElement mobile;
	
	@FindBy(xpath="//button[@data-sku-id='6570268']")
	private WebElement addtocartmobile;
	
	@FindBy(xpath="//button[@class='c-button-link continue-shopping']")
	private WebElement continueshoping;
	
	@FindBy(xpath="(//a[@href='/site/apple-macbook-pro-14-laptop-m3-pro-chip-18gb-memory-14-core-gpu-512gb-ssd-latest-model-space-black/6534615.p?skuId=6534615'])[2]")
	private WebElement latop;
	
	@FindBy(xpath="(//button[@data-sku-id='6534615'])[1]")
	private WebElement addtocartlaptop;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public void setSearchBox(WebElement searchBox) {
		this.searchBox = searchBox;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public void setSubmitbtn(WebElement submitbtn) {
		this.submitbtn = submitbtn;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public void setMobile(WebElement mobile) {
		this.mobile = mobile;
	}

	public WebElement getAddtocartmobile() {
		return addtocartmobile;
	}

	public void setAddtocartmobile(WebElement addtocartmobile) {
		this.addtocartmobile = addtocartmobile;
	}

	public WebElement getContinueshoping() {
		return continueshoping;
	}

	public void setContinueshoping(WebElement continueshoping) {
		this.continueshoping = continueshoping;
	}

	public WebElement getLatop() {
		return latop;
	}

	public void setLatop(WebElement latop) {
		this.latop = latop;
	}

	public WebElement getAddtocartlaptop() {
		return addtocartlaptop;
	}

	public void setAddtocartlaptop(WebElement addtocartlaptop) {
		this.addtocartlaptop = addtocartlaptop;
	}
	
	
		
	
	
	
	
}
