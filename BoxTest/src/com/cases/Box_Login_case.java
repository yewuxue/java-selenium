package com.cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.business.Box_Login_business;

public class Box_Login_case extends TestBase {

	@Test
	public void Box_Login_Page() throws Exception {
		try {
			
			Box_Login_business blt = new Box_Login_business(driver);
			blt.Login("admin", "123456");
			logger.debug("登录");
			Thread.sleep(1000);
			Assert.assertTrue(driver.getPageSource().contains("管理控制台"));

		} catch (AssertionError e) {
			screenShot();
		}
	}

}
