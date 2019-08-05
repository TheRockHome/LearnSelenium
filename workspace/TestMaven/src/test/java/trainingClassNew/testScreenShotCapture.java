package trainingClassNew;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testScreenShotCapture {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;

		driver.manage().window().maximize();
		driver.get("http://wikipedia.com/");
		WebElement allsize =driver.findElement(By.cssSelector("#www-wikipedia-org > h1"));
		File src= ((TakesScreenshot)allsize).getScreenshotAs(OutputType.FILE);
		
		try{
			WebElement allsize1=driver.findElement(By.cssSelector("sfsdfsdf"));
		       
		}
		catch(Exception e)
		{
			FileUtils.copyFile(src, new File("D:/AutomationTraining/ScreenShots/newCapture.png"));
		}
		driver.quit();

	}

}