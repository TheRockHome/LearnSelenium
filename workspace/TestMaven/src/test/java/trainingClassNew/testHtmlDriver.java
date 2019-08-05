package trainingClassNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class testHtmlDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		WebDriver driver = new HtmlUnitDriver() ;
		//WebDriver driver = new ChromeDriver() ;
		driver.get("https://www.cricbuzz.com") ;
		
		System.out.println(driver.getTitle());
		

		driver.quit();
	}

}
