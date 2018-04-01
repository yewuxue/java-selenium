package com.page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	String UsernameId;
	String UsernameActualElement;
	private WebDriver driver;
	public  LoginPage(WebDriver driver){
		this.driver=driver;
	}
	
	public void UserName(String username){
		this.sendkey(driver.findElement(By.id("input1")), username);
		
	}
	
	public void PassWord(String element,String local,String password){
		//this.sendkey(driver.findElement(By.id("input2")), password);
		this.sendkey(driver.findElement(this.byStr(element, local)), password);
	}
	
	//driver.findElement(By.id("")).sendKeys("");
	public void sendkey(WebElement e,String text){
		e.sendKeys(text);
	}
	
	public By byStr(String element,String local){
		if(element.equals("id")){
		return By.id(local);
		}else if(element.equals("name")){
		return By.name(local);
		}else{
			return By.className(local);
		}
	} 

}
