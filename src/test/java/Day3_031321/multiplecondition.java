package Day3_031321;

public class multiplecondition {
    public static void main(String[] args) {
        //using multiple condition statements
        int a, b, c;
        a = 2;
        b = 3;
        c = 4;
        //verify either a+b >c, a+b < c, a+b =c
        if (a + b > c) {
            System.out.println("a & b is greater than c ");
        }//end of if condition
        else if (a + b < c) {
            System.out.println(" a & b is less than c");
        }//end of else if condition
        else {
            System.out.println(" a & b is equal to c");

        }//end of multiple conditions
    }//end of main method
}//end of class
