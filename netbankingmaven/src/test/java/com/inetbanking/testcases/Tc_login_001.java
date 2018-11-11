package com.inetbanking.testcases;



import org.testng.annotations.Test;
import com.inetbanking.pageobjests.LoginPage;


public class Tc_login_001  extends Baseclass{
	
	
	
	@Test
	public void logintest() 
	{
		Driver.get(baseURL);
		logger.info("open browser");
		LoginPage lp=new LoginPage(Driver);
		lp.setusername(username);
		logger.info(" Username Entered");
		lp.setpassword(password);
		logger.info(" Password Enter");
		lp.clicksubmit();
	
	/*if(Driver.getTitle().equals(" Guru99 Bank Manager HomePage "))
	{
		Assert.assertTrue(true);
	}
	else {
		Assert.assertTrue(false);
	}*/	 
	
	}
}


