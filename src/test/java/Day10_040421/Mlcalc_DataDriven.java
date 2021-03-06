package Day10_040421;

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

public class Mlcalc_DataDriven {
    public static void main(String[] args) throws IOException, InterruptedException, BiffException, WriteException {
        //set the driver using reusable
        WebDriver driver = Reusable_Methods.defineTheDriverByHeadless();

        //step 1 locate the path for readable file that we created
        Workbook readableBook = Workbook.getWorkbook(new File("src/main/resources/Mlcalc.xls"));

        //step 2 : create a writeable workbook that will mimic the data from readable
        WritableWorkbook writableWorkbook = Workbook.createWorkbook(new File("src/main/resources/Mlcalc_Results.xls"),readableBook);

        //step 3 : read everything from writeable
        WritableSheet writableSheet = writableWorkbook.getSheet(0);

        //step 4 : get the row count
        int rowCount = writableSheet.getRows();

        //STEP 5: THIS is where the for loop will start to iterate through your excel data
        for(int i = 1; i <rowCount; i++){
            //columns are hard coded and row is dynamic(i)
            String pPrice = writableSheet.getCell(0,i).getContents();
            String dPayment = writableSheet.getCell(1,i).getContents();
            String mTerm = writableSheet.getCell(2,i).getContents();
            String iRate = writableSheet.getCell(3,i).getContents();
            String stMonth = writableSheet.getCell(4,i).getContents();
            String stYear = writableSheet.getCell(5,i).getContents();

            //navigate to mlcalc
            driver.navigate().to("https://www.mlcalc.com");
            Thread.sleep(3000);
            //enter the purchase price
            Reusable_Methods.sendKeysMethod(driver,"//input[@id='ma']",pPrice,"Purchase Price");
            //enter the down payment
            Reusable_Methods.sendKeysMethod(driver,"//input[@id='dp']",dPayment,"Down Payment");
            //enter mortgage term
            Reusable_Methods.sendKeysMethod(driver,"//input[@id='mt']",mTerm,"Mortgage Term");
            //enter interest rate
            Reusable_Methods.sendKeysMethod(driver,"//input[@id='ir']",iRate,"Interest Rate");
            //select start month
            Reusable_Methods.dropdownByText(driver,"//select[@name='sm']",stMonth,"Start Month");
            //select start year
            Reusable_Methods.dropdownByText(driver,"//select[@name='sy']",stYear,"Start Year");
            //click on Calculate
            Reusable_Methods.clickOnElement(driver,"//input[@value='Calculate']","Calculate");

            //capture monthly payment
            String monthlyPayment = Reusable_Methods.captureText(driver,"//td[@class='big']",0,"Monthly Payment");

                    //create a label so you can add it to a cell
            Label label = new Label( 6, i, monthlyPayment);
            //add label back to the sheet
            writableSheet.addCell(label);
        }//end of for loop


        //outside of the sell write back to writeable
        writableWorkbook.write();
        //close
        writableWorkbook.close();






    }//end of main
}//end of class
