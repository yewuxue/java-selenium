package com.business;

import org.openqa.selenium.WebDriver;

import com.page.Box_LinkSharing_page;

public class Box_LinkSharking_business {
	private WebDriver driver;

	public Box_LinkSharking_business(WebDriver driver) {
		this.driver = driver;
	}

	public void LinkShark() {
		Box_LinkSharing_page blsp = new Box_LinkSharing_page(driver);
		blsp.SelectFile();
		blsp.ClickLinkSharing();
		blsp.OpenLinkAddr();
	}
}
