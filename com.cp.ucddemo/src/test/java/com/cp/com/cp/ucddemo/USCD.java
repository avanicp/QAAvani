package com.cp.com.cp.ucddemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;


public class USCD {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		
	WebDriver driver = new ChromeDriver();
		//WebDriver driver = new FirefoxDriver();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.manage().window().maximize();
		
		
		//Thread.sleep(5000);
		
		driver.get("https://shop.uscabinetdepot.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div[1]/div/div[1]/div/div[3]/div[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("commerce.pundit116@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"send2\"]/span/span")).click();
		driver.findElement(By.xpath("/html/body/div[6]/div/div/a")).click();
		
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"nav\"]/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"search\"]")).sendKeys("CS-B12");
		driver.findElement(By.xpath("//*[@id=\"search_mini_form\"]/div/input[2]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"options_4771\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"product_addtocart_form_214\"]/div[2]/ul/li[6]/img")).click();
	 
	    Thread.sleep(1000);
	    
	    //driver.findElement(By.xpath("//*[@id=\"header_cabinet_dropdown\"]")).click();
		Select cabinettype = new Select(driver.findElement(By.name("header-cabinettype")));
		Thread.sleep(2000);
		cabinettype.selectByVisibleText("Frameless"); // select value from dropdown
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"choose-cabinettype-confirm\"]/div/div[3]/button[2]/span/span")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/div[2]/div[2]/div/div/div/div[2]/div/ul/li[1]/div[1]/a")).click();
		js.executeScript("window.scrollBy(0,500)"); //for scroll down
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[3]/div/div[3]/div[2]/div/div[1]/div[2]/div[1]/div[3]/ul/li[1]/a")).click();
		js.executeScript("window.scrollBy(0,500)");//for scroll down
		driver.findElement(By.xpath("//*[@id=\"options_8272\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"product_addtocart_form_5131\"]/div/ul/li[6]/img")).click();
		Thread.sleep(6000);
		js.executeScript("scroll(0,-700);");//for scroll up
		Thread.sleep(1000);
		driver.findElement(By.xpath(".//*[@id='header-cart-top']/div[2]")).click();
		js.executeScript("scroll(0,-1000);");//
		driver.findElement(By.xpath("html/body/div[6]/div/div[2]/div/div/div[2]/div[1]/ul/li/button")).click();
		driver.findElement(By.xpath("//*[@id='shipping-buttons-container']/button")).click();
		js.executeScript("window.scrollBy(0,700);");
		//driver.findElement(By.xpath(".//*[@id='s_method_ga_final_mile']")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,150);");
		driver.findElement(By.cssSelector("button#save_payment")).click();
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("button#save_warehouse")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.cssSelector("input#authorizenet_po_number")).sendKeys("Test order");
		//driver.findElement(By.id("authorizenet_po_number")).sendKeys("test order");
		//js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id='p_method_checkmo']")).click();
		driver.findElement(By.xpath("//*[@id='payment-buttons-container']/button")).click();
		//driver.findElement(By.xpath("//*[@id='billing-buttons-container']/button")).click();
		driver.findElement(By.cssSelector("button#button validation-passed")).click();
		driver.findElement(By.xpath("//*[@id='ordercomment-comment']")).sendKeys("CP Test order do not process");
		js.executeScript("window.scrollBy(0,500)");
		driver.findElement(By.xpath("//*[@id='agreement-1']")).click();
		
		
		
}
}
