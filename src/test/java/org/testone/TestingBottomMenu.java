package org.testone;

import org.base.ProjectSpecification;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class TestingBottomMenu extends ProjectSpecification{
	String page1="Accessibility - Best Buy";
	String page2="BestBuy.com Terms and Conditions";
	String page3="Privacy Policy Hub - Best Buy";
	String page4="Interest-Based Ads - Best Buy";
	String page5="State Privacy Rights - Best Buy";
	String page6="Privacy Policy Hub - Best Buy";
	String page7="Start Request - Best Buy";
	String page8="Best Buy";
			
	
@Test
private void testCase004() {
	A_HomePage obj = new A_HomePage(driver);
	
	obj.scrolldown();
	obj.bottommenu().getAccessibility().click();
	String title1 = obj.pageTitle();System.out.println(title1);
	if(title1.equals(page1)) {
		obj.pageBack();
	}
		
	obj.bottommenu().getTermscondition().click();
	String title2 = obj.pageTitle();System.out.println(title2);
	if(title2.equals(page2)) {
		obj.pageBack();
	}
	
	obj.bottommenu().getPrivacy().click();
	String title3 = obj.pageTitle();System.out.println(title3);
	if(title3.equals(page3)) {
		obj.pageBack();
	}
	
	obj.bottommenu().getInterestBased().click();
	String title4 = obj.pageTitle();System.out.println(title4);
	if(title4.equals(page4)) {
		obj.pageBack();
	}
	obj.bottommenu().getStateprivacy().click();
	String title5 = obj.pageTitle();System.out.println(title5);
	if(title5.equals(page5)) {
		obj.pageBack();
	}
	
	obj.bottommenu().getHealthdataprivacy().click();
	String title6 = obj.pageTitle();System.out.println(title6);
	if(title6.equals(page6)) {
		obj.pageBack();
	}
	
	obj.bottommenu().getDonotcell().click();
	String title7 = obj.pageTitle();System.out.println(title7);
	if(title7.equals(page7)) {
		obj.pageBack();
	}
	
	obj.bottommenu().getLimituse().click();
	String title8 = obj.pageTitle();System.out.println(title8);
	if(title8.equals(page8)) {
		obj.pageBack();
	}
		
	
	
	
}
}
