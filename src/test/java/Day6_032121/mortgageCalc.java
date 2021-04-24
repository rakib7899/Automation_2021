package Day6_032121;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class mortgageCalc {
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

        //driver navigate to mortgage calculator
        driver.navigate().to("https://www.mortgagecalculator.org");
        Thread.sleep(3000);

        //print to verify when running headless
        System.out.println("System is Verifying Title");
        Thread.sleep(3000);

        //verify the title with your expected
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Mortgage Calculator")) {
            System.out.println("Title matches");
        } else {
            System.out.println("Title doesn't match" + actualTitle);
        }//end of condition

        Thread.sleep(3000);

        //store home value first
        WebElement homeValue = driver.findElement(By.xpath("//*[@id='homeval']"));

        //print system command being preformed
        System.out.println("Clearing values");

        //clear the previous data
        homeValue.clear();
        Thread.sleep(3000);

        //print system command being preformed
        System.out.println("Entering Home Value");


        //enter the new home value
        homeValue.sendKeys("350000");
        Thread.sleep(3000);


        //store down payment
        WebElement dPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));

        //print system command being preformed
        System.out.println("Clearing values");
        Thread.sleep(3000);

        //clear previous data
        dPayment.clear();
        Thread.sleep(3000);

        //print system command being preformed
        System.out.println("Entering Data on Down Payment");
        Thread.sleep(3000);

        //enter new down payment data
        dPayment.sendKeys("220000");
        Thread.sleep(3000);

        //select april on month
        WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

        //print system command being preformed
        System.out.println("System is selecting drop down");
        Thread.sleep(3000);

        //select the locator using select command
        Select dropdown = new Select(startMonth);
        //using by visible txt command select month april
        dropdown.selectByVisibleText("Apr");

        //print system command being preformed
        System.out.println("Drop Down April Selected");
        Thread.sleep(3000);

        /*
        if dropdown is not under select tag then you have to use the click commmand twice
        //print system command being preformed
        //System.out.println("System will now Click on dropdown");

        //click on dropdown
       //startMonth.click();
        //print system command being preformed
        System.out.println("System will now Click on May");

         */

        //print system command being preformed
        System.out.println("System will now click on Calculate");
        Thread.sleep(3000);

        //click on Calculate
        driver.findElement(By.xpath("//*[@value='Calculate']")).click();
        Thread.sleep(3000);

        //print system command being preformed
        System.out.println("System will now print Monthly Payment");
        Thread.sleep(3000);

        //Capture Monthly payment amount and print it
        //Capture Monthly payment amount and print it
        String mntPayment = driver.findElements(By.xpath("//div[@class='left-cell']")).get(0).getText();
        String[] arrayMessage = mntPayment.split(" ");

        //print only monthly payment
        System.out.println("My Monthly Payment is " + arrayMessage[0]);
        Thread.sleep(1000);


        //print system command being preformed
        System.out.println("SUCCESS!");



        driver.quit();


    }//end of main method
}//end of class
