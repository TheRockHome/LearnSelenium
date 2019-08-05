package TestSeleniumCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

import com.gargoylesoftware.css.parser.Locatable;
import com.gargoylesoftware.htmlunit.javascript.host.geo.Coordinates;

public class testMouseEventListeners {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		WebDriver Webdriver = new ChromeDriver() ;
		
		EventFiringWebDriver driver = new EventFiringWebDriver(Webdriver) ;
		testEventListeners lissten = new testEventListeners() ;
		
		driver.register(lissten) ;

		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/");
		
		EventFiringMouse mouse = new EventFiringMouse(driver, lissten) ;
		Locatable locat = (Locatable) driver.findElement(By.cssSelector("#cb-main-menu > a:nth-child(4)")) ;
		
		//Coordinates cord = ((Object) locat).getCoordinaates() ;		
		driver.quit() ;
	}

}
