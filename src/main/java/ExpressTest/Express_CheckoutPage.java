package ExpressTest;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_CheckoutPage extends Abstract_Class {
    ExtentTest logger;
    public Express_CheckoutPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class



    //store all elements

    //first name
    @FindBy(xpath = "//*[@name='firstname']")
    WebElement firstname;

    //last name
    @FindBy(xpath = "//*[@name='lastname']")
    WebElement lastname;

    //Email
    @FindBy(xpath = "//*[@name='email']")
    WebElement email;

    //confirm Email
    @FindBy(xpath = "//*[@name='confirmEmail']")
    WebElement confirmEmail;

    //PhoneNumber
    @FindBy(xpath = "//*[@name='phone']")
    WebElement PhoneNumber;

    //continue
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement Continue;

    //streetAddress
    @FindBy(xpath = "//*[@name='shipping.line1']")
    WebElement streetAddress;

    //zipCode
    @FindBy(xpath = "//*[@name='shipping.postalCode']")
    WebElement ZipCode;

    //city
    @FindBy(xpath = "//*[@name='shipping.city']")
    WebElement City;

    //state
    @FindBy(xpath = "//*[@name='shipping.state']")
    WebElement State;

    //continue again
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement ContinueAgain;

    //continue last
    @FindBy(xpath = "//*[text()='Continue']")
    WebElement ContinueLast;


    //LIST ALL METHODS FOR EACH ELEMENTS MENTIONED ABOVE

    //enter first name
    public void FirstName(String FirstNameValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,firstname,FirstNameValue,logger,"First Name");
    }//end of first name

    //enter last name
    public void LastName(String LastNameValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,lastname,LastNameValue,logger,"Last Name");
    }//end of last name

    //enter email
    public void Email(String EmailValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,email,EmailValue,logger,"Enter Email");
    }//end of Entering EMAIL

    //confirm email
    public void ConfirmEmail(String ConfirmEmailValue){
        Reusable_Actions_PageObject.sendKeysMethod(driver,confirmEmail,ConfirmEmailValue,logger,"Confirm Email");
    }//end of confirming email

    //enter phone
    public void PhoneNumber(String PhoneValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, PhoneNumber, PhoneValue, logger, "Phone Number");
    }//end of Phone Number

    //click on continue
    public void Continue() {
        Reusable_Actions_PageObject.clickOnElement(driver, Continue, logger, "Continue");
    }//end of click continue


    // enter streetAddress
    public void streetAddress(String AddressValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, streetAddress, AddressValue, logger, "streetAddress");
    }//end of streetAddress methode


    // enter zipCode
    public void zipCode(String ZipCodeValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, ZipCode, ZipCodeValue, logger, "zipCode");
    }//end of ENTER zipCode


    //enter city
    public void EnterCity(String CityValue) {
        Reusable_Actions_PageObject.sendKeysMethod(driver, City, CityValue, logger, "City");
    }//end of enter city


    //enter state
    public void state(String StateValue) {
        Reusable_Actions_PageObject.dropdownByText(driver, State, StateValue, logger, "state");
    }//end of enter state

    //click on continue again
    public void ContinueAgain() {
        Reusable_Actions_PageObject.clickOnElement(driver, ContinueAgain, logger, "Click Continue");
    }//end of click continue again

    //click on continue last
    public void ContinueLast() {
        Reusable_Actions_PageObject.clickOnElement(driver, ContinueLast, logger, "Click Continue Last");
    }//end of click on continue last

    //END OF CHECKOUT PAGE

}//end of java class
