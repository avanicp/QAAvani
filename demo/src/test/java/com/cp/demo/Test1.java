package com.cp.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	Thread.sleep(5000);
	
	driver.get("https://commercepundittech.greythr.com/login.do");
	driver.findElement(By.xpath("//*[@id='j_username']")).sendKeys("172");
	driver.findElement(By.xpath("//*[@id='j_password']")).sendKeys("Avani@1234");
	driver.findElement(By.xpath("//*[@id='login-button']")).click();
	driver.close();
	
	}

}
