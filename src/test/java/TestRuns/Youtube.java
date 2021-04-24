package TestRuns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {
    public static void main(String[] args) throws InterruptedException {
        //set property for driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        //define webdriver
        WebDriver driver = new ChromeDriver();

        //NAVIGATE TO YOUTUBE.COM
        driver.navigate().to("https://www.youtube.com");

        //maximize browser
        driver.manage().window().maximize();

        //wait a few
        Thread.sleep(3000);

        //enter key word in search field "Lil Durk"
        driver.findElement(By.xpath("//*[@name='search_query']")).sendKeys("Lil Durk");

        //HIT SUBMIT
        driver.findElement(By.xpath("//*[@name='search_query']")).submit();

        //wait a few
        Thread.sleep(3000);

        //click on finesse gang way video
        driver.findElement(By.xpath("//*[@src='https://i.ytimg.com/vi/m2x-r1Cyrt0/hq720.jpg?sqp=-oaymwEcCNAFEJQDSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLBkkhNqTF4kGy33vtIpyOsrKcOGVg']")).click();


    }//end of main
}//end of class
