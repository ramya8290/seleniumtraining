package com.allianz.basics;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class demoFBSignup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		String tittle=driver.getTitle();
		System.out.println(tittle);
		
		driver.findElement(By.linkText("Create new account")).click();
		
		driver.findElement(By.name("firstname")).sendKeys("jack");
		
		driver.findElement(By.name("lastname")).sendKeys("daniel");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("text@gmail.com");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("text@gmail");
		
		
		Select day=new Select(driver.findElement(By.id("day")));
		day.selectByVisibleText("12");
		
		Select month=new Select(driver.findElement(By.id("month")));
		month.selectByVisibleText("Apr");
		
		Select year=new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("1917");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("text@gmail.com");
		
		
	}

}
