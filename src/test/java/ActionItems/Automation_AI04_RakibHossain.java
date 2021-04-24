package ActionItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Automation_AI04_RakibHossain {
    public static void main(String[] args) throws Exception {


        //set the path to driver
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");
        //define the chrome options arguments
        ChromeOptions options = new ChromeOptions();

        //set driver to incognito(private)
        options.addArguments("incognito");

        //set it headless
        options.addArguments("headless");

        //define driver
        WebDriver driver = new ChromeDriver(options);
        //maximize browser
        driver.manage().window().maximize();

        //driver navigate to mortgage calculator
        driver.navigate().to("https://www.m.com");
        Thread.sleep(1000);

        //print to verify when running headless
        System.out.println("System is Verifying Title");
        Thread.sleep(1000);

        //verify the title with your expected
        String actualTitle = driver.getTitle();
        if (actualTitle.equals("Auto Loan Calculator")) {
            System.out.println("Title matches");
        } else {
            System.out.println("Title doesn't match " + actualTitle);
        }//end of condition


        /*
        Friendly Note I added a bunch of Print Statements
        so that when I run HEADLESS I know what step or command
        the system is performing !
         */

        Thread.sleep(1000);
        //create 3 different values to put entered for PurchasePrice
        String[] PurchasePrice;
        PurchasePrice = new String[]{"30000", "450000", "700000"};
        for (int i = 0; i < 3; i++) {

            //store home value first
            WebElement Purchaseprice = driver.findElement(By.xpath(("//*[@id='homeval']")));
            //print system command being preformed
            System.out.println("Clearing values");

            //clear the previous data
            Purchaseprice.clear();
            Thread.sleep(1000);


            //print system command being preformed
            System.out.println("Entering Home Value");


            //enter the new home value
            Purchaseprice.sendKeys(PurchasePrice[i]);
            Thread.sleep(1000);
            //create 3 different values for DownPayment
            String[] downPayment;
            downPayment = new String[]{"10000", "20000", "500000"};


            //store down payment
            WebElement dPayment = driver.findElement(By.xpath("//*[@id='downpayment']"));

            //print system command being preformed
            System.out.println("Clearing values");
            Thread.sleep(1000);

            //clear previous data
            dPayment.clear();
            Thread.sleep(1000);

            //print system command being preformed
            System.out.println("Entering Data on Down Payment");
            Thread.sleep(3000);

            //enter new down payment data
            dPayment.sendKeys(downPayment[i]);
            Thread.sleep(1000);

            //Data for Interest rate
            String[] InterestRate = new String[3];
            InterestRate[0] = "2";
            InterestRate[1] = "3";
            InterestRate[2] = "4";

            //Select interest rate clear and store value
            WebElement interestRate = driver.findElement(By.xpath("//*[@id='intrstsrate']"));

            //system print command being performed
            System.out.println("Clearing Values");
            interestRate.clear();

            //system prints command being performed
            System.out.println("Entering interest rate");
            Thread.sleep(2000);

            //enter interest rate data
            interestRate.sendKeys(InterestRate[i]);
            Thread.sleep(1000);

            //State three different values for startmonth
            String[] StartMonth = new String[3];
            StartMonth[0] = "Apr";
            StartMonth[1] = "May";
            StartMonth[2] = "Jan";


            //select april on month
            WebElement startMonth = driver.findElement(By.xpath("//*[@name='param[start_month]']"));

            //print system command being preformed
            System.out.println("System selecting drop down..");
            Thread.sleep(1000);

            //select the locator using select command
            Select dropdown = new Select(startMonth);
            //using by visible txt command select month april
            dropdown.selectByVisibleText(StartMonth[i]);

            //print system command being preformed
            System.out.println("Drop Down Selected");
            Thread.sleep(1000);

            //CREATE 3 DIFFERENT VALUES

            String[] StartYear = new String[3];
            StartYear[0] = "2019";
            StartYear[1] = "2020";
            StartYear[2] = "2021";

            //PRINT COMMAND
            System.out.println("System will now Input Year");
            //Select startYear
            WebElement startYear = driver.findElement(By.xpath("//*[@id='start_year']"));

            Thread.sleep(1000);
            startYear.click();
            Thread.sleep(1000);
            startYear.sendKeys(StartYear[i]);

            Thread.sleep(1000);

            System.out.println("System will now click on Calculate");
            Thread.sleep(1000);

            //click on Calculate
            driver.findElement(By.xpath("//*[@value='Calculate']")).click();
            Thread.sleep(1000);

            //print system command being preformed
            System.out.println("System will now print Monthly Payment");
            Thread.sleep(1000);

            //Capture Monthly payment amount and print it
            String mntPayment = driver.findElements(By.xpath("//div[@class='left-cell']")).get(0).getText();
            String[] arrayMessage = mntPayment.split(" ");

            //print only monthly payment
            System.out.println("My Monthly Payment is " + arrayMessage[0]);
            Thread.sleep(1000);

        }//end of loop
        driver.quit();


    }//end of main method
}//end of class
