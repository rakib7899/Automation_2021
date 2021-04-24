package ActionItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class Automation_AI03_RakibHossain {
    public static void main(String[] args) throws InterruptedException {

        String[] searchResult;

        searchResult = new String[5];
        searchResult[0] = "Country";
        searchResult[1] = "State";
        searchResult[2] = "Cars";
        searchResult[3] = "City";
        searchResult[4] = "Hobbies";


        //set system property of the driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        //define the WebDriver with a variable
        WebDriver driver = new ChromeDriver();
        for (String s : searchResult) {

            //navigate to Bing.com
            driver.navigate().to("https://www.Bing.com");

            //maximize window
            driver.manage().window().maximize();

            //wait and then tap search box
            Thread.sleep(3000);
            driver.findElement(By.name("q")).sendKeys(s);
            //sleep
            Thread.sleep(3000);

            //click on google search
            driver.findElement(By.id("sb_form_go")).submit();
            //wait a few seconds
            Thread.sleep(3000);
            //get text from the result

            String message = driver.findElement(By.id("b_tween")).getText();
            String[] arrayMessage = message.split(" ");
            System.out.println("my search result is " + arrayMessage[0]);

            //sleep
            Thread.sleep(3000);

        }//end of loop

        //close all tabs
        driver.quit();

    }//end of main method
}//end of class