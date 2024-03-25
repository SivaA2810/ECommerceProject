package org.pages;

import org.base.ProjectSpecification;
import org.openqa.selenium.WebDriver;

public class A_HomePage extends ProjectSpecification{
	
	public A_HomePage(WebDriver driver) {
	this.driver=driver;
	}
	
	public  B_CreateAccountFunctionalities accountCreation() {
	return new B_CreateAccountFunctionalities(driver);
	}
	
	public C_LoginFunctionalities login() {
	return new C_LoginFunctionalities(driver);
	}
	
	public D_MenuFunctionalities menu() {
	return new D_MenuFunctionalities(driver);
	}
	
	public E_BottommenuFunctionalities bottommenu() {
	return new E_BottommenuFunctionalities(driver);
	}
	
	public F_AddtocartFunctionalities addtocart() {
	return new F_AddtocartFunctionalities(driver);
	
	}
	
	public G_Checkoutpage checkoutpage() {
	return new G_Checkoutpage(driver);
	
	}
	
	public H_filterFunctionalities filtercheckboxs() {
	return new H_filterFunctionalities(driver);
	}
	
	public FA_AdditemFrommenu addthingsfrommenu() {
	return new FA_AdditemFrommenu(driver);
	}
	
	public FB_additemfromBrands addthingsfrombrands() {
		return new FB_additemfromBrands(driver);
		}
	
	
}
