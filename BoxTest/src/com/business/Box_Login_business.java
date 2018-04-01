package com.business;

import org.openqa.selenium.WebDriver;
import com.cases.Box_Login_case;
import com.config.GetTestProperties;
import com.page.Box_Login_page;

public class Box_Login_business extends Box_Login_case {
	
	private WebDriver driver;
	public Box_Login_business(WebDriver driver){
		this.driver=driver;
	}
	
		
	public void Login(String username,String password)throws Exception{
		
		driver.get(GetTestProperties.getTestUrl());
		Box_Login_page blp = new  Box_Login_page(driver);
			blp.setusername(username);   
			blp.setpassword(password);
			blp.clickButton();	
	}
}
