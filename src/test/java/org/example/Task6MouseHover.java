package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Task6MouseHover {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\TasksRelated\\Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://apptest.digiboxx.com/login");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        //enter email and password
        driver.findElement(By.xpath("//*[@type='email']")).sendKeys("mozark11251093@gmail.com");
        driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Gaurav@123");
        //click on login button
        driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
        //click on "click here"
        driver.findElement(By.xpath("//*[@href='javascript:void(0)']")).click();
        //wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        //to perform "mouse hover" on notification icon
        Actions actions= new Actions(driver);
        WebElement notifications=driver.findElement(By.xpath("//*[@class='showbell']"));
        actions.moveToElement(notifications).perform();
        notifications.click();
        driver.quit();





    }
}
