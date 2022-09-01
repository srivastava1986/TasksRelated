package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3WindowHandles {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\TasksRelated\\Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
        //to scroll on page
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,400)");
        //click on open new tab
        driver.findElement(By.id("newTabBtn")).click();
        //get title of the page
        String t=driver.getTitle();
        System.out.println(t);
        //verify the text-HYR Tutorials
            if(driver.getPageSource().contains("H Y R Tutorials"))
            {
                System.out.println("Pass");
            }
            else
            {
                System.out.println("Fail");
            }

        driver.close();

    }
}
