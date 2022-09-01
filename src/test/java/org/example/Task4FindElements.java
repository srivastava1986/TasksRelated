package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Task4FindElements {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\TasksRelated\\Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //login with username and password
        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        //click submit
        driver.findElement(By.xpath("//*[@type='submit']")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
        //size of elements
        System.out.println("Number of elements:" +elements.size());
        //list of elements
        for (int i=0; i<elements.size();i++)
        {
            System.out.println("Options: " + elements.get(i).getText());
        }
        //click on "Admin" option
        elements.get(0).click();
        System.out.println("Clicked on Admin");

        driver.quit();
    }
}
