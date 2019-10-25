package org.lang.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINU\\eclipse-priyadharshini\\Language Details\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-form/");
		WebElement multipleselect= driver.findElement(By.id("selenium_commands"));
		Select s = new Select(multipleselect);
		//to check drop down type
		boolean m = s.isMultiple();
		System.out.println(m);
		//to find the size of dd
		List<WebElement> op = s.getOptions();
		int size = op.size();
		System.out.println(size);
		//to select the option in the dd
		s.selectByVisibleText("Navigation Commands");
		s.selectByVisibleText("Browser Commands");
		
		

		s.selectByIndex(3);
		List<WebElement> options = s.getOptions();
	    for (int i = 0; i < size; i++) {
			WebElement text = options.get(i);
		    String text2 = text.getText();
		    System.out.println(text2);
	    }
		
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		System.out.println(firstSelectedOption);
		for (WebElement Print : allSelectedOptions) {
			System.out.println(Print);
		}
		

	}

}
