package Day12_041121;

import Reusable_Library.Abstract_Class;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;

public class GettingLinkCount extends Abstract_Class {


    @Test
    public void LinkCount() throws IOException, InterruptedException {
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(3000);

        //store arraylist with class attribute for the links
        ArrayList<WebElement> LinkCount = new ArrayList<>(driver.findElements(By.xpath("//*[contains(@class,'_yb_12gb1')]")));
//print out the count of the links
        System.out.println("Link count is " + LinkCount.size());

//I want to click on each link and navigate back to the home page
        for (int i = 0; i < LinkCount.size(); i++) {
            driver.navigate().to("https://www.yahoo.com");
            Thread.sleep(3500);
            LinkCount.get(i).click();
            Thread.sleep(2000);
        }//end of for loop


    }//end of link count test
}//end of class
