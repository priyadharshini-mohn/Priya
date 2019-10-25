package org.lang.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling {

	public static void main(String[] args ) throws Exception{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\DINU\\eclipse-priyadharshini\\Language Details\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		
		
        driver.findElement(By.id("inputValEnter")).sendKeys("iphone 7");
        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ENTER);
        r.keyRelease(KeyEvent.VK_ENTER);
        driver.findElement(By.xpath("(//p[@title='Apple iPhone 7 ( 32GB , 2 GB ) Black'])[2]")).click();
        String parent = driver.getWindowHandle();
        System.out.println(parent);
        Set<String> all = driver.getWindowHandles();
        for (String X : all) {
			if (!parent.equals(X)) {
			driver.switchTo().window(X);
			driver.findElement(By.xpath("//span[text()='add to cart']")).click();
			}
		}
	} 

}
