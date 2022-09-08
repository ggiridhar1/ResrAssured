package com.crm.genericUtilities;

import org.testng.annotations.BeforeSuite;

public class BaseApi {
	DataBaseUtility dlib = new DataBaseUtility();
	JavaUtility javlib=new JavaUtility();
	

	
	@BeforeSuite
	public void DBConfig()
	{
		dlib.connectToDB();
	}
	@BeforeSuite
	public void DBremove() {
		dlib.closeDB();
	}
	
}
