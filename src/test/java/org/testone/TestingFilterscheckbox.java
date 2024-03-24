package org.testone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebElement;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class TestingFilterscheckbox extends ProjectSpecification{
	
	@Test
	public void testCase009() throws Exception {
		FileReader reader = new FileReader("C:\\Users\\HP\\Eclipse workspace new\\BestBuy_Evaluation\\src\\main\\resources\\testData.properties");
		Properties prop = new Properties();
		prop.load(reader);
		
		A_HomePage obj = new A_HomePage(driver);
		obj.filtercheckboxs().getSearchBox().sendKeys(prop.getProperty("data"));
		obj.filtercheckboxs().getSubmitbtn().click();
		//obj.filtercheckboxs().getRamcapacity64gb().click();
		
		WebElement ramcapacity32gb = obj.filtercheckboxs().getRamcapacity32gb();
		obj.positionigelement(ramcapacity32gb);
		ramcapacity32gb.click();
		obj.filtercheckboxs().getRamcapacity16gb().click();
		obj.filtercheckboxs().getProcessertypei9().click();
		obj.filtercheckboxs().getMinprice().sendKeys(prop.getProperty("min"));
		obj.filtercheckboxs().getMaxprice().sendKeys(prop.getProperty("max"));
		obj.filtercheckboxs().getEnter().click();
		obj.filtercheckboxs().getTouchScreen().click();
		obj.filtercheckboxs().getKeyboard().click();
		obj.filtercheckboxs().getConnectivity().click();
		obj.filtercheckboxs().getTwoinonedesign().click();
		obj.filtercheckboxs().getFrontCamera().click();
		obj.filtercheckboxs().getBluetooth().click();
		obj.filtercheckboxs().getMicrophone().click();
		obj.filtercheckboxs().getWindows().click();
		obj.filtercheckboxs().getNewcondition().click();
		obj.filtercheckboxs().getOpenboxcodition().click();
		obj.filtercheckboxs().getGrapicscard().click();
		obj.filtercheckboxs().getToprated().click();
		obj.filtercheckboxs().getFourstar().click();
		obj.filtercheckboxs().getMemory120gb().click();
		obj.filtercheckboxs().getMemory250gb().click();
		obj.filtercheckboxs().getMemory500gb().click();
		obj.filtercheckboxs().getMemory1tb().click();
		obj.filtercheckboxs().getMemory2tb().click();
	}

}
