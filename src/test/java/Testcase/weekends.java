package Testcase;

import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;
import org.testng.annotations.Test;

import java.time.*;
import java.time.format.*;
import java.util.*;

public class weekends {

	//public static void main(String[] args) {
	
	@Test
	public void Demo() {
		

		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\eclipse-workspace\\Selenium\\chromedriver.exe");

		 WebDriver driver = new ChromeDriver();
	        driver.get("https://www.redbus.in/");
	        driver.manage().window().maximize();


	    	
	    	driver.findElement(By.xpath("//i[@class='sc-cSHVUG NyvQv icon icon-datev2']")).click();
	    	JavascriptExecutor js = (JavascriptExecutor) driver;
	    	js.executeScript("window.scrollBy(0,250)", "");
	    	while(true) {
	    		driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[last()]")).click();
	    		String monthYearVal = driver.findElement(By.xpath("(//div[@class='DayNavigator__IconBlock-qj8jdz-2 iZpveD'])[2]")).getText();
	    	    System.out.println(monthYearVal);

	    	    String[] dateParts = monthYearVal.split(" ");
	    	    String month = dateParts[0].trim();
	    	    String year = dateParts[1].trim();
	    	    //System.out.println("+++"+month+""+year);
	    	    if(month.equalsIgnoreCase("Jun") && year.equalsIgnoreCase("2026") ) {
	    	    	break;
	    	    }
	    	
	    	List<WebElement> calender = driver.findElements(By.xpath("//span[@class='DayTiles__CalendarDaysSpan-sc-1xum02u-1 bwoYtA']"));
	    	for (WebElement webElement : calender) {
	    		System.out.println(webElement.getText());
				
	    		
			}
	            
	        }
	    	
	    	driver.quit();
	    	//Diptikanta
	    	//ABD
	    	//Rakesh23

	}
}

	

