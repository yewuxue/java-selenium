package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Box_Login_page{
	
	private WebDriver driver;
	public  Box_Login_page(WebDriver driver){
		this.driver = driver;
	}
	
	//定位账号
	public void setusername(String user_slug) throws NotFoundException{
		this.setText(driver.findElement(By.id("user_slug")),user_slug);
	}

	
	//定位密码
	public void setpassword(String pwd)throws NotFoundException{
		this.setText(driver.findElement(By.id("pwd")),pwd);
	}
	
	//定位点击登录按钮
	public void clickButton() throws NotFoundException {
		driver.findElement(By.id("submit_button")).click();
	}
	
	private void setText(WebElement e,String text)
	{
		e.sendKeys(text);
	}
}
