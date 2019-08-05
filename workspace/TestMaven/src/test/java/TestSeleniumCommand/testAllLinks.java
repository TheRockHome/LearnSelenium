package TestSeleniumCommand;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testAllLinks {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/AutomationTraining/Softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver() ;

		driver.manage().window().maximize();
		driver.get("https://www.guru99.com/using-contains-sbiling-ancestor-to-find-element-in-selenium.html");

		WebElement allsize=driver.findElement(By.cssSelector("#g-mainbar > div:nth-child(2) > div > div > div > div > div"));
		        System.out.println(allsize.getSize());//Question about size off and size
		        System.out.println(allsize.findElements(By.tagName("a")).size());
		        driver.close();
		}

	}

