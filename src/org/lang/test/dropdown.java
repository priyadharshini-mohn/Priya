package org.lang.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINU\\eclipse-priyadharshini\\Language Details\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement date = driver.findElement(By.id("day"));
		Select s = new Select(date);
		//to check drop down type
		boolean m = s.isMultiple();
		System.out.println(m);
		//to find the size of dd
		List<WebElement> op = s.getOptions();
		int size = op.size();
		System.out.println(size);
		//to select the option in the dd
		s.selectByValue("30");
		List<WebElement> options = s.getOptions();
	    for (int i = 0; i < size; i++) {
			WebElement text = options.get(i);
		    String text2 = text.getText();
		    System.out.println(text2);
		    List<WebElement> options2 = s.getOptions();
		    for(WebElement x: options2) {
		    	String attribute = x.getAttribute("value");
		    	System.out.println(attribute);
		    	
		    }
	    }
		
		
		
		

	}

}
