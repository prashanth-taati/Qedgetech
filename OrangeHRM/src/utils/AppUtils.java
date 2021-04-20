package utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AppUtils
{
		public static WebDriver driver;
		public static void launchApp(String url)
		{
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver =  new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(url);
		}
		public static void closeApp()
		{
			driver.close();
		}
	
}