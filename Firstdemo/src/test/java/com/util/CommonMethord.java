package com.util;

import java.net.URISyntaxException;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;

import com.config.GetTestProperties;
import com.config.ReadWriteConfig;


public class CommonMethord {
	private WebDriver driver;
	public CommonMethord(WebDriver driver){
		this.driver=driver;
	}
	public ReadWriteConfig rwc;
	/**
	 * ����������ļ�·��
	 * 
	 * @param filepath
	 * @return
	 */
	public static String convertFilepath(String filepath) throws Exception {

		if (filepath.contains("bin")) {
			filepath = filepath.replace("bin/", "");
		}
		return filepath;
	}
	
	/**
	 * ��ȡ����·��(���̸�Ŀ¼)
	 * @param filepath
	 * @return
	 * */
	public static String getRealath(){
		String path = "";
		try {
			path=LogsInit.class.getClassLoader().getResource("").toURI().getPath();
			System.out.println(path);
			try {
				path = CommonMethord.convertFilepath(path);
			} catch (Exception e) {
				e.printStackTrace();
			}
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		return path;
	}
	
	/**
	 * Cookie��ȡд�������ļ�
	 * */
	public void writeCookie(){
		Set<Cookie> cookies = driver.manage().getCookies();
		for(Cookie cookie:cookies){
			if(cookie.getName().equals("CookieName")){
				rwc.writeValue(cookie.getName(), cookie.getValue());
			}
		}
	}
	
	/**
	 * ��ȡCookie��¼
	 * */
	public void setCookie(){
		String value=GetTestProperties.getCookieName();
		System.out.println(value);
		//String domain=rwc.getValue("domain");
		//String domain=GetTestProperties.getDomain();
		//Cookie cookie = new Cookie(".CNBlogsCookie",value,domain,"/",null);
		Cookie ck2=new Cookie("apsid",value);
		System.out.println(ck2);
		driver.manage().addCookie(ck2);
	}
	
}
