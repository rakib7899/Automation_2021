package ActionItems;

public class Automation_AI02_1of3_RakibHossain {
    public static void main(String[] args) {
        //declare the integer variables
        int grade = 90;

        //set If condition for Grade 90 to 100
        if (grade >= 90 && grade <= 100) {
            //print grade is A
            System.out.println("Grade is A");
            // set else if condition for Grade 80 less than 90
        } else if (grade >= 80 && grade < 90) {
            // print grade is B
            System.out.println("Grade is B ");
            //set else if condition for Grade 70 to less than 80
        } else if (grade >= 70 && grade < 80) {
            //print grade is C
            System.out.println("Grade is C");
            //set else if condition for Grade 60 to less than 70
        } else if (grade >= 60 && grade < 70) {
            System.out.println("Grade is D");
        } else {
            System.out.println("Grade is F");







        }//end of conditional Statements
    }//end of main method
}//end of class

