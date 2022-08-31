package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1NavigateAndPrintURL {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\TasksRelated\\Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        //open google
        driver.get("https://www.google.com/");
        String g= driver.getCurrentUrl();
        //print title of the page
        String g1= driver.getTitle();
        System.out.println(g);
        System.out.println(g1);

        //open amazon website
        driver.get("https://www.amazon.com/");
        //print title of the page
        String a= driver.getTitle();
        System.out.println(a);
        //navigate back
        driver.navigate().back();
        driver.quit();


    }
}
