package com.allianz.basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2FB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com");
		String tittle=driver.getTitle();
		System.out.println(tittle);
		
	    driver.findElement(By.name("email")).sendKeys("sudhapanicker2016@gmail.com");
	    driver.findElement(By.name("pass")).sendKeys("vlsiisnotboring");
	    driver.findElement(By.name("login")).click();
		//driver.quit();

	}

}
