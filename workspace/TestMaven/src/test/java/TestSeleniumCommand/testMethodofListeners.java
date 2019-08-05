package TestSeleniumCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.internal.EventFiringMouse;

import com.gargoylesoftware.css.parser.Locatable;
import com.gargoylesoftware.htmlunit.javascript.host.geo.Coordinates;

public class testMethodofListeners {

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
		driver.get("http://wikipedia.com/");
		WebElement allsize =driver.findElement(By.cssSelector("#www-wikipedia-org > h1"));
		
		allsize.click() ;
		allsize =driver.findElement(By.cssSelector("#www-wikipedia-org > h1"));
		allsize.click() ;
		allsize =driver.findElement(By.cssSelector("#www-wikipedia-org > h1"));
		allsize.click() ;
		allsize =driver.findElement(By.cssSelector("#www-wikipedia-org > h1"));
		allsize.click() ;
		
		
		EventFiringMouse mouse = new EventFiringMouse(Webdriver, lissten) ;
		Locatable locat = (Locatable) driver.findElement(By.cssSelector("#www-wikipedia-org > h1")) ;
		
		driver.quit() ;
	}

}