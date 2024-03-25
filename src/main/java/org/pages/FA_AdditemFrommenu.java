package org.pages;
import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FA_AdditemFrommenu extends ProjectSpecification{
	
	public FA_AdditemFrommenu(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//button[@aria-controls='flyout-container']")
	private WebElement menubtn;
	
	@FindBy(xpath="//button[text()='Audio']")
	private WebElement audiobtn;
	
	@FindBy(xpath="//button[@data-id='node-481']")
	private WebElement homeAudiobtn;
	
	@FindBy(xpath="//a[@data-lid='ubr_au_ha_spk']")
	private WebElement speakers;
	
	@FindBy(xpath="(//a[@data-track='[context:widgetType=flex,linkContent=Subwoofers,linkRegion=Body,linkPlacement=c2w1]'])[1]")
	private WebElement subwoofer;
	
	@FindBy(xpath="//a[contains(text(),'Sony - Core Series 10\" 115W')]")
	private WebElement sonysubwoofer;
	
	@FindBy(xpath="//button[@data-button-state='ADD_TO_CART']")
	private WebElement addtocartbtn;
	
	@FindBy(xpath="//button[@class='c-button-link continue-shopping']")
	private WebElement continueshopingbtn;

	public WebElement getMenubtn() {
	return menubtn;
	}

	public WebElement getAudiobtn() {
		return audiobtn;
	}

	public WebElement getHomeAudiobtn() {
		return homeAudiobtn;
	}

	public WebElement getSpeakers() {
		return speakers;
	}

	public WebElement getSubwoofer() {
		return subwoofer;
	}

	public WebElement getSonysubwoofer() {
		return sonysubwoofer;
	}

	public WebElement getAddtocartbtn() {
		return addtocartbtn;
	}

	public WebElement getContinueshopingbtn() {
		return continueshopingbtn;
	}
	
	
	
}

