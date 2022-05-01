package org.finalrun;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\resources\\FeatureFile\\FacebookLogin.feature", glue = "org.stepdefinition")

public class AllRun extends BaseClass {
	
	public static void main(String[]args) {
	
	chromeBrowser();
	maxWindow();
	launchUrl("https://www.facebook.com/");
	PojoClass p= new PojoClass();
	WebElement user = p.getTxtEmail();
	fillTextBox(user, "arun100cc@gmail.com");
	
	driver.navigate().refresh();
	
	fillTextBox(user, "aariv@gmail.com");
	
	/*WebElement pass = p.getTxtPass();
	fillTextBox(pass, "123456");
	
	WebElement btnLogin = p.getBtnLogin();
	clickButton(btnLogin);
	*/
	
	}
}
