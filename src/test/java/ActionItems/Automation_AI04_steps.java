package ActionItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Automation_AI04_steps {
    public static void main(String[] args) {
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

        String[] Purchaseprice, DownPayment,Loanterm, Pmi, Startmonth,StartYear;
        Purchaseprice = new String[3];
        Purchaseprice [0]="300000";
        Purchaseprice [1]="300500";
        Purchaseprice [2]="300600";

        DownPayment = new String[3];
        DownPayment [0]="40000";
        DownPayment [1]="70500";
        DownPayment [2]="30000";

        Loanterm = new String[3];
        Loanterm [0]="10";
        Loanterm [1]="5";
        Loanterm [2]="15";

        Pmi = new String[3];
        Pmi [0]="5";
        Pmi [1]="4";
        Pmi [2]="2";

        Startmonth = new String[3];
        Startmonth [0]="Jan";
        Startmonth [1]="Apr";
        Startmonth [2]="May";

        StartYear = new String[3];
        StartYear [0]="2019";
        StartYear [1]="2020";
        StartYear [2]="2021";

        //loop begins

        driver.navigate().to("https://www.mlcalc.com");
        for (int i = 0; i < 3; i++) {

            //verify the title with your expected
            String actualTitle = driver.getTitle();
            if (actualTitle.equals("Auto Loan Calculator")) {
                System.out.println("Title matches");
            } else {
                System.out.println("Title doesn't match " + actualTitle);
            }//end of condition

            WebElement pPrcie = driver.findElement(By.xpath("//*[@id='ma' or @name='ma'] "));
            WebElement dPayment = driver.findElement(By.xpath("//*[@id='dp']"));
            WebElement mTerm = driver.findElement(By.xpath("//*[@id='mt']"));
            WebElement iRate = driver.findElement(By.xpath("//*[@='ir']"));
            WebElement stMonth = driver.findElement(By.xpath("//*[@='']"));
            WebElement stYear = driver.findElement(By.xpath("//*[@='']"));
            WebElement Calculate = driver.findElement(By.xpath("//*[@='']"));


            pPrcie.clear();
            pPrcie.sendKeys(Purchaseprice[i]);

            dPayment.clear();
            dPayment.sendKeys(DownPayment[i]);

            mTerm.clear();
            mTerm.sendKeys(Loanterm[i]);

            iRate.clear();
            iRate.sendKeys(Pmi[i]);

            Select dropdown = new Select(stMonth);







        }//end of loop




    }//end of method
}//end of class
