package com.config;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.util.CommonMethord;
import com.util.LogInit;

public class DriverManage extends LogInit {
	public static WebDriver driver = null;

	public static WebDriver getDriver(String runDriver) throws Exception {

		switch (Integer.parseInt(runDriver)) {
		case 1:
			System.setProperty("webdriver.chrome.driver",
					CommonMethord.getRealath() + "browsers/chromedriver.exe");
			driver = new ChromeDriver();
			logger.debug("打开google浏览器......");
			break;
		

		case 2:
			System.setProperty("webdriver.ie.driver",
					CommonMethord.getRealath() + "browsers/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			//log.info("runDriver is ie......");
			break;
		case 3:
			System.setProperty("webdriver.firefox.bin",
					"C:\\Program Files\\Mozilla Firefox\\firefox.exe");
			driver = new FirefoxDriver();
			//log.info("runDriver is ff......");
			break;
		
		}

		return driver;
	}

}
