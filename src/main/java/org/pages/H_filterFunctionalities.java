package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class H_filterFunctionalities extends ProjectSpecification{
	
	public H_filterFunctionalities(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver,this);
	
	}
	@FindBy(id="gh-search-input")
	private WebElement searchBox;
	
	@FindBy(xpath="//button[@title='submit search']")
	private WebElement submitbtn;
	
	@FindBy(id="systemmemoryram_facet-64-gigabytes-0")
	private WebElement ramcapacity64gb;
	
	@CacheLookup
	@FindBy(id="systemmemoryram_facet-32-gigabytes-1")
	private WebElement ramcapacity32gb;
	
	@FindBy(id="systemmemoryram_facet-16-gigabytes-2")
	private WebElement ramcapacity16gb;
	
	@FindBy(id="[id=parent_processormodelsv_facet-Intel-Core-i9-1]")
	private WebElement processertypei9;
	
	@FindBy(id="//input[@aria-label='Minimum Price']")
	private WebElement minprice;
	
	@FindBy(id="//input[@aria-label='Maximum Price']")
	private WebElement maxprice;
	
	@FindBy(id="//button[@aria-label='Apply Price Range']")
	private WebElement enter;
	
	@FindBy(id="features_facet-Touch-Screen-0")
	private WebElement touchScreen;
	
	@FindBy(id="features_facet-Backlit-Keyboard-1")
	private WebElement Keyboard;
	
	@FindBy(id="features_facet-Wireless-Connectivity-2")
	private WebElement Connectivity;
	
	@FindBy(id="features_facet-2-in-1-Design-3")
	private WebElement twoinonedesign;
	
	@FindBy(id="Front-Facing Camera")
	private WebElement frontCamera;

	@FindBy(id="features_facet-Bluetooth-5")
	private WebElement Bluetooth;

	@FindBy(id="features_facet-Built-In-Microphone-6")
	private WebElement microphone;
	
	@FindBy(id="features_facet-Built-for-Windows-Ink-7")
	private WebElement windows;
	
	@FindBy(id="condition_facet-New-0")
	private WebElement newcondition;
	
	@FindBy(id="condition_facet-Open-Box-1")
	private WebElement openboxcodition;
	
	@FindBy(id="graphicscardsv_facet-NVIDIA-GeForce-RTX-4060-0")
	private WebElement grapicscard;
	
	@FindBy(id="customerreviews_facet-Top-Rated-0")
	private WebElement toprated;
	
	@FindBy(id="customerreviews_facet-5-1")
	private WebElement fourstar;
	
	@FindBy(id="totalstoragecapacityrange_facet-120-GB-and-up-0")
	private WebElement memory120gb;
	
	@FindBy(id="totalstoragecapacityrange_facet-250-GB-and-up-1")
	private WebElement memory250gb;
	
	@FindBy(id="totalstoragecapacityrange_facet-500-GB-and-up-2")
	private WebElement memory500gb;
	
	@FindBy(id="totalstoragecapacityrange_facet-1-TB-and-up-3")
	private WebElement memory1tb;
	
	@FindBy(id="totalstoragecapacityrange_facet-2-TB-and-up-4")
	private WebElement memory2tb;

	@FindBy(id="currentoffers_facet-Plus-&-Total-Member-Deals-0")
	private WebElement currentdeal;
	
	@FindBy(id="currentoffers_facet-On-Sale-1")
	private WebElement onsale;
	
	@FindBy(id="currentoffers_facet-Free-Shipping-Eligible-2")
	private WebElement freeshiping;

	@FindBy(id="currentoffers_facet-Clearance-3")
	private WebElement clearancesale;
	
	@FindBy(name="Screen Resolution")
	private WebElement Resolution;
	
	@FindBy(id="gpubrand_facet-NVIDIA-0")
	private WebElement gpuType;
	
	@FindBy(id="inputsoutputs_facet-USB-Port(s)-0")
	private WebElement usbport;
	
	@FindBy(id="inputsoutputs_facet-Headphone-Jack-1")
	private WebElement headphone;
	
	@FindBy(id="inputsoutputs_facet-Thunderbolt-Input(s)-2")
	private WebElement thunderbolt;
	
	@FindBy(id="storagetype_facet-SSD-0")
	private WebElement typeofmemorystorage;
	
	@FindBy(id="modelfamily_facet-Microsoft-Surface-Laptop-Studio-2-0")
	private WebElement microsoftfamily;
	
	@FindBy(id="modelfamily_facet-Microsoft-Surface-Laptop-Studio-1")
	private WebElement microsoftfamily2;
	
	@FindBy(id="percentdiscount_facet-All-Discounted-Items-0")
	private WebElement alldiscount;
	
	@FindBy(id="percentdiscount_facet-20%-Off-or-More-1")
	private WebElement discount80;

	public WebElement getSearchBox() {
		return searchBox;
	}

	public WebElement getSubmitbtn() {
		return submitbtn;
	}

	public WebElement getRamcapacity64gb() {
		return ramcapacity64gb;
	}

	public WebElement getRamcapacity32gb() {
		return ramcapacity32gb;
	}

	public WebElement getRamcapacity16gb() {
		return ramcapacity16gb;
	}

	public WebElement getProcessertypei9() {
		return processertypei9;
	}

	public WebElement getMinprice() {
		return minprice;
	}

	public WebElement getMaxprice() {
		return maxprice;
	}

	public WebElement getEnter() {
		return enter;
	}

	public WebElement getTouchScreen() {
		return touchScreen;
	}

	public WebElement getKeyboard() {
		return Keyboard;
	}

	public WebElement getConnectivity() {
		return Connectivity;
	}

	public WebElement getTwoinonedesign() {
		return twoinonedesign;
	}

	public WebElement getFrontCamera() {
		return frontCamera;
	}

	public WebElement getBluetooth() {
		return Bluetooth;
	}

	public WebElement getMicrophone() {
		return microphone;
	}

	public WebElement getWindows() {
		return windows;
	}

	public WebElement getNewcondition() {
		return newcondition;
	}

	public WebElement getOpenboxcodition() {
		return openboxcodition;
	}

	public WebElement getGrapicscard() {
		return grapicscard;
	}

	public WebElement getToprated() {
		return toprated;
	}

	public WebElement getFourstar() {
		return fourstar;
	}

	public WebElement getMemory120gb() {
		return memory120gb;
	}

	public WebElement getMemory250gb() {
		return memory250gb;
	}

	public WebElement getMemory500gb() {
		return memory500gb;
	}

	public WebElement getMemory1tb() {
		return memory1tb;
	}

	public WebElement getMemory2tb() {
		return memory2tb;
	}

	public WebElement getCurrentdeal() {
		return currentdeal;
	}

	public WebElement getOnsale() {
		return onsale;
	}

	public WebElement getFreeshiping() {
		return freeshiping;
	}

	public WebElement getClearancesale() {
		return clearancesale;
	}

	public WebElement getResolution() {
		return Resolution;
	}

	public WebElement getGpuType() {
		return gpuType;
	}

	public WebElement getUsbport() {
		return usbport;
	}

	public WebElement getHeadphone() {
		return headphone;
	}

	public WebElement getThunderbolt() {
		return thunderbolt;
	}

	public WebElement getTypeofmemorystorage() {
		return typeofmemorystorage;
	}

	public WebElement getMicrosoftfamily() {
		return microsoftfamily;
	}

	public WebElement getMicrosoftfamily2() {
		return microsoftfamily2;
	}

	public WebElement getAlldiscount() {
		return alldiscount;
	}

	public WebElement getDiscount80() {
		return discount80;
	}
	
	
	
	
	}

	


