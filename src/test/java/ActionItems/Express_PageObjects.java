package ActionItems;

import ExpressTest.Express_Base_Class;
import Reusable_Library.Abstract_Class;
import org.testng.annotations.Test;

public class Express_PageObjects extends Abstract_Class {

    @Test
    public void
    Express_PageObjects()throws InterruptedException{
        driver.navigate().to("https://www.express.com/");
        Thread.sleep(3000);



        //Call Home page

        Express_Base_Class.expressHomePage().ClosePopUp();
        Thread.sleep(1000);
        Express_Base_Class.expressHomePage().MensTab();
        Express_Base_Class.expressHomePage().ClickOnSweatshirts();

        Thread.sleep(2500);

        //call base class and page and method to click first product
        Express_Base_Class.productPage().ClickOnProduct();

        Thread.sleep(2500);

        //Now CALL SIZE PAGE

        Express_Base_Class.sizePage().addSize("S");
        Express_Base_Class.sizePage().AddtoBag();
        Express_Base_Class.sizePage().ViewBagPopUp();

        Thread.sleep(2500);

        //THEN CALL QUANTITY PAGE

        Express_Base_Class.quantityPage().quantity("3");
        Express_Base_Class.quantityPage().checkout();
        Express_Base_Class.quantityPage().CheckoutasGuest();

        Thread.sleep(2500);

        //FOLLOWING CHECKOUT PAGE
        Express_Base_Class.checkoutPage().FirstName("Jack");
        Express_Base_Class.checkoutPage().LastName("Harlow");
        Express_Base_Class.checkoutPage().Email("JackHarlow000@gmail.com");
        Express_Base_Class.checkoutPage().ConfirmEmail("JackHarlow000@gmail.com");
        Express_Base_Class.checkoutPage().PhoneNumber("9172223366");
        Express_Base_Class.checkoutPage().Continue();
        Express_Base_Class.checkoutPage().streetAddress("4307 12th ave");
        Express_Base_Class.checkoutPage().zipCode("11219");
        Express_Base_Class.checkoutPage().EnterCity("Brooklyn");
        Express_Base_Class.checkoutPage().state("NY");
        Express_Base_Class.checkoutPage().ContinueAgain();
        Thread.sleep(2500);
        Express_Base_Class.checkoutPage().ContinueLast();

        //lastly payment page
        Express_Base_Class.paymentPage().CreditCardNumber("4539684352029022");
        Express_Base_Class.paymentPage().ExpirationMonth("11");
        Express_Base_Class.paymentPage().ExpirationYear("22");
        Express_Base_Class.paymentPage().CvvCode("333");
        Express_Base_Class.paymentPage().PlaceOrder();
        Express_Base_Class.paymentPage().ErrorMessage();




    }//END OF TEST

}//end of java class
