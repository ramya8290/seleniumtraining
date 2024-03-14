package com.allianz.assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import graphql.org.antlr.v4.runtime.tree.xpath.XPath;

public class TaskSalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//launch browser and open Salesforce
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.salesforce.com/in/form/signup/freetrial-sales/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.findElement(By.xpath("//button[text()='No Thanks']"));
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("John");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("Wick");
		driver.findElement(By.xpath("//input[@name=\"UserEmail\"]")).sendKeys("john@gmail.com");
		
		Select job=new Select(driver.findElement(By.name("UserTitle")));
		job.selectByVisibleText("IT Manager");
		
		driver.findElement(By.xpath("//input[@name=\"CompanyName\"]")).sendKeys("Allianz");

		Select employee=new Select(driver.findElement(By.name("CompanyEmployees")));
		employee.selectByVisibleText("101 - 200 employees");
		

		driver.findElement(By.xpath("(//div[@class='checkbox-ui'])[2]")).click();

		Select country=new Select(driver.findElement(By.name("CompanyCountry")));
		country.selectByVisibleText("United Kingdom");
		
		
		driver.findElement(By.xpath("//button[@name='start my free trial']")).click();
		
		//String typeValue=searchTextBox.getAttribute("type");
		//System.out.println("Value of type attribute: "+typeValue
		

	}

}
