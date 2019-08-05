package trainingClassNew;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testJavaPoUP {

	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;

		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		Thread.sleep(4000) ;
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		Alert alert = driver.switchTo().alert() ;
		
		System.out.println(alert.getText()) ;
		
		alert.accept() ;
		
		
		
		

	}

}
