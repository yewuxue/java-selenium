package com.config;


public class GetTestProperties {
	static ReadConfig tc = new ReadConfig("conf/config.properties");

	public static String getPicDir() {
		String picdir = tc.getValue("picdir");
		return picdir;
	}
	
	public static String getDbDir() {
		String dbdir = tc.getValue("dbdir");
		return dbdir;
	}
	
	public static String getTestUrl() {
		String url = tc.getValue("testurl");
		return url;
	}

	public static String getBrowserType() {
		String bt = tc.getValue("browsertype");
		return bt;
	}

	public static String getname() {
		String username = tc.getValue("name");
		return username;
	}

	public static String getpassword() {
		String pwd = tc.getValue("password");
		return pwd;
	}

	public static String getnamepm() {
		String username = tc.getValue("namepm");
		return username;
	}

	public static String getpasswordpm() {
		String pwd = tc.getValue("passwordpm");
		return pwd;
	}
	public static String getnamecd() {
		String username = tc.getValue("namecd");
		return username;
	}

	public static String getpasswordcd() {
		String pwd = tc.getValue("passwordcd");
		return pwd;
	}
	
	public static String getdbtype() {
		String pwd = tc.getValue("dbtype");
		return pwd;
	}
	
	public static String getdbusername() {
		String pwd = tc.getValue("dbusername");
		return pwd;
	}
	
	public static String getdbpassword() {
		String pwd = tc.getValue("dbpassword");
		return pwd;
	}
	
	public static String getdburl() {
		String pwd = tc.getValue("dburl");
		return pwd;
	}
	
	
	
	public static String getAfterLoginUrl() {
		String url = tc.getValue("afterLoginUrl");
		return url;
	}

	public static String getAfterAddPersonnelUrl() {
		String url = tc.getValue("afterAddPersonnelUrl");
		return url;
	}

	public static String getMySiteLinkUrl() {
		String url = tc.getValue("mySiteLinkUrl");
		return url;
	}

	public static String getHomeLinkUrl() {
		String url = tc.getValue("homeLinkUrl");
		return url;
	}

	public static String getMyToDoLinkUrl() {
		String url = tc.getValue("myToDoLinkUrl");
		return url;
	}

	public static int getFlag() {
		String stringFlag = tc.getValue("flag");
		int flag = Integer.parseInt(stringFlag);
		return flag;
	}

	public static String getNewProjectButtonUrl() {
		String url = tc.getValue("newProjectButtonUrl");
		return url;
	}
	

	
	


}