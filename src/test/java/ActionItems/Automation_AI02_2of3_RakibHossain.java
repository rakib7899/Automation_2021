package ActionItems;

public class Automation_AI02_2of3_RakibHossain {
    public static void main(String[] args) {

        /*declare and define the variable "E"
        intended to trick the system so that "Invalid Grade E" may print
        out which is "Default statement
        */

        //declare variable
        String Grade = "E";

//Define Case A - F & print statements below
        switch (Grade) {
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Well Done");
                break;
            case "C":
                System.out.println("Satisfactory");
                break;
            case "D":
                System.out.println("Passed");
            case "F":
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid Grade " + Grade);
        }//end of switch statement
    }//End of main method
}//End of class
