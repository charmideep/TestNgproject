package paramert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamertTestclass {
	WebDriver driver;
  @Test
  @Parameters({"url","emailid"})
  public void yahoologin(String url,String emailid) {
	  System.setProperty("webdriver.chrome.driver","C:\\seleniumjar1\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get(url);
	  driver.findElement(By.id("login-username")).sendKeys(emailid);
	  driver.findElement(By.id("signin")).click();
  }
}
