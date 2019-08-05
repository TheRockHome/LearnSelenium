package TestSeleniumCommand;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import static org.junit.Assert.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class launchURL {

	@Test
	public void teramain() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("incognito");
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		WebDriver driver = new ChromeDriver() ;
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Automation") ;
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000) ;
//		driver.findElement(By.xpath("//a[@href='https://en.wikipedia.org/wiki/Automation']")).click();        
		driver.findElement(By.partialLinkText("Automation - Wikipedia")).click();
		Thread.sleep(3000) ;
		String Title = driver.getTitle().toString() ;
		System.out.println(Title);
		Assert.assertEquals(Title, "Automation - Wikipedia") ;
		
		driver.quit();
	}

}
