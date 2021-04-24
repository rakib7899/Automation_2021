package Day7_032721;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Exception_Example {
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

        //navigate to bing
        try {


            driver.navigate().to("https://www.bing.com");
            Thread.sleep(3000);
        }catch (Exception e){
            System.out.println("Unable to navigate to bing.com " + e);
        }//end of exception
        //enter keyword
        try {
            driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Cars");
        }catch (Exception e){
            System.out.println("Unable to enter keyword on search field " + e);
        }
        try {
            driver.findElement(By.xpath("//*[@for='sb_form_go']")).click();
        }catch (Exception e){
            System.out.println("Unable to click on search icon " + e);
        }//end of exception






    }//end of method
}//end of class
