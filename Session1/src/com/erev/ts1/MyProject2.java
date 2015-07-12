package com.erev.ts1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MyProject2 {
	    
	    public static void main(String[] args) throws InterruptedException {
	    		    
	    {
	        // Create a new instance of the Firefox driver
	        // Notice that the remainder of the code relies on the interface, 
	        // not the implementation.
	    	System.setProperty("webdriver.chrome.driver","C:\\Selenium Tools\\chromedriver_win32\\chromedriver.exe");
	        WebDriver driver = new ChromeDriver();

	        // And now use this to visit Google
	        driver.get("http://www.google.com");
	        // Alternatively the same thing can be done like this
	        // driver.navigate().to("http://www.google.com");
	        Thread.sleep(10000);
	        // Find the text input element by its name
	        WebElement element = driver.findElement(By.name("q"));

	        // Enter something to search for
	        element.sendKeys("seleniumhq");
	        
	        // Now submit the form. WebDriver will find the form for us from the element
	        element.submit();
	        
	        Thread.sleep(30000);
	        
	        // Check the title of the page
	        System.out.println("Page title is: " + driver.getTitle());
	        
	        // Google's search is rendered dynamically with JavaScript.
	        // Wait for the page to load, timeout after 10 seconds
	        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
	            public Boolean apply(WebDriver d) {
	                return d.getTitle().toLowerCase().startsWith("seleniumhq");
	            }
	        });
	        driver.getPageSource().contentEquals("Selenium WebDriver � Selenium Documentation");
	        driver.findElement(By.linkText("Selenium WebDriver � Selenium Documentation")).click();
	        
	        // Should see: "cheese! - Google Search"
	        System.out.println("Page title is: " + driver.getTitle());
	        
	        //Close the browser
	        driver.quit();
	    }
}

}
