package testscripts;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pagelibrary.SearchPage;
import testbase.TestBase;

public class TC_Searchwithlogin extends TestBase
{
	SearchPage search;
	TC_Login tclogin;
	
	@BeforeClass
	public void openBrowser() throws IOException
	{
		init();
	}
	
	@Test
	public void testSearch()
	{
		search=new SearchPage(driver);
		search.clickonddsearch();
		search.clickonddseracklink();
		tclogin=new TC_Login();
		tclogin.testLogin();		
		search.clickonddsearch();
		search.clickonddseracklink();
		search.entertextinsearchbox("Core Java");
		search.clickongobutton();
	}
	
	@AfterClass
	public void quitBrowser()
	{
		closeBrowser();
	}
	
}
