package Day4_031421;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchResults {
    public static void main(String[] args) {

        //set system property of the driver
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        //define the WebDriver with a variable
        WebDriver driver = new ChromeDriver();

        //navigate to google.com
        driver.navigate().to("https://www.google.com");




    }//end of main
}//end of class
