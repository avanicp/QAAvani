package com.cp.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class CBS {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new FirefoxDriver ();
		
		Thread.sleep(5000);
		
	/*	
		driver.get("https://www.cbstation.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("html/body/div[1]/header/div[1]/div/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("Avani@commercepundit.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Test@123");

		driver.findElement(By.xpath("//*[@id='send2']")).click();
		Thread.sleep(5000);*/
		
		driver.get("https://www.cbstation.com/");
		
		Thread.sleep(15000);
		//driver.switchTo().alert().accept();
		driver.findElement(By.className("pushcrew-btn-close")).click();
		
		Thread.sleep(5000);
	   driver.findElement(By.linkText("Products")).click();
	    
	   
	    /*WebElement ele = driver.findElement(By.xpath("//*[@id='ui-id-3']/span[2]"));
	    
	    
	   
	    Actions action = new Actions(driver);
	    action.moveToElement(ele).build().perform();
	    */
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
	   // driver.findElement(By.xpath("//*[@id='ui-id-8']/img")).click();
	
		
		
		
	}

}
