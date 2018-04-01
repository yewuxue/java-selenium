package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Box_NewFolder_page {
	private WebDriver driver;
	public  Box_NewFolder_page(WebDriver driver){
		this.driver = driver;
	}
	public void NewFolder()throws NotFoundException{
		//点击新建按钮
		driver.findElement(By.cssSelector("span.addfolder")).click();
	}
	public void clearFolderName()throws NotFoundException{
		//清除新建文件夹
		driver.findElement(By.cssSelector("input.box")).clear();
	}
		//输入新建文件夹名
	public void newfoldername(String foldertext)throws NotFoundException{
			this.setText(driver.findElement(By.cssSelector("input.box")),foldertext);
		}
	   //driver.findElement(By.cssSelector("input.box")).sendKeys("哈哈");
	public void click()throws NotFoundException{
		//点击确定
		 JavascriptExecutor js = (JavascriptExecutor) driver;
		 js.executeScript("arguments[0].click();",driver.findElement(By.cssSelector("span.icon.sure")));
	}
	
	private void setText(WebElement e,String text){
		e.sendKeys(text);
	}
}
