package Day8_032821;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Scroll_Example {
    public static void main(String[] args) throws InterruptedException {

        //set the path to driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //define the chrome options arguments
        ChromeOptions options = new ChromeOptions();

        //set driver to incognito(private)
        options.addArguments("incognito");

        //set it headless
        //options.addArguments("headless");

        //define driver
        WebDriver driver = new ChromeDriver(options);
        //maximize browser
        driver.manage().window().maximize();

        //navigate to yahoo
        driver.navigate().to("http://www.yahoo.com");
        Thread.sleep(3000);
//enter keyword
        driver.findElement(By.xpath("//*[@name='p']")).sendKeys("Cars");
        //click on search
        driver.findElement(By.xpath("//*[@id='ybar-search']")).click();
        Thread.sleep(3000);


        //scroll to bottom
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("scroll (0,5000)");

//capture text
       String result = driver.findElement(By.xpath("//*[@class='comPagination']")).getText();
//split by keyword next to capture the actual result
        String[] arrayResult = result.split("next");
        //split by the keyword result to get actual number
        String[] arrayNumber = arrayResult[1].split("results");
        //split by keyword results
        System.out.println("my result is" + arrayNumber[0]);


        jse.executeScript("scroll(0,-5000");

        driver.findElement(By.xpath("//*[@id='ysignin']")).click();

        driver.quit();



    }//end of main method
}//end of class
