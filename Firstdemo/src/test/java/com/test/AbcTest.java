package com.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AbcTest {
public WebDriver driver ;
	
	@BeforeMethod
	public void BeforeMethod() throws Exception{
		System.setProperty("webdriver.chrome.driver", "D:\\selenium1\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Test
	public void dw(){
		driver.get("http://www.baidu.com");
		System.out.println(driver.findElement(By.id("kw")).getSize());
	}
}
