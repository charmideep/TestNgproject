package testngpk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Googletest {
	 WebDriver drive;
	@BeforeMethod()
	public void setup()
	{
		 System.setProperty("webdriver.chrome.driver","C:\\seleniumjar1\\chromedriver.exe");
			
	        drive=new ChromeDriver();
	        drive.get("https://www.google.com/");
	        drive.manage().window().maximize();
	        
	        
	}
	@Test
	public void gettitle()
	{
		String str=drive.getTitle();
		System.out.println(str);
	}
	@Test
	public void  dispaltimag()
	{
	    boolean b= drive.findElement(By.className("lnXdpd")).isDisplayed();
	}
	@AfterMethod()
	public void exist()
	{
		drive.quit();
	}
}
