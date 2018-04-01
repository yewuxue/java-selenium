package com.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Box_SwitchMenu_page {
	private WebDriver driver;

	public Box_SwitchMenu_page(WebDriver driver) {
		this.driver = driver;
	}

	public void Enterprise_Space() {
		driver.findElement(By.cssSelector("#tab_m_home > a > span.menu-text")).click();
	}

	public void Personal_Space() {
		driver.findElement(By.cssSelector("#tab_m_personal > a > span.menu-text")).click();
	}

	public void Shared_File() {
		driver.findElement(By.cssSelector("#tab_m_shared > a > span.menu-text")).click();
	}

	public void My_Favorite() {
		driver.findElement(By.cssSelector("#tab_m_favorite > a > span.menu-text")).click();
	}

	public void Link_Manage() {
		driver.findElement(By.cssSelector("#tab_m_link > a > span.menu-text")).click();
	}

	public void Authorization_Manage() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#tab_m_auth > a > span.menu-text")).click();
	}

	public void News_Feed() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#tab_m_message > a > span.menu-text")).click();
	}

}
