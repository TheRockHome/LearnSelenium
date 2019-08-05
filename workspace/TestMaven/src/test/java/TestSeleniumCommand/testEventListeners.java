package TestSeleniumCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.AbstractWebDriverEventListener;

public class testEventListeners extends AbstractWebDriverEventListener {
	
	
	public void afterClickOn(WebElement element, WebDriver driver)
	
	{
		System.out.println("Web Element is Clicked");
	}
	
	public void afterFindBy(By by, WebElement element, WebDriver driver)
	
	{
		System.out.println("Web Element is found");
	}
}
