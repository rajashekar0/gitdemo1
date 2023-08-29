package mypack;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserOpen {

	public static void main(String[] args) throws Exception 
	{
		//open browser
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		
		//maximize the site
		driver.manage().window().maximize();
		//Lunch site
		/*
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		driver.navigate().back();
		*/
		driver.navigate().to("https://google.co.in/");
		//enter some text
	
		driver.findElement(By.name("q")).sendKeys("Today gold price in hyderabad");
		driver.findElement(By.name("q")) .click();
		Thread.sleep(5000);
		//close the browser
		driver.close();
		System.out.println("browser closed successful");
		
		
		

	}

}
