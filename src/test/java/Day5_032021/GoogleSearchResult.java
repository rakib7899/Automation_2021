package Day5_032021;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResult {
    public static void main(String[] args) throws InterruptedException {
        //set property of driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //define the webdriver
        WebDriver driver = new ChromeDriver();


        //navigate to google home

        driver.navigate().to("https://www.google.com");

        //maximize browser
        driver.manage().window().maximize();
        //sleep
        Thread.sleep(3000);

        //enter a keyword in the google search field
        driver.findElement(By.xpath("//*[@name='q']")).sendKeys("cars");

        Thread.sleep(1000);

        //hit submit
        driver.findElement(By.xpath("//*[@name='btnK']")).submit();

        //wait a few
        Thread.sleep(3000);

        //get search result number ONLY
        String searchResult = driver.findElement(By.xpath("//*[@id='result-stats']")).getText();
        //split message
        String[] arrayResults = searchResult.split(" ");
        //NOW PRINT YOUR FINAL STATEMENT
        System.out.println("My search number is " + arrayResults[1]);

        //and finally quit driver and see if your test was successful

        driver.close();


    }//end of main
}//end of class
