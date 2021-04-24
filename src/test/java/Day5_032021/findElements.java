package Day5_032021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class findElements {
    public static void main(String[] args) throws InterruptedException {
        //set the property opf chromedriver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        //define driver
        WebDriver driver= new ChromeDriver();

        //navigate to google home
        driver.navigate().to("https://www.google.com");

        //maximize
        driver.manage().window().maximize();

        //sleep
        Thread.sleep(3000);

        //using findElements click on store link from the class group
        driver.findElements(By.xpath("//*[@class='MV3Tnb']")).get(1).click();


    }//end of main
}//end of class
