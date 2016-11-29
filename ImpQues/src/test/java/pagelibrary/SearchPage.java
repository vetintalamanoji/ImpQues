package pagelibrary;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage
{
	WebDriver driver;
	static Logger log=Logger.getLogger(SearchPage.class.getName());
	
	By dd_search=By.xpath("//div/div[2]/ul[1]/li/a");
	By dd_searchLink=By.xpath("//div[2]/ul[1]/li/ul/li/a");
	By search_txtbox=By.xpath("//div/div[2]/div/input");
	By dd_Actionall=By.xpath("//div[2]/div/div/button");
	By go_Btn=By.xpath(".//div[2]/div/span/button");
	
	public SearchPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void clickonddsearch()
	{
		log.info("click on dropdown search in search page");
		driver.findElement(dd_search).click();
	}
	
	public void clickonddseracklink()
	{
		log.info("click on search link in dropdown search");
		driver.findElement(dd_searchLink).click();
		
	}
	
	public void entertextinsearchbox(String text)
	{
		log.info("enter text in search box");
		driver.findElement(search_txtbox).sendKeys(text);
	}
	
	
	public void clickonddactionall()
	{
		log.info("click on actionall dropdown");
	    driver.findElement(dd_Actionall).click();
	    		
	}
	public void clickongobutton()
	{
		log.info("click on go button");
		driver.findElement(go_Btn).click();
	}
	
	
}
