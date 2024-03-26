package com.allianz.basics;

import java.time.Duration;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoMuiltipleTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://db4free.net/");
		
		driver.findElement(By.xpath("//b[contains(text(),'phpMyAdmin')]")).click();
		
		ArrayList<String> windows= new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(windows.get(1));
		
		driver.findElement(By.id("input_username")).sendKeys("admin");
		driver.switchTo().window(windows.get(0));
		System.out.print(driver.getTitle());
		
	}
}
