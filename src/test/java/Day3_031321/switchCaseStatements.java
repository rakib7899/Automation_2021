package Day3_031321;

public class switchCaseStatements {
    public static void main(String[] args) {


        /* using switch case statements print
        if milk type is oat milk, almond milk or organic milk
        else milk type is not recognized
        */

        //declare and define the variable for milk
        String milkType = "Soy milk";//soy milk was input purposely "negative testing"


        switch (milkType) {
            case "oat milk":
                System.out.println("Milk type is Oat milk");
                break;
            case "almond milk":
                System.out.println("Milk type is Almond milk");
                break;
            case "organic milk":
                System.out.println("Milk type is Organic milk");
                break;
            default:
                System.out.println("Milk type is not recognized "+milkType);

        }//end of switch statement


    }//end of main
}//end of class
