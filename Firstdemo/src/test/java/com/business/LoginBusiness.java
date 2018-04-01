package com.business;

import org.openqa.selenium.WebDriver;

import com.cases.LoginCase;
import com.config.GetTestProperties;
import com.page.LoginPage;
import com.util.CommonMethord;

public class LoginBusiness extends LoginCase{
	private WebDriver driver;
	public LoginBusiness(WebDriver driver){
		this.driver=driver;
	}

	public void Login (String username,String element,String local,String password){
		driver.get(GetTestProperties.getTestUrl());
		
		LoginPage lp=new LoginPage(driver);
		lp.UserName(username);
		lp.PassWord(element,local,password);
	}

}
