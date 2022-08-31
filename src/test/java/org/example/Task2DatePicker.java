package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2DatePicker {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\TasksRelated\\Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        //launch url
        driver.get("https://www.makemytrip.com/");
        //get page title
        String m= driver.getTitle();
        System.out.println(m);
        //click on round trip
        driver.findElement(By.xpath("//*[@data-cy='roundTrip']")).click();
        //click on calender
        driver.findElement(By.xpath("//*[@class='lbl_input latoBold appendBottom10']")).click();
        //go to date picker
        WebElement datePicker= driver.findElement(By.xpath("//*[@class='DayPicker-Day']"));
        datePicker.click();
        //choose any future date for departure
        driver.findElement(By.xpath("//*[@aria-label='Wed Aug 31 2022']")).click();
        //click on calender (return)
        driver.findElement(By.xpath("//*[@class='widgetSprite icCalendar appendRight10']")).click();
        //choose any future date for return
        driver.findElement(By.xpath("//*[@aria-label='Wed Sep 21 2022']")).click();
        //click on search
        driver.findElement(By.xpath("//*[@class='primaryBtn font24 latoBold widgetSearchBtn ']")).click();
        //close the window
        driver.quit();
    }
}
