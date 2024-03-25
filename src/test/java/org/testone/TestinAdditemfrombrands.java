package org.testone;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebElement;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class TestinAdditemfrombrands extends ProjectSpecification{

	@Test
	public void testCase010() {
	
		A_HomePage obj = new A_HomePage(driver);
		
		obj.addthingsfrombrands().getMenu().click();
		obj.addthingsfrombrands().getBrandbtn().click();
		obj.addthingsfrombrands().getMicrosoft().click();
		obj.addthingsfrombrands().getDesktop().click();
		
		WebElement desktopbtn = obj.addthingsfrombrands().getDesktopbtn();
		obj.positionigelement(desktopbtn);
		desktopbtn.click();
		obj.scrolldown();
		WebElement addtocartbtn = obj.addthingsfrombrands().getAddtocartbtn();
		obj.waituntilelementtoclick(addtocartbtn);
		addtocartbtn.click();
		
		obj.addthingsfrombrands().getContinuetoshoping().click();
}
}
