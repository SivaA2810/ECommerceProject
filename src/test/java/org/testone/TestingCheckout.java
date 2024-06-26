package org.testone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebElement;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class TestingCheckout extends ProjectSpecification{
	@Test
	public void testCase007()throws Exception {
		FileReader reader = new FileReader("C:\\Users\\HP\\Eclipse workspace new\\BestBuy_Evaluation\\src\\main\\resources\\testData.properties");
		Properties prop = new Properties();
		prop.load(reader);
		A_HomePage obj = new A_HomePage(driver);
		
		
		obj.checkoutpage().getAddtocartmainbtn().click();
		obj.checkoutpage().getCheckoutboxbtn().click();
		
		obj.checkoutpage().getGuest().click();
		obj.scrolldown();
		obj.checkoutpage().getGiveemail().sendKeys("email");
		obj.checkoutpage().getGivephno().sendKeys(prop.getProperty("phno"));
		
		
		obj.checkoutpage().getConfirmcheckbox().click();
		obj.checkoutpage().getSumbitbtn().click();
		
		WebElement ccnumber = obj.checkoutpage().getCcnumber();
		obj.waituntilelementtoclick(ccnumber);
		ccnumber.sendKeys(prop.getProperty("ccnumber"));
		obj.checkoutpage().getFirstname().sendKeys(prop.getProperty("firstname"));
		obj.checkoutpage().getLastname().sendKeys(prop.getProperty("lastname"));
		obj.checkoutpage().getAdress().sendKeys(prop.getProperty("adress"));
		obj.checkoutpage().getCity().sendKeys(prop.getProperty("city"));
		WebElement state = obj.checkoutpage().getState();
		obj.dropdownselectbyvalue(state, "TX");
		

	}
}