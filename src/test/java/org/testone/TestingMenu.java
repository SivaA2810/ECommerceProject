package org.testone;

import org.base.ProjectSpecification;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class TestingMenu extends ProjectSpecification{
String page1="Top Deals and Featured Offers on Electronics - Best Buy";
String page2="Deal of the Day: Electronics Deals - Best Buy";
String page3="Yes, Best Buy Sells That – Best Buy";
String page4="Best Buy Credit Card: Rewards & Financing";
String page5="Gifts Cards and E-Gift Cards - Best Buy"; 
String page6="Gift Ideas 2024: Best Gifts to Give This Year - Best Buy";

	@Test
	public void testCase003() {
	
	A_HomePage obj = new A_HomePage(driver);
	
	
	obj.menu().getTopdeals().click();
	String tle1 = obj.pageTitle();System.out.println(tle1);
	if(tle1.equals(page1)) {
		obj.pageBack();
	
	}
	
	obj.menu().getDealofday().click();
	String tle2 = obj.pageTitle();System.out.println(tle2);
	if(tle2.equals(page2)) {
		obj.pageBack();
	}
	
	obj.menu().getBestbuysellyes().click();
	String tle3 = obj.pageTitle();System.out.println(tle3);
	if(tle3.equals(page3)) {
		obj.pageBack();
	}
	
	obj.menu().getMoreBtn().click();
	obj.menu().getCreditcrd().click();
	String tle4 = obj.pageTitle();System.out.println(tle4);
	if(tle4.equals(page4)) {
		obj.pageBack();
	}
	
	obj.menu().getMoreBtn().click();
	obj.menu().getGiftcard().click();
	String tle5 = obj.pageTitle();System.out.println(tle5);
	if(tle5.equals(page5)) {
		obj.pageBack();
	}
	
	obj.menu().getMoreBtn().click();
	obj.menu().getGiftIdeas().click();
	String tle6 = obj.pageTitle();System.out.println(tle6);
	if(tle6.equals(page6)) {
		obj.pageBack();
	
}
}
}
