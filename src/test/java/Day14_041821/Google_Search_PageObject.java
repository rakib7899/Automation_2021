package Day14_041821;

import Page_Object.Base_Class;
import Reusable_Library.Abstract_Class;
import org.testng.annotations.Test;

public class Google_Search_PageObject extends Abstract_Class {
    @Test
    public void googleSearch(){
        Base_Class.googleHomePage().EnterKeywordOnGoogleSearch("Cars");
        Base_Class.googleHomePage().SubmitOnGoogleSearchButton();
    }//end of java class



}
