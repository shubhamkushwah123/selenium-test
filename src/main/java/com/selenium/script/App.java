package com.selenium.script;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class App {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/shubham/Documents/Softwares/chrome-driver/chromedriver");
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--headless");
		WebDriver driver = new ChromeDriver(chromeOptions);
		
		System.out.println("Welcome to the Selenium Scripts - It starts executing here");
		
		driver.get("http://ec2-3-135-224-64.us-east-2.compute.amazonaws.com:8888/addressbook/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.className("v-button")).click();
		
		driver.findElement(By.id("gwt-uid-5")).sendKeys("Shubham");
		driver.findElement(By.id("gwt-uid-7")).sendKeys("Kushwah");
		driver.findElement(By.id("gwt-uid-9")).sendKeys("9999999999");
		driver.findElement(By.id("gwt-uid-11")).sendKeys("xyz@abc.com");
		driver.findElement(By.id("gwt-uid-13")).sendKeys("10/10/1988,");
		
		driver.findElement(By.className("v-button-primary")).click();
		
		Thread.sleep(5000);
		driver.quit();
		System.out.println("Script executed successfully");

	}

}
