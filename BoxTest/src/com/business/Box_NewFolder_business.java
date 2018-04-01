package com.business;

import org.openqa.selenium.WebDriver;

import com.page.Box_NewFolder_page;

public class Box_NewFolder_business {
	

	private WebDriver driver;
	public Box_NewFolder_business(WebDriver driver) {
		this.driver = driver;
	}
	public void NewFolder(String foldername ){
	Box_NewFolder_page bnp= new Box_NewFolder_page(driver);
		bnp.NewFolder();
		bnp.clearFolderName();
		bnp.newfoldername(foldername);
		bnp.click();
	}
}
