package ExpressTest;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_PaymentPage extends Abstract_Class {
    ExtentTest logger;

    public Express_PaymentPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //store all elements

    //creditCard number
    @FindBy(xpath = "//*[@name='creditCardNumber']")
    WebElement creditCard;

    //expirationMonth
    @FindBy(xpath = "//*[@name='expMonth']")
    WebElement expirationMonth;

    //expirationYear
    @FindBy(xpath = "//*[@name='expYear']")
    WebElement expirationYear;

    //cvv
    @FindBy(xpath = "//*[@name='cvv']")
    WebElement cvv;

    //placeOrder
    @FindBy(xpath = "//*[text()='Place Order']")
    WebElement placeOrder;

    //error message
    @FindBy(xpath = "//*[@id='rvn-note-NaN']")
    WebElement errorMsg;


    //create methods for all elements stored above

    //enter card number
    public void CreditCardNumber(String CcNumberValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, creditCard, CcNumberValue, logger, "Credit Card");
    }//end of enter card number

    //EXPIRATION MONTH
    public void ExpirationMonth(String expMonthValue) {
        Reusable_Actions_PageObject.dropdownByText(driver, expirationMonth, expMonthValue, logger, "EXPIRATION MONTH");
    }//END OF EXPIRATION MONTH

    public void ExpirationYear(String ExpYearValue) {
        Reusable_Actions_PageObject.dropdownByText(driver, expirationYear, ExpYearValue, logger, "Expiration Year");
    }//END OF EXPIRATION YEAR

    //CVV
    public void CvvCode(String CvvValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, cvv, CvvValue, logger, "Cvv Code");
    }//end of cvv code

    //PLACE ORDER
    public void PlaceOrder() {
        Reusable_Actions_PageObject.clickOnElement(driver, placeOrder, logger, "Place Order");
    }//END OF PLACE ORDER

    //error message capture
    public void ErrorMessage() {
        Reusable_Actions_PageObject.captureText(driver, errorMsg, 0, logger, "Error Message");
    }//END OF ERROR MESSAGE



    ///END OF PAYMENT PAGE

}//end of java class
