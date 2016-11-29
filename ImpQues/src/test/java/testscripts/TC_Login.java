package testscripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagelibrary.LoginPage;
import testbase.TestBase;

public class TC_Login extends TestBase {
	LoginPage login;

	@BeforeClass
	public void openBrowser() throws IOException {
		init();
	}

	@Test
	public void testLogin() {
		login = new LoginPage(driver);
		login.clickonddLogin();
		login.clickonddLoginLink();
		login.enterRegEmailAddr("gopi.kasu@gmail.com");
		login.enterRegPwd("password");
		login.clickonLoginBtn();
	}

	@AfterClass
	public void quitBrowser() {
		closeBrowser();
	}

}
