package com.cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

import com.util.LogsInit;



public class TestBase extends LogsInit{
	public WebDriver driver ;
	
	@BeforeMethod
	public void BeforeMethod() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium1\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		logger.info("浏览器启动");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}




}
