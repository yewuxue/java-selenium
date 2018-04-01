package com.cases;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.config.DriverManage;
import com.config.GetTestProperties;
import com.util.LogInit;

public class TestBase extends LogInit {
	protected WebDriver driver = null;
	protected String browser;
	
	@Parameters({"browserType"})
	@BeforeClass
	public void BeforeClass(@Optional("1")String browserType) {
		browser = browserType;
		
	}
	
	@BeforeMethod
	public void BeforeMethod() throws Exception{
		//System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		//System.setProperty("webdriver.chrome.bin", "C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
		driver = DriverManage.getDriver(browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	
	

	@AfterMethod
	public void end() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
	//发生错误截图
	public void screenShot() {
		File source_file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd-HHmmss");
		String fileName = df.format(new Date());
		try {
			FileUtils.copyFile(source_file, new File("E://workspace//BoxTest//ErrorScreenshot//" + fileName + ".jpg"));

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
