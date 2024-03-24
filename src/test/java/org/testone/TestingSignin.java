package org.testone;

import org.base.ProjectSpecification;
import org.pages.A_HomePage;
import org.testng.annotations.Test;

public class TestingSignin extends ProjectSpecification{
	String correctemail = "sivadot2810@gmail.com";
	
@Test(dataProvider="ReadfromExcel")
public void testcase001(String firstname,String lastname,String email,String password,String confirmpass,String mobileno) {
	A_HomePage obj = new A_HomePage(driver);
	
	obj.accountCreation().getAccountCreation().click();
	obj.accountCreation().getCreateBtn().click();
	obj.accountCreation().getFirstname().sendKeys(firstname);
	obj.accountCreation().getLastName().sendKeys(lastname);
	obj.accountCreation().getEmail().sendKeys(email);
	obj.accountCreation().getPassWord().sendKeys(password);
	obj.accountCreation().getConfirmPassword().sendKeys(confirmpass);
	obj.accountCreation().getPhoneNum().sendKeys(mobileno);
	obj.accountCreation().getAccountrecoverycheckbox().click();
	if(email.equals(correctemail)) {
	obj.accountCreation().getSubmitBtn().click();	
	}
	
}
	
	
	
	
}
