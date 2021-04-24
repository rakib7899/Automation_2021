package ExpressTest;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions_PageObject;
import com.relevantcodes.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Express_ProductPage extends Abstract_Class{
    ExtentTest logger;

    public Express_ProductPage(WebDriver driver) {
        PageFactory.initElements(driver,this);
        this.logger = Abstract_Class.logger;
    }//END OF CONSTRUCTOR CLASS

    //Store @findbyxpath web elements

    //Store element for Sweatshirt
    @FindBy(xpath = "//*[text()='Soft Double Knit Bomber Sweatshirt']")
    WebElement Sweatshirt;

    //call method to click on sweatshirt
    public void ClickOnProduct(){
        Reusable_Actions_PageObject.clickOnElement(driver,Sweatshirt,logger,"Click on Sweatshirt");
    }//end of click on Product

    //END OF PRODUCT PAGE

}//End of java class
