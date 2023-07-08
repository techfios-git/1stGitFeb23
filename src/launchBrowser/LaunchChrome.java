package launchBrowser;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class LaunchChrome {
	
	public static void main(String[] args) throws InterruptedException {
		
//		Scanner snc = new Scanner(System.in);
		
		//Launch chrome
		WebDriver driver = new ChromeDriver();
		//Fetch Website
		driver.get("https://www.google.com/");
		//Maximize browser
		driver.manage().window().maximize();
		
		//Type selenium
		driver.findElement(By.name("q")).sendKeys("selenium123");
		
		Thread.sleep(3000);
		//Close browser
		driver.close();
		
	
		
	}

}
