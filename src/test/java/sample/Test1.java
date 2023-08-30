package sample;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{
	RemoteWebDriver driver;
	@Test(priority=1)
	public void method1() 
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}
	@Test(priority=2)
	public void method2() 
	{
		driver.get("http://www.google.co.in");
		if(driver.getTitle().equals("https")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
	}
	@Test(priority=3)
	public void method3() 
	{
		Reporter.log("site is opened");
		SoftAssert sa=new SoftAssert();
		if(driver.getTitle().equals("Google")) {
			sa.assertTrue(true);
		}
		else {
			sa.assertTrue(false);
		}
		driver.close();
		sa.assertAll();
	}
	
	
}
