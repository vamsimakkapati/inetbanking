package com.inetbanking.pageobjests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;//local variable
	
	//Constructor
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
				PageFactory.initElements(rdriver, this);
		
	}
	    //element finding
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtUserName;
	
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnlogin;
	
	//Action Methods 
	 public  void setusername(String uname) //uname is parameter
	   {
		 txtUserName.sendKeys(uname);
		 
	 }
	 public  void setpassword(String pwd) 
	   {
		 txtpassword.sendKeys(pwd);
		 
	 }
	 
	 public void clicksubmit()
	 {
		 btnlogin.click(); 
	 }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
