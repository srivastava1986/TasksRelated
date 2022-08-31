package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Task5DoubleClickAndRightClick {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\TasksRelated\\Drivers\\Chrome\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        //launch url
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        //maximize the window
        driver.manage().window().maximize();
        //get the page title
        String t= driver.getTitle();
        System.out.println(t);

        //Double click
        Actions actions= new Actions(driver);
        WebElement element= driver.findElement(By.xpath("//*[@ondblclick='myFunction()']"));
        actions.doubleClick(element).perform();

        //Alert
        Alert alert= driver.switchTo().alert();
        alert.accept();

        //Right click
        WebElement element1=driver.findElement(By.xpath("//*[@class='context-menu-one btn btn-neutral']"));
        actions.contextClick(element1).perform();
        WebElement option=driver.findElement(By.cssSelector(".context-menu-icon-copy"));

        //Explicit Wait
//        WebDriverWait wait = new WebDriverWait(driver,10);
//        option=wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".context-menu-icon-copy")));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        option.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS) ;
        driver.switchTo().alert().accept();
        driver.quit();
    }
}
