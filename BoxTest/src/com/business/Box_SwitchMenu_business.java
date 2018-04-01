package com.business;

import org.openqa.selenium.WebDriver;

import com.page.Box_SwitchMenu_page;

public class Box_SwitchMenu_business {
	private WebDriver driver;

	public Box_SwitchMenu_business(WebDriver driver) {
		this.driver = driver;
	}

	public void SwitchMenu() {
		Box_SwitchMenu_page bsmp = new Box_SwitchMenu_page(driver);
		bsmp.Enterprise_Space();
		bsmp.Personal_Space();
		bsmp.Shared_File();
		bsmp.My_Favorite();
		bsmp.Link_Manage();
		bsmp.Authorization_Manage();
		bsmp.News_Feed();

	}
}
