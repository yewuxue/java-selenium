package com.cases;

import org.testng.annotations.Test;
import com.business.Box_LinkSharking_business;


public class Box_LinkSharking_case extends TestBase{
	@Test
	public void Box_LinkSharing_page() throws Exception{
		//driver.get("http://192.168.0.23"); 
		Box_LinkSharking_business blsb=new Box_LinkSharking_business(driver);
		blsb.LinkShark();
	}
}
