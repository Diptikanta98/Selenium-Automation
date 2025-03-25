package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.List;

import javax.xml.datatype.Duration;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

public class redbus {

	//public static void main(String[] args) throws Throwable {
	@Test
	
	public void Demo() throws Throwable {
		

	WebDriver driver=new ChromeDriver();

	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	//WebDriverWait wait=new WebDriverWait(driver, 10);
	Thread.sleep(2000);
	driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,250)", "");
	
	String monthYearVal = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText();
	System.out.println(monthYearVal);

	String[] dateParts = monthYearVal.split(" ");
	String month = dateParts[0].trim();
	String year = dateParts[1].trim();
			while(true) {
		driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[last()]")).click();
		monthYearVal = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText();
	    System.out.println(monthYearVal);

	    dateParts = monthYearVal.split(" ");
	    month = dateParts[0].trim();
	    year = dateParts[1].trim();
	    //System.out.println("+++"+month+""+year);
	    if(month.equalsIgnoreCase("Jun") && year.equalsIgnoreCase("2026") ) {
	    	break;
	    }
	}
	driver.findElement(By.xpath("//span[text()='26']")).click();
	js.executeScript("window.scrollBy(0,-250)", "");
	    }

	

	
	}
	
	

	
	
