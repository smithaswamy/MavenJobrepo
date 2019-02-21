package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class DriverTest {

	
	public String callDriver() throws InterruptedException
	{
		/*System.setProperty("webdriver.firefox.marionette",
				"E:\\newDesktop\\Webinar\\selenium\\geckodriver-v0.16.1-win64\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();*/
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","D:\\spare_webinar\\Webinar\\selenium\\jar_drivers\\chromedriver_win32\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		String myUrl="http://www.toolsqa.com";
	driver.get(myUrl);
   
	String getUrl=driver.getCurrentUrl();
	//String getPageSource=driver.getPageSource();
	String getTitle=driver.getTitle();
	System.out.println("Retured URL is: "+getUrl);
	//System.out.println("PageSource URL is: "+getPageSource);
	System.out.println("Title of the page: "+getTitle);
		
	//driver.findElement(By.xpath("//html//body/div[1]//div[1]//header//nav//ul//li[1]//a/span[1]//span/span")).click();
	System.out.println("Driver loaded webpage!!!!");
    Thread.sleep(5000);
    //driver.close();
    //isDispalyed,isEnable,isSelected 
    return "Success";
    
	}
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		DriverTest obj=new DriverTest();
		obj.callDriver();
	}

}
