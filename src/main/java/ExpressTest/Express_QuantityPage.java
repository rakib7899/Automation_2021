package ExpressTest;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Express_QuantityPage extends Abstract_Class {
    ExtentTest logger;
    public Express_QuantityPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//END OF CONSTRUCTOR CLASS

    //Store Elements

    //continue to checkout
    @FindBy(xpath = "//*[text()='Checkout']")
    WebElement Checkout;

    //checkout as guest
    @FindBy(xpath = "//*[text()='Checkout as Guest']")
    WebElement CheckoutAsGuest;

    //Create method for quantity
    public void quantity(String quantity){
        WebDriverWait wait = new WebDriverWait(driver,8);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@value='" + quantity + "']"))).click();
            logger.log(LogStatus.PASS, "successfully clicked on quantity" + quantity);
        }catch (Exception e){
            logger.log(LogStatus.FAIL,"Unable to click on size"+quantity+" : " + e);
            Reusable_Actions_PageObject.getScreenShot(driver,"quantity",logger);
        }//end of exception
    }//end of add quantity method

    //Checkout and guest checkout procedures
    public void checkout(){
        Reusable_Actions_PageObject.clickOnElement(driver,Checkout,logger,"Checkout");
    }//end of checkout

    public void CheckoutasGuest(){
        Reusable_Actions_PageObject.clickOnElement(driver,CheckoutAsGuest,logger,"Checkout As Guest");
    }//end of checkout as guest


    //END OF QUANTITY PAGE

}//END OF JAVA CLASS
