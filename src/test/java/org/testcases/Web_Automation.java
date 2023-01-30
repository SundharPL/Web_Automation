package org.testcases;

import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Web_Automation {
	@Test
	public void Web_Automation_Test() throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("q")).sendKeys("Dometic\n");
		Thread.sleep(5000);
		
		String window_Tiltle = driver.getTitle();
		System.out.println(window_Tiltle);
		Date date =new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		System.out.println("Current Time and Date: "+simpleDateFormat.format(date));
		
		InetAddress inetAddress = InetAddress.getLocalHost();
		String hostName = inetAddress.getHostAddress();
		
		System.out.println("IP Address: "+inetAddress);
		System.out.println("Host Name: "+hostName);
	}
	
}
