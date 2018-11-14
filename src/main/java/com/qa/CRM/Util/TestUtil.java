package com.qa.CRM.Util;

import com.qa.CRM.testbases.BaseTest;

public class TestUtil extends BaseTest{
	
	public void switcToFrame(String str) {
		driver.switchTo().frame(str);
	}
}
