package ActionItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.ArrayList;

public class Automation_AI05_RakibHossain {
    public static void main(String[] args) throws IOException, InterruptedException {
            //kill all drivers
            //Runtime.getRuntime().exec("killall -KILL chromedriver");
        ArrayList<String> FindLocationByZip = new ArrayList<>();
        FindLocationByZip.add("11219");


        ArrayList<String> LocationType = new ArrayList<>();
        LocationType.add("Post Office");
        LocationType.add("Collection Boxes");
        LocationType.add("Self-Service Kiosks");

        ArrayList<String> LocationMiles = new ArrayList<>();
        LocationMiles.add("1");
        LocationMiles.add("10");
        LocationMiles.add("20");



            //set the path to driver
            System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
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
            // navigate to usps.com
            Thread.sleep(3000);
        try {
            driver.navigate().to("https://www.usps.com");
        } catch (Exception e) {
            System.out.println("Unable to navigate to usps. " + e);

        }//end of exception
        for (int i = 0; i < LocationType.size(); i++) {

            Thread.sleep(1000);
            Actions actions = new Actions(driver);

            //hover to send
            try {
                //store your element as webelement
                WebElement Send = driver.findElement(By.xpath("//*[@id='mail-ship-width']"));
                //move your mouse to actions on send for drop down to appear
                actions.moveToElement(Send).perform();
            } catch (Exception e) {
                System.out.println("Unable to click on Send " + e);
            }//end of exception

            //wait a few
            Thread.sleep(1000);
            try {
                //store your element as webelement
                WebElement Location = driver.findElement(By.xpath("//*[@href='https://tools.usps.com/find-location.htm']"));

                //enter mouse action to click on Find Usps Location from drop down
                actions.moveToElement(Location).click().perform();

            } catch (Exception e) {
                System.out.println("Unable to click on Find USPS Locations. " + e);
            }//end of exception

            Thread.sleep(1000);

            try {
                //store your element as webelement
                WebElement Zipcode = driver.findElement(By.xpath("//*[@id='city-state-input']"));

                //enter mouse action to click and enter zipcode
                actions.moveToElement(Zipcode).click().sendKeys(FindLocationByZip.get(i)).perform();
                //Zipcode.sendKeys(FindLocationByZip.get(i));

            } catch (Exception e) {
                System.out.println("Unable to click and Enter Zipcode . " + e);
            }//end of exception
            Thread.sleep(1000);

            try {
                //store your element as webelement
                WebElement Type = driver.findElement(By.xpath("//*[@id='post-offices-select']"));
                driver.findElement(By.xpath("//*[text()=]'"+LocationType.get(i))).click();


            } catch (Exception e) {
                System.out.println("Unable to click on dropdown. " + e);
            }//end of exception
            Thread.sleep(1000);

            try {
                //store your element as webelement
                WebElement Miles = driver.findElement(By.xpath("//*[text()='20 Miles']"));

                //enter mouse action to click and enter zipcode
                actions.moveToElement(Miles).click().perform();


            } catch (Exception e) {
                System.out.println("Unable to click on Miles. " + e);
            }//end of exception

            try {
                //store your element as webelement
                WebElement Search = driver.findElement(By.xpath("//*[@id='searchLocations']"));

                //enter mouse action to click and enter zipcode
                actions.moveToElement(Search).click().perform();


            } catch (Exception e) {
                System.out.println("Unable to click on search. " + e);
            }//end of exception

            try {
                ArrayList<WebElement> links = new ArrayList<>(driver.findElements(By.xpath("//*[@class='row']")));
                if (i == 0) {
                    links.get(0).click();
                } if (i == 1) {
                    links.get(1).click();
                } if (i == 2) {
                    links.get(2).click();
                }
            }catch (Exception e){
                System.out.println("Unable to click on link" + e );
            }









        }//end of loop

        driver.quit();

    }//end of method
}//end of class
