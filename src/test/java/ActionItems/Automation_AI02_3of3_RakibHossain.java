package ActionItems;

public class Automation_AI02_3of3_RakibHossain {
    public static void main(String[] args) {
        //declare cities
        String[] cities = new String[4];
        cities[0] = "Brooklyn";
        cities[1] = "Queens";
        cities[2] = "Manhattan";
        cities[3] = "Staten Island";

        //using for loop print only when city is Brooklyn & Manhattan
        for (int i = 0; i < cities.length; i++) {
            if (cities[i] == "Brooklyn") {

                System.out.println("My city is " + cities[i]);
            } else if (cities[i] == "Manhattan") {
                System.out.println("My city is " + cities[i]);

            }//end of conditional statement
        }//end of for loop
    }//end of main method
}//end of class
