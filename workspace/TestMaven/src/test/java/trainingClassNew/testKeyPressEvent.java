package trainingClassNew;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testKeyPressEvent {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;

		driver.manage().window().maximize();
		driver.get("http://wikipedia.com/");
		WebElement searchB =driver.findElement(By.cssSelector("#searchInput"));
		searchB.sendKeys(Keys.PAGE_DOWN) ;
		searchB.sendKeys(Keys.PAGE_UP) ;
		searchB.sendKeys("Hindi" , Keys.ENTER) ;
		Thread.sleep(4000) ;
		driver.quit() ;
		
		
		
	}

}
