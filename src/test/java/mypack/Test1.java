package mypack;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 
{

	public static void main(String[] args) throws Exception 
	{
		//Lunch browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the browser
		driver.manage().window().maximize();
		//lunch site
		driver.get("https://www.naukri.com/mnjuser/homepage");
		Thread.sleep(5000);
		
		
		

	}

}
