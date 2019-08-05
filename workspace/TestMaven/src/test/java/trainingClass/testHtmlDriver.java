package trainingClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class testHtmlDriver {
	public static void main(String[] args) {

		//System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		//WebDriver driver = new ChromeDriver() ;
		WebDriver driver = new HtmlUnitDriver() ;
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/watch?v=d4RDWzhVD7o") ;
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
