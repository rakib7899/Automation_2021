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

public class Express_SizePage extends Abstract_Class {
    ExtentTest logger;
    public Express_SizePage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.logger= Abstract_Class.logger;
    }//end of constructor class

    //store all elements for page

    //click on Add to bag
    @FindBy(xpath = "//*[text()='Add to Bag']")
    WebElement AddToBag;

    //click on view bag pop up
    @FindBy(xpath = "//*[text()='View Bag']")
    WebElement ViewBag;

    //Create method to click on Size
    public void addSize(String size){
        WebDriverWait wait = new WebDriverWait(driver,8);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[text()='" + size + "']" ))).click();
            logger.log(LogStatus.PASS, "successfully clicked on size" + size);
        }catch (Exception e){
            logger.log(LogStatus.FAIL,"Unable to click on size"+size+" : " + e);
            Reusable_Actions_PageObject.getScreenShot(driver,"size",logger);
        }//end of exception
    }//end of add size method

    //call methods to add to bag & view bag

    public void AddtoBag(){
        Reusable_Actions_PageObject.clickOnElement(driver,AddToBag,logger,"Add To Bag");
    }//end of add to bag

    public void ViewBagPopUp(){
        Reusable_Actions_PageObject.clickOnElement(driver,ViewBag,logger,"View Bag");
    }//end of view bag pop up

    //END OF SIZE PAGE

}//end of java class
