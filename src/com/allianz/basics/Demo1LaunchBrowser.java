package com.allianz.basics;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.WebDriver;

public class Demo1LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create object for chrome driver
		
	//ChromeDriver driver=new ChromeDriver();
		//we cannot access driver for calling other browser
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.selenium.dev/downloads/");
	String actualTittle=driver.getTitle();
	System.out.println(actualTittle);
	driver.quit();
	}

}
