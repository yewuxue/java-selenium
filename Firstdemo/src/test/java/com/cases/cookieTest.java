package com.cases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.util.CommonMethord;

public class cookieTest {
	private WebDriver driver;
	
	@BeforeClass
	public void init(){
		System.setProperty("webdriver.chrome.driver", "D:\\selenium1\\chromedriver.exe");
		System.setProperty("webdriver.chrome.bin","C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			 driver = new ChromeDriver(); 
			 driver.manage().window().maximize();
			 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@Test
	public void bj(){
		CommonMethord cm= new CommonMethord(driver);
		driver.get("http://coding.imooc.com/class/101.html");
		cm.setCookie();
		driver.get("http://coding.imooc.com/class/101.html");
	}
}
