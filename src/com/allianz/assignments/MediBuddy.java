package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import graphql.Assert;

public class MediBuddy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.medibuddy.in/");
		
		
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//div[text()=\"I have a Corporate Account\"]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//a[text()=\"Learn More\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//a[text()=\"skip\"]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//a[text()=\"Login using Username & Password\"]")).click();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("test@gmail.com");
		driver.findElement(By.xpath("//button[text()=\"Proceed\"]")).click();
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Test");
		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
		//expected error text
	      String exp = "Sorry, We are not able to connect your corporate account. Please use your phone number to login and use other services.";
	      //identify actual error message
	      WebElement m = driver.findElement(By.xpath("//div[@class='alert alert-danger errorTxt m-0 m-t-10 p-0']"));
	      String act = m.getText();
	      System.out.println("Error message is: "+ act);
	      //verify error message with Assertion
	   
		

	}

}
