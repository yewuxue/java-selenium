package com.page;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Box_UploadFile_page {
	private WebDriver driver;
	public  Box_UploadFile_page(WebDriver driver){
		this.driver = driver;
	}
	public void ClickUpLoadfile() {
		driver.findElement(By.className("swfupload")).click();
	}
	public void SelectFile(String filepath) throws IOException{
		//Runtime.getRuntime().exec("C:\\Users\\fourme\\Desktop\\uploadfile2.exe");
		Runtime.getRuntime().exec(filepath);
	}
}
