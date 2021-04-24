package ExpressTest;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_HomePage extends Abstract_Class {

    ExtentTest logger;

    public Express_HomePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//end of constructor class

    //using @findbyxpath define all web elements for page

    //Close pop up
    @FindBy(xpath = "//*[@id='closeModal']")
    WebElement closePopUp;

    //Hover to mens tab
    @FindBy(xpath = "//*[@href='/mens-clothing'")
    WebElement HoverToMens;

    //Click on Sweatshirts & Hoodies
    @FindBy(xpath = "//*[text='Sweatshirts & Hoodies']")
    WebElement ClickOnSweatshirts;

    //create methods for each Web element stored
    public  void ClosePopUp(){
        Reusable_Actions_PageObject.closePopupIfExist(driver, closePopUp, logger, "Close Pop Up");
    }//End of CLOSE POP UP STEP

    public void MensTab(){
        Reusable_Actions_PageObject.mouseHover(driver,HoverToMens,logger,"Mens Tab");
    }//end of hover to mens tab

    public void ClickOnSweatshirts(){
        Reusable_Actions_PageObject.clickOnElement(driver,ClickOnSweatshirts,logger,"Sweatshirts & Hoodies");
    }//end of click on sweatshirts

    //END OF EXPRESS HOME PAGE OBJECT
}//end of java class
