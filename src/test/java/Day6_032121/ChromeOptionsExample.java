package Day6_032121;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsExample {
    public static void main(String[] args) {
        //set the path to driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");
        //define the chromeoptions arugments
        ChromeOptions options = new ChromeOptions();

        //set driver to incognito(private)
        options.addArguments("incognito");


        //set it headless
        //options.addArguments("headless");

        //define driver
        WebDriver driver= new ChromeDriver(options);
        //maximize browser
        driver.manage().window().maximize();

        //driver navigate to yahoo
        driver.navigate().to("https://www.yahoo.com");

        driver.quit();

    }//end of main method
}//end of class
