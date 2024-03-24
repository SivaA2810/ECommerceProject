package org.testone;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.base.ProjectSpecification;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class TestingLogin extends ProjectSpecification{
	
@Test	
public void testCase002() throws Exception {
	FileReader reader = new FileReader("C:\\Users\\HP\\Eclipse workspace new\\BestBuy_Evaluation\\src\\main\\resources\\testData.properties");
	Properties prop = new Properties();
	prop.load(reader);
	
	A_HomePage obj = new A_HomePage(driver);
	

	obj.login().getAccountButton().click();
	obj.login().getSignInBtn().click();
	obj.login().getEmail().sendKeys(prop.getProperty("username"));
	obj.login().getPassword().sendKeys(prop.getProperty("password"));
	obj.login().getSubmitBtn().click();
	
	

}
}
