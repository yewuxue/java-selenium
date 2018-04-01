package com.config;

//方法一：
public class GetTestProperties {
	//static ReadConfig tc = new ReadConfig("conf/test.properties");
	static ReadWriteConfig tc = new ReadWriteConfig("src\\main\\resources\\test.properties");
	
	
	
	public static String getTestUrl() {
		String url = tc.getValue("testurl");
		return url;
	}
	public static String getusername() {
		String username = tc.getValue("username");
		return username;
	}
	public static String getelement() {
		String element = tc.getValue("element");
		return element;
	}
	public static String getlocal() {
		String local = tc.getValue("local");
		return local;
	}
	public static String getpassword() {
		String pwd = tc.getValue("password");
		return pwd;
	}
	public static String getCookieName(){
		String ckne=tc.getValue("apsid");
		return ckne;
	}
	public static String getDomain(){
		String dmn=tc.getValue("domain");
		return dmn;
	}
	}
