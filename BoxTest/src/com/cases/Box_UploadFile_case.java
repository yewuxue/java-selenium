package com.cases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.business.Box_UploadFile_business;

public class Box_UploadFile_case extends TestBase{
	@Test
	public void Box_UploadFile_page() throws IOException{
		driver.get("http://192.168.0.23"); 
		Box_UploadFile_business bufb=new Box_UploadFile_business(driver);
		bufb.UploadFile("C:\\Users\\fourme\\Desktop\\uploadfile2.exe");
	}
}
