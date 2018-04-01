package com.cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.business.Box_Login_business;
import com.business.Box_NewFolder_business;
import com.config.GetTestProperties;

public class Box_NewFolder_case extends TestBase{
	
	
	@Test()
	public void Box_Login_Page() throws Exception{
		
		driver.get(GetTestProperties.getTestUrl());
		driver.findElement(By.id("user_slug")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("123456");
		driver.findElement(By.id("submit_button")).click();
		
		Box_NewFolder_business bnb =new Box_NewFolder_business(driver);
		bnb.NewFolder("嘻嘻");
	}
}
