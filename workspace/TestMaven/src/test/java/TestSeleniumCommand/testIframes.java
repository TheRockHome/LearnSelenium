package TestSeleniumCommand;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testIframes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		

		driver.manage().window().maximize();
		driver.get("https://www.firstcry.com/");
		
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		
		WebElement email = driver.findElement(By.xpath("//*[@id='Email']")) ;
		email.sendKeys("amit@mit.amit") ;
	}

}
