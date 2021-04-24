package ActionItems;

import Reusable_Package.Reusable_Methods;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;

public class Automation_AI06_RakibHossain {
    public static void main(String[] args) throws IOException, InterruptedException, BiffException, WriteException {
        //TO CLOSE POP UP
        //ChromeOptions Options = new ChromeOptions();
        //Options.setUnhandledPromptBehaviour(UnexpectedAlertBehaviour.ACCEPT_AND_NOTIFY);

        //set the driver using reusable
        WebDriver driver = Reusable_Methods.defineTheDriver();

        //step 1 locate the path for readable file that we created
        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/Express.xls"));

        //step 2 : create a writeable workbook that will mimic the data from readable
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/Express_Results.xls"), readableBook);

        //step 3 : read everything from writeable
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //step 4 : get the row count
        int rowCount = writableSheet.getRows();

        //STEP 5: THIS is where the for loop will start to iterate through your excel data
        for (int i = 1; i < rowCount; i++) {

            //store all the values
            String size = writableSheet.getCell(0, i).getContents();
            String quantity = writableSheet.getCell(1, i).getContents();
            String firstName = writableSheet.getCell(2, i).getContents();
            String lastName = writableSheet.getCell(3, i).getContents();
            String email = writableSheet.getCell(4, i).getContents();
            String phone = writableSheet.getCell(5, i).getContents();
            String streetAddress = writableSheet.getCell(6, i).getContents();
            String Zipcode = writableSheet.getCell(7, i).getContents();
            String City = writableSheet.getCell(8, i).getContents();
            String State = writableSheet.getCell(9, i).getContents();
            String ccNumber = writableSheet.getCell(10, i).getContents();
            String expMonth = writableSheet.getCell(11, i).getContents();
            String expYear = writableSheet.getCell(12, i).getContents();
            String cvvCode = writableSheet.getCell(13, i).getContents();

            //delete all cookies
            driver.manage().deleteAllCookies();
            //Step 1: navigate to Express.com
            driver.navigate().to("https://www.express.com");
            Thread.sleep(1000);

            //Close pop up
            Reusable_Methods.clickOnPopUp(driver, "//*[@id='closeModal']", "close pop up");

            Thread.sleep(1000);
            //Step 2 : Hover over to Mens Tab, with mouseHover
            Reusable_Methods.Mousehover(driver, "//*[@href='/mens-clothing']", "mens-clothing");
            Thread.sleep(1000);

            //Step 3: click on sweaters in clothing section
            Reusable_Methods.clickOnElement(driver, "//*[text()='Sweatshirts & Hoodies']", "Sweatshirts & Hoodies");
            Thread.sleep(1000);

            //Step 4: click on first sweater
            Reusable_Methods.clickOnElement(driver, "//*[@href='/clothing/men/black-logo-graphic-hoodie/pro/05328642/color/Pitch Black']", "Black Logo Graphic Hoodie");
            Thread.sleep(1000);

            //Step 5 : click on size
            Reusable_Methods.clickOnElement(driver, "//*[text()='" + size + "']", "Size");

            //Step 6: click add to dag
            Reusable_Methods.clickOnElement(driver, "//*[text()='Add to Bag']", "Add to Bag");
            Thread.sleep(1000);
            //Step 7: click on View bag
            Reusable_Methods.clickOnElement(driver, "//*[text()='View Bag']", "View Bag");
            Thread.sleep(2000);

            //Step 8: change quantity
            Reusable_Methods.dropdownByText(driver, "//*[@id='qdd-0-quantity']", quantity, "Quantity");

            //Step 9: click checkout
            Reusable_Methods.clickOnElement(driver, "//*[text()='Checkout']", "Checkout");
            Thread.sleep(1000);

            //Step 10: click on continue as guest
            Reusable_Methods.clickOnElement(driver, "//*[text()='Checkout as Guest']", "Checkout as Guest");
            Thread.sleep(1000);

            //Step 11: enter first name
            Reusable_Methods.sendKeysMethod(driver, "//*[@name='firstname']", firstName, "First Name");
            Thread.sleep(1000);

            //Step 12: enter Last name
            Reusable_Methods.sendKeysMethod(driver, "//*[@name='lastname']", lastName, "Last Name");
            Thread.sleep(1000);

            //Step 13: enter email
            Reusable_Methods.sendKeysMethod(driver, "//*[@name='email']", email, "Email");
            Thread.sleep(1000);

            //Step 14: re-enter email
            Reusable_Methods.sendKeysMethod(driver, "//*[@name='confirmEmail']", email, "Confirm Email");
            Thread.sleep(1000);

            //Step 15: Phone number
            Reusable_Methods.sendKeysMethod(driver, "//*[@name='phone']", phone, "Phone Number");
            Thread.sleep(1000);

            //Step 16: click on continue
            Reusable_Methods.clickOnElement(driver, "//*[text()='Continue']", "Continue");
            Thread.sleep(1000);

            //Step 17: enter address
            Reusable_Methods.sendKeysMethod(driver, "//*[@name='shipping.line1']", streetAddress, "Address");
            Thread.sleep(1000);

            //Step 18: enter valid zipcode
            Reusable_Methods.sendKeysMethod(driver, "//*[@name='shipping.postalCode']", Zipcode, "Postal Code");
            Thread.sleep(1000);

            //Step 19:enter City
            Reusable_Methods.sendKeysMethod(driver, "//*[@name='shipping.city']", City, "City");
            Thread.sleep(1000);

            //Step 20 : Enter State
            Reusable_Methods.dropdownByText(driver, "//*[@name='shipping.state']", State, "State");
            Thread.sleep(1000);

            //Step 21: click continue
            Reusable_Methods.clickOnElement(driver, "//*[text()='Continue']", "Continue");
            Thread.sleep(3000);

            //click continue again
            Reusable_Methods.clickOnElement(driver, "//*[text()='Continue']", "Continue");
            Thread.sleep(3000);

            //Step 22: enter credit card
            Thread.sleep(1000);
            Reusable_Methods.sendKeysMethod(driver, "//*[@id='creditCardNumberInput']", ccNumber, "Card Number");

            //Step 23: enter month
            Reusable_Methods.dropdownByText(driver, "//*[@name='expMonth']", expMonth, "Expiration Month");

            //Step 24: enter year
            Reusable_Methods.dropdownByText(driver, "//*[@name='expYear']", expYear, "Expiration Year");

            //Step 25: enter cvv
            Reusable_Methods.sendKeysMethod(driver, "//*[@name='cvv']", cvvCode, "Cvv Code");

            //Step 26: click on place order
            Reusable_Methods.clickOnElement(driver, "//*[text()='Place Order']", "Place Order");
            Thread.sleep(3000);

            //Step 27: capture error message
            String Error = Reusable_Methods.captureText(driver, "//*[@id='rvn-note-NaN']", 0, "Error Message");
            Thread.sleep(2000);

            //Capturing error message
            Label errMess = new Label(14, i, Error);
            writableSheet.addCell(errMess);

        }//end of loop

        writableWorkbook.write();

        writableWorkbook.close();

        driver.quit();


    }//end of main
}//end of class
