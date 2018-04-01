package com.cases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.business.Box_SwitchMenu_business;

public class Box_SwitchMenu_case extends TestBase {
	@Test
	public void Box_SwitchMenu_page() {
		driver.get("https://192.168.0.196");
		driver.findElement(By.id("user_slug")).sendKeys("admin");
		driver.findElement(By.id("pwd")).sendKeys("123456");
		driver.findElement(By.id("submit_button")).click();

		Box_SwitchMenu_business bsmb = new Box_SwitchMenu_business(driver);
		bsmb.SwitchMenu();
	}
}
