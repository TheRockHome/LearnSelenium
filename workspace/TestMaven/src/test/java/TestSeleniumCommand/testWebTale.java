package TestSeleniumCommand;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testWebTale {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;

		driver.manage().window().maximize();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22891/mnt-vs-btw-4th-match-round-1-global-t20-canada-2019");
		
		String F_Xpath = "//*[@id=\"innings_1\"]/div[1]/div[3]/div[" ; 

		String L_Xpath ="]" ;
		
		WebElement Table = driver.findElement(By.xpath("//*[@id=\"innings_1\"]/div[1]")) ;
		
		List<WebElement> totalRow = Table.findElements(By.className("cb-col cb-col-100 cb-scrd-itms")) ;
		System.out.println(totalRow.size()) ;
		
		Thread.sleep(3000) ;
		
		//driver.quit();
	}

}
