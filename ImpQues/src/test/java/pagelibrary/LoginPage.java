package pagelibrary;


import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage
{
	WebDriver driver;
	
	
	static Logger log=Logger.getLogger(LoginPage.class.getName());
	
	 By dd_logIn=By.xpath(".//*[@id='menu-navbar-collapse']/ul[4]/li/a");
	 By dd_login_Link=By.linkText("Login");
     By email_label=By.xpath(".//form/div[1]/label");
     By reg_Email=By.xpath(".//*[@id='email']");
     By reg_Pwd=By.id("password");
     By login_Btn=By.xpath("//input[@type='submit']");
    
    public LoginPage(WebDriver driver)
    {
    	this.driver=driver;
    }
    
    /**
     * This method will click on dropdown login in login page
     */
    
    public void clickonddLogin()
    {
    	log.info("click on dropdown login");
    	driver.findElement(dd_logIn).click();   	
   
    	
    }
    /**
     *  This method will click on ddlogin link
     */
    public void clickonddLoginLink()
    {
    	log.info("click on dropdwon login link");
    	driver.findElement(dd_login_Link).click();
    }
    
    
    
    
    public boolean verifyEmailLabel()
    {
    	log.info("verifying email lable is present or not");
    	try{
    	driver.findElement(email_label).isDisplayed();
    	return true;
    	}
    	catch(Exception e){
    		return false;
    	}
    	
    }
    /**
     * This method will enter registered email address
     * @param email
     */
    public void enterRegEmailAddr(String email)
    {
    	log.info("Enter registered email address");
    	driver.findElement(reg_Email).sendKeys(email);
    	
    }
    /**
     * This method will enter registered password
     * @param pwd
     */
    public void enterRegPwd(String pwd)
    {
    	log.info("Enter registered password");
    	driver.findElement(reg_Pwd).sendKeys(pwd);
    }
    /**
     * This method will click on login Button
     */
    public void clickonLoginBtn()
    {
    	log.info("click on login button");
    	driver.findElement(login_Btn).click();
    }

}
