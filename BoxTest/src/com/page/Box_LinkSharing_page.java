package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Box_LinkSharing_page {
	private WebDriver driver;

	public Box_LinkSharing_page(WebDriver driver) {
		this.driver = driver;
	}

	public void SelectFile() {
		driver.findElement(By.cssSelector("input.item-checkbox")).click();
	}

	public void ClickLinkSharing() {
		driver.findElement(By.cssSelector("#fileManagerHeader > div.fileManager_bottom > div > div.filelist-header-auth > div > span.link > i")).click();
	}

	public void OpenLinkAddr() {
		driver.findElement(By.linkText("http://192.168.0.23/l/EnSELT")).click();
	}
}
