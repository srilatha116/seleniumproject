/**
 * 
 */
package com.medhas.regressiontest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.medhas.regression.BaseClass;
import com.medhas.regression.Loginpage;
import com.medhas.regression.MultipleUsersReactivaterequestforFileserver;

/**
 * @author Shashank
 *
 */
public class TestMultipleUsersReactivaterequestforFileserver extends BaseClass {
	
	@Test(priority = 1)
	public void checkvalidUser() throws InterruptedException {

		Loginpage login = PageFactory.initElements(driver, Loginpage.class);

		login.Login_medhas(excel.getStringData("Login", 1, 0), excel.getStringData("Login", 1, 2));

	}

	@Test(priority = 2)
	public void enterrequestInfo() throws InterruptedException {
		MultipleUsersReactivaterequestforFileserver multipleusersreactivateforfileserver = PageFactory
				.initElements(driver, MultipleUsersReactivaterequestforFileserver.class);
		multipleusersreactivateforfileserver.requestInf(excel.getStringData("Selfcreaterequestforfileserver", 1, 0));
	}

	@Test(priority = 3)
	public void enterfileserveraccess() throws InterruptedException {
		MultipleUsersReactivaterequestforFileserver multipleusersreactivateforfileserver = PageFactory
				.initElements(driver, MultipleUsersReactivaterequestforFileserver.class);
		multipleusersreactivateforfileserver.enterfileservername(excel.getStringData("Deactivate Fileserver", 1, 0),
				excel.getStringData("Deactivate Fileserver", 1, 1));
	}

	@Test(priority = 4)
	public void enterfirstUserDetails() throws InterruptedException {
		MultipleUsersReactivaterequestforFileserver multipleusersreactivateforfileserver = PageFactory
				.initElements(driver, MultipleUsersReactivaterequestforFileserver.class);
		multipleusersreactivateforfileserver.userDetails1(excel.getStringData("UserDetails forDeactivateAccess", 1, 0),
				excel.getStringData("UserDetails forDeactivateAccess", 1, 1),
				excel.getStringData("UserDetails forDeactivateAccess", 1, 2),
				excel.getStringData("UserDetails forDeactivateAccess", 1, 3),
				excel.getStringData("UserDetails forDeactivateAccess", 1, 4),
				excel.getStringData("UserDetails forDeactivateAccess", 1, 5));
	}

	@Test(priority = 5)
	public void entersecondUserDetails() throws InterruptedException {
		MultipleUsersReactivaterequestforFileserver multipleusersreactivateforfileserver = PageFactory
				.initElements(driver, MultipleUsersReactivaterequestforFileserver.class);
		multipleusersreactivateforfileserver.userDetails2(excel.getStringData("UserDetails forDeactivateAccess", 2, 0),
				excel.getStringData("UserDetails forDeactivateAccess", 2, 1),
				excel.getStringData("UserDetails forDeactivateAccess", 2, 2),
				excel.getStringData("UserDetails forDeactivateAccess", 2, 3),
				excel.getStringData("UserDetails forDeactivateAccess", 2, 4),
				excel.getStringData("UserDetails forDeactivateAccess", 2, 5), excel.getStringData("Login", 1, 0),
				excel.getStringData("Login", 1, 2));
	}

}
