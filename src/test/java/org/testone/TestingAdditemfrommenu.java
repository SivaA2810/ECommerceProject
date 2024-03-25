package org.testone;

import java.io.File;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebElement;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class TestingAdditemfrommenu extends ProjectSpecification{

	@Test
	public void testCase09() {
		
	A_HomePage obj = new A_HomePage(driver);
	
	obj.addthingsfrommenu().getMenubtn().click();
	obj.addthingsfrommenu().getAudiobtn().click();
	obj.addthingsfrommenu().getHomeAudiobtn().click();
	obj.addthingsfrommenu().getSpeakers().click();
	obj.addthingsfrommenu().getSubwoofer().click();
	
	WebElement sonysubwoofer = obj.addthingsfrommenu().getSonysubwoofer();
	obj.positionigelement(sonysubwoofer);
	sonysubwoofer.click();
	WebElement addtocartbtn = obj.addthingsfrommenu().getAddtocartbtn();
	obj.positionigelement(addtocartbtn);
	addtocartbtn.click();
	obj.addthingsfrommenu().getContinueshopingbtn().click();
	

}
}
