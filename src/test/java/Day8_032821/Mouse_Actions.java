package Day8_032821;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.IOException;

public class Mouse_Actions {
    public static void main(String[] args) throws InterruptedException, IOException {
        //kill all drivers
        Runtime.getRuntime().exec("killall -KILL chromedriver");
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
        // navigate to usps.com
        try {
            driver.navigate().to("https://www.usps.com");
        } catch (Exception e) {
            System.out.println("Unable to navigate to usps. " + e);

        }//end of exception
        Thread.sleep(1000);
        Actions actions = new Actions(driver);
        //hover to quick tools
        try {
            //store your element as webelement
            WebElement quickTools = driver.findElement(By.xpath("//*[text()='Quick Tools'] "));
            //move your mouse to actions on quick tools for drop down to appear
            //you always end your mouse actions with .perform()
            actions.moveToElement(quickTools).perform();

        } catch (Exception e) {
            System.out.println("Unable to click on quick tools. " + e);
        }//end of exception

        //wait a few
        Thread.sleep(1000);
        try {
            //store your element as webelement
            WebElement trackPackage = driver.findElement(By.xpath("//*[text()='Track a Package'] "));
            //enter mouse action to click on track a package from drop down
            actions.moveToElement(trackPackage).click().perform();

        } catch (Exception e) {
            System.out.println("Unable to click on Track a package. " + e);
        }//end of exception

        //wait a few
        Thread.sleep(1000);
        //enter a tracking number
        try {
            //store your element as webelement
            WebElement trackingField = driver.findElement(By.xpath("//*[@id='tracking-input']"));
            //mouse action for entering on search field
            actions.moveToElement(trackingField).click().sendKeys("12345678").perform();
        } catch (Exception e) {
            System.out.println("Unable to enter value on tracking field. " + e);
        }//end of exception
Thread.sleep(3000);

        driver.quit();

    }//end of method
}//end of class
