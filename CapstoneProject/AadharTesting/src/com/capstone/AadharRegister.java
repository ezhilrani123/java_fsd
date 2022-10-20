package com.capstone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AadharRegister {
	WebDriver webdriver;

	@Test(priority=1)
	public void ChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "D://95//chromedriver.exe");
		  
		 
		  webdriver= new ChromeDriver();
		webdriver.manage().window().maximize();
		System.out.println("Chrome Browser is Opened!!");
		
	}
	
	@Test(priority=2)
	public void TestHome() {
		webdriver.get("http://localhost:4200/home");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.xpath("/html[1]/body[1]/app-root[1]/app-home[1]/div[1]/div[1]/a[2]")).click();
		webdriver.get("http://localhost:4200/register");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		webdriver.findElement(By.id("name")).sendKeys("Akila Ezhil");
		webdriver.findElement(By.id("dob")).sendKeys("20/02/1998");
		webdriver.findElement(By.id("emailid")).sendKeys("akila12@gmail.com");
		webdriver.findElement(By.id("address")).sendKeys("12C,South Street,Madurai");
		webdriver.findElement(By.id("mobileno")).sendKeys("6379613435");
		webdriver.findElement(By.id("gender")).sendKeys("Female");
		webdriver.findElement(By.xpath("//button[normalize-space()='Register']")).click();
	}



}
