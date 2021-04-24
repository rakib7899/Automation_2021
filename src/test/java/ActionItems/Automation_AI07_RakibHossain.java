package ActionItems;

import Reusable_Library.Abstract_Class;
import Reusable_Library.Reusable_Actions;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class Automation_AI07_RakibHossain extends Abstract_Class {

    @Test
    public void ExpressTest() throws WriteException, InterruptedException, IOException, BiffException {


            //locate the path for readable file that we created in excel
            Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/Express.xls"));

            //create a writable workbook that will mimic the data from readable
            WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/Express_Results.xls"), readableBook);

            //Read everything from writable sheet
            WritableSheet  writableSheet = writableWorkbook.getSheet(0);

            //Get the row count
            int rowCount = writableSheet.getRows();



            //for loop
            for (int i = 1; i < rowCount; i++) {
            //List all values
            String Size = writableSheet.getCell(0, i).getContents();
            String Qty = writableSheet.getCell(1, i).getContents();
            String firstName = writableSheet.getCell(2, i).getContents();
            String Lastname = writableSheet.getCell(3, i).getContents();
            String Email = writableSheet.getCell(4, i).getContents();
            String phone = writableSheet.getCell(5, i).getContents();
            String streetAddress = writableSheet.getCell(6, i).getContents();
            String city = writableSheet.getCell(7, i).getContents();
            String ZipCode = writableSheet.getCell(8, i).getContents();
            String State = writableSheet.getCell(9, i).getContents();
            String ccNumber = writableSheet.getCell(10, i).getContents();
            String expMonth = writableSheet.getCell(11, i).getContents();
            String expYear = writableSheet.getCell(12, i).getContents();
            String cvvCode = writableSheet.getCell(13, i).getContents();

            driver.manage().deleteAllCookies();
            Thread.sleep(1000);

            //Step 1 :Navigate to express.com
            driver.navigate().to("https://www.express.com");
            Thread.sleep(1500);

            //Step 2 : close pop up
            Reusable_Actions.closePopupIfExist(driver, "//*[@id='closeModal']", logger, "close pop up");
            Thread.sleep(1000);

            //Step 3; Hover over to mens tab
            Reusable_Actions.mouseHover(driver, "//*[@href='/mens-clothing']", logger, "mens clothing");

            //Step 4: CLICK ON SWEATERS
            Reusable_Actions.clickOnElement(driver, "//*[text()='Sweatshirts & Hoodies']", logger, "Sweaters");
            Thread.sleep(2000);

            //Step 5: click on first sweater
            Reusable_Actions.clickOnElement(driver, "//*[text()='Soft Double Knit Bomber Sweatshirt']", logger, "Sweatshirt");
            Thread.sleep(2000);

            //Step 6: CLICK ON SIZE
            Reusable_Actions.clickOnElement(driver, "//*[text()='" + Size + "']", logger, "Size");

            //STEP 7 CLICK ON ADD TO BAG
            Reusable_Actions.clickOnElement(driver, "//*[text()='Add to Bag']", logger, "add to bag");
            Thread.sleep(1000);

            //Step 8: CLICK ON VIEW BAG
            Reusable_Actions.clickOnElement(driver, "//*[text()='View Bag']", logger, "View Bag");
            Thread.sleep(2000);


            //Step 9: change the quantity
            Reusable_Actions.dropdownByText(driver, "//*[@id='qdd-0-quantity']", Qty, logger, "Quantity");
            Thread.sleep(1000);

            //Step 10 : click on check out
            Reusable_Actions.clickOnElement(driver, "//*[text()='Checkout']", logger, "Checkout");
            Thread.sleep(1000);

            //STEP 11: CLICK ON CHECKOUT AS GUEST
            Reusable_Actions.clickOnElement(driver, "//*[text()='Checkout as Guest']", logger, "Check out as guest");
            Thread.sleep(1000);

            //Step 12: enter first name
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='firstname']", firstName, logger, "First Name");
            Thread.sleep(1000);

            //Step 13: ENTER LAST NAME
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='lastname']", Lastname, logger, "Last Name");
            Thread.sleep(1000);


            //Step 14: ENTER EMAIL
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='email']", Email, logger, "Email");
            Thread.sleep(1000);

            //Step 15: Re ENTER EMAIL
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='confirmEmail']", Email, logger, "Confirm Email");
            Thread.sleep(1000);

            //Step 16 : enter phone number
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='phone']", phone, logger, "Phone");
            Thread.sleep(1000);

            //Step 17: CLICK ON CONTINUE
            Reusable_Actions.clickOnElement(driver, "//*[text()='Continue']", logger, "Continue");
            Thread.sleep(1000);

            //Step 18 : ENTER SHIPPING INFO
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='shipping.line1']", streetAddress, logger, "Street Address");
            Thread.sleep(1000);

            //Step 19: Enter zipcode
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='shipping.postalCode']", ZipCode, logger, "Zipcode");


            //Step 20: enter city
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='shipping.city']", city, logger, "City");
            Thread.sleep(1000);

            //Step 21: Enter STATE
            Reusable_Actions.dropdownByText(driver, "//*[@name='shipping.state']", State, logger, "State");

            //Step 22: click continue
            Reusable_Actions.clickOnElement(driver, "//*[text()='Continue']", logger, "Continue");
            Thread.sleep(1000);

            //Step 23 : click continue again
            Reusable_Actions.clickOnElement(driver, "//*[text()='Continue']", logger, "Continue");


            //Step 24: enter card number
            Reusable_Actions.sendKeysMethod(driver, "//*[@id='creditCardNumberInput']", ccNumber, logger, "Cc Number");
            Thread.sleep(1000);

            //Step 25: enter exp month
            Reusable_Actions.dropdownByText(driver, "//*[@name='expMonth']", expMonth, logger, "Expiration month");

            //Step 26: enter exp year
            Reusable_Actions.dropdownByText(driver, "//*[@name='expYear']", expYear, logger, "Expiration Year");

            //Step 27 : enter CVV
            Reusable_Actions.sendKeysMethod(driver, "//*[@name='cvv']", cvvCode, logger, "Cvv Code");
            Thread.sleep(1000);

            //STEP 28: Place order
            Reusable_Actions.clickOnElement(driver, "//*[text()='Place Order']", logger, "Place Order");
            Thread.sleep(1000);

            //Step 29: capture error message
            String ErrorMessage = Reusable_Actions.captureText(driver, "//*[@id='rvn-note-NaN']", 0,logger,"Error Message");
            Thread.sleep(1000);


            //capture error message
            Label errMess = new Label(14, i, ErrorMessage);
            writableSheet.addCell(errMess);

        }//end of loop

        writableWorkbook.write();
        writableWorkbook.close();


    }//end of test
}//end of class
