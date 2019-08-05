package trainingClassNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class USerAutth {

	/**
	 * @param args
	 */
	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;
		
		driver.get("https://username:password@www.google.com/") ;

	}

}
