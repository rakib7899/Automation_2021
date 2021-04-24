package ExpressTest;

import Page_Object.Google_Home;
import Reusable_Library.Abstract_Class;
import jxl.read.biff.BiffException;

import java.io.IOException;

public class Express_Base_Class extends Abstract_Class {

    //this page class is a static reference for the page object classes
    //so I can use it on my test class
    public Express_Base_Class () throws IOException, BiffException {
    }//BASE CLASS



    public static Express_HomePage expressHomePage(){
        Express_HomePage HomePage = new Express_HomePage(driver);
        return  HomePage;
    }//end of express home page

    public static Express_ProductPage productPage(){
        Express_ProductPage ProductPage = new Express_ProductPage(driver);
        return  ProductPage;
    }//end of product page

    public static Express_SizePage sizePage(){
        Express_SizePage SizePage = new Express_SizePage(driver);
        return  SizePage;
    }//end of Size PAGE

    public static Express_QuantityPage quantityPage(){
        Express_QuantityPage QuantityPage = new Express_QuantityPage(driver);
        return  QuantityPage;
    }//end of quantity page


    public static Express_CheckoutPage checkoutPage(){
        Express_CheckoutPage CheckoutPage = new Express_CheckoutPage(driver);
        return  CheckoutPage;
    }//end of checkout page


    public static Express_PaymentPage paymentPage(){
        Express_PaymentPage PaymentPage = new Express_PaymentPage(driver);
        return  PaymentPage;
    }//end OF PAYMENT PAGE

}//end of JAVA CLASS
