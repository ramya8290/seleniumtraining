package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TaskCityBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.citibank.co.in/ssjsps/forgetuseridmidssi.jsp");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//a[text()=\"select your product type\"]")).click();
		driver.findElement(By.linkText("Credit Card")).click();
		
		driver.findElement(By.xpath("//input[@id='citiCard1']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='citiCard2']")).sendKeys("5678");
		driver.findElement(By.xpath("//input[@id='citiCard3']")).sendKeys("9876");
		driver.findElement(By.xpath("//input[@id='citiCard4']")).sendKeys("2345");
		
		driver.findElement(By.xpath("//input[@id='cvvnumber']")).sendKeys("123");
		
		driver.findElement(By.xpath("//input[@id='bill-date-long']")).click();
		
		Select month= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		month.selectByVisibleText("Jan");
		
		//select[@class='ui-datepicker-year']
		Select year= new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
		year.selectByVisibleText("1990");
		
		driver.findElement(By.xpath("//a[@class='ui-state-default'][1]")).click();
		
		driver.findElement(By.xpath("//input[@id='agree']")).click();
		driver.findElement(By.xpath("//input[@value='PROCEED']")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		

		driver.quit();
		
		
	}

}
