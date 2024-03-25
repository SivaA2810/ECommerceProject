package org.testone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebElement;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class TestingAddtocart extends ProjectSpecification{

@Test
public void testCase005() throws Exception {
	FileReader reader = new FileReader("C:\\Users\\HP\\Eclipse workspace new\\BestBuy_Evaluation\\src\\main\\resources\\testData.properties");
	Properties prop = new Properties();
	prop.load(reader);
	
	A_HomePage obj = new A_HomePage(driver);
	obj.addtocart().getSearchBox().sendKeys(prop.getProperty("phone"));
	obj.addtocart().getSubmitbtn().click();
	obj.addtocart().getMobile().click();
	obj.scrolldown();
	
	WebElement addtocartmobile = obj.addtocart().getAddtocartmobile();
	obj.positionigelement(addtocartmobile);
	addtocartmobile.click();
	
	WebElement continueshoping = obj.addtocart().getContinueshoping();
	obj.waituntilelementtoclick(continueshoping);
	continueshoping.click();
	
	obj.addtocart().getSearchBox().sendKeys(prop.getProperty("laptop"));
	obj.addtocart().getSubmitbtn().click();
	obj.addtocart().getLatop().click();
	obj.scrolldown();
	
	WebElement addtocartlaptop = obj.addtocart().getAddtocartlaptop();
	obj.positionigelement(addtocartlaptop);
	addtocartlaptop.click();
	
	WebElement continueshoping2 = obj.addtocart().getContinueshoping();
	obj.waituntilelementtoclick(continueshoping);
	continueshoping2.click();

	obj.checkoutpage().getAddtocartmainbtn().click();
	obj.checkoutpage().getCheckoutboxbtn().click();
	
	WebElement guest = obj.checkoutpage().getGuest();
	obj.waituntilelementtoclick(guest);
	guest.click();
	obj.scrolldown();
	
	WebElement giveemail = obj.checkoutpage().getGiveemail();
	obj.positionigelement(giveemail);
	giveemail.sendKeys(prop.getProperty("email"));
	
	obj.checkoutpage().getGivephno().sendKeys(prop.getProperty("phno"));
	
	obj.checkoutpage().getConfirmcheckbox().click();
	obj.checkoutpage().getSumbitbtn().click();
	
}
	
	
}

