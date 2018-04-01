package com.cases;


import org.testng.annotations.Test;

import com.business.LoginBusiness;
import com.config.GetTestProperties;

public class LoginCase extends TestBase{
	//String username = GetTestProperties.getusername();
	String password =GetTestProperties.getpassword();
	String element =GetTestProperties.getelement();
	String  local =GetTestProperties.getlocal();
	@Test
	public void LoginPage(){
		LoginBusiness lb=new LoginBusiness(driver);
		//lb.Login(username, element, local,password);
		lb.Login(GetTestProperties.getusername(), element, local,password);
		logger.info("配置成功");
	}
	
	

}
