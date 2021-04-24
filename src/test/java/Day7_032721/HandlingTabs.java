package Day7_032721;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class HandlingTabs {
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

        driver.navigate().to("https://www.oxhp.com/");
        Thread.sleep(3000);

        //using contains only choose the unique portion of the value
//to click on members link
        driver.findElement(By.xpath("//*[contains(@onmouseover,'/images/home/members_hm_on')]")).click();
        Thread.sleep(3000);
//click on find a physician link
        driver.findElement(By.xpath("//*[contains(text(),'Find a Physician')]")).click();

//using Arraylist we can switch to new tab(1)
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
//switch to new tab 2
        driver.switchTo().window(tabs.get(1));
//click on metro to verify you are on that new tab
        Thread.sleep(1000);
        try {
            driver.findElement(By.xpath("//font[text()='Metro']")).click();
        } catch (Exception e) {
            System.out.println("Unable to click on Metro link. " + e);
        }
//close the new tab
        driver.close();
//switch back to old tab
        driver.switchTo().window(tabs.get(0));











    }//end of main
}//end of class
