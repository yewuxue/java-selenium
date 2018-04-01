package com.business;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.page.Box_UploadFile_page;

public class Box_UploadFile_business {
	private WebDriver driver;
	public Box_UploadFile_business(WebDriver driver){
		this.driver=driver;
	}
	public void UploadFile(String filepath) throws IOException{
		Box_UploadFile_page bufp= new Box_UploadFile_page(driver);
		bufp.SelectFile(filepath);
	}
}
