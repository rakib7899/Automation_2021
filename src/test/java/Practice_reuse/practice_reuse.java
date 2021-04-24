package Practice_reuse;

public class practice_reuse {

    //create a reusable which will add two numbers and print out the statement
    public static void addTwoNumbers(int number1, int number2) {
        System.out.println("My result is " + (number1 + number2));
    }//end of method

    //create a reusable which will subtract two numbers and print out the statement
    public static int SubtractTwoNumbers(int number1, int number2) {
        int result = number1 - number2;
        System.out.println("My result is " + result);
        return result;
    }//end of method subtract




}//end of class
