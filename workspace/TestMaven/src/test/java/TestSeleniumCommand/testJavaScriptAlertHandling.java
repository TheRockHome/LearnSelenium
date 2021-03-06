package TestSeleniumCommand;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testJavaScriptAlertHandling {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;

		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement signIn =driver.findElement(By.xpath("/html/body/div/div[1]/div[2]/div[2]/div[1]/div/form/div/div[6]/div[1]/input"));
		signIn.click() ;
		Thread.sleep(3000) ;
		Alert alert = driver.switchTo().alert();
	    System.out.println(alert.getText());
	    Thread.sleep(3000) ;
	    alert.dismiss();
	    Thread.sleep(3000) ;
	    driver.quit();
	}

}
