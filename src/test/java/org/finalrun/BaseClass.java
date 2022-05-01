package org.finalrun;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	static WebDriver driver;
	
public static void chromeBrowser() {
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();

}

public static void closeBrowser() {
	driver.close();
	
}
public static void maxWindow() {
	driver.manage().window().maximize();

}
	public static void launchUrl(String url) {
		driver.get(url);

	}
	
	public static void clickButton(WebElement element) {
	element.click();

	}
	
	public static void fillTextBox(WebElement element1, String value){
		element1.sendKeys(value);
		
	}
	
	public static String getTitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}
	
	public static void getCurrentUrl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);
	}
	
	
	
	
}
