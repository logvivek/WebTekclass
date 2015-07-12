package com.erev.ts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Session2 {

	private static int i = 300;

	WebDriver driver;
	WebElement element;
	
//	@Test
	public void googlesearch() {

		{
			// Create a new instance of the Firefox driver
			// Notice that the remainder of the code relies on the interface,
			// not the implementation.
			System.setProperty("webdriver.chrome.driver",
					"C:\\Selenium Tools\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();

			// And now use this to visit Google
			driver.get("http://www.google.com");
			// Alternatively the same thing can be done like this
			// driver.navigate().to("http://www.google.com");

			// Find the text input element by its name
			WebElement element = driver.findElement(By.name("q"));

			// Enter something to search for
			element.sendKeys("Cheese");

			// Now submit the form. WebDriver will find the form for us from the
			// element
			element.submit();

			// Check the title of the page
			System.out.println("Page title is: " + driver.getTitle());

			ThreadSleep(i);

			// driver.getPageSource().contentEquals("Selenium WebDriver — Selenium Documentation");
			// driver.findElement(By.linkText("Selenium WebDriver — Selenium Documentation")).click();

			// Should see: "cheese! - Google Search"
			//System.out.println("Page title is: " + driver.getTitle());

			// Close the browser
			driver.close();
			driver.quit();
		}
	}

	private void ThreadSleep(int i) {
		// TODO Auto-generated method stub

	}


@Test 

public void yahoosearch()

{
	WebDriver driver = new FirefoxDriver();
	driver.get("https://in.yahoo.com/?p=us");
	element = driver.findElement(By.id("UHSearchBox"));
	element.sendKeys("Vivek");
	
	driver.findElement(By.id("UHSearchWeb")).click();
	
	
}

}
