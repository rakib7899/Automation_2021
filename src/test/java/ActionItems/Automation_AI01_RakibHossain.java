package ActionItems;

public class Automation_AI01_RakibHossain {
    public static void main(String[] args) {

        //declare the variables
        String[] zipcode, streetNumber;

        zipcode = new String[4];
        zipcode[0] = "11219";
        zipcode[1] = "11234";
        zipcode[2] = "11210";
        zipcode[3] = "10001";

        streetNumber = new String[4];
        streetNumber[0] = "1227";
        streetNumber[1] = "3657";
        streetNumber[2] = "7890";
        streetNumber[3] = "4315";

        //set your iteration to loop all the values from zipcodes
        for (int i = 0; i<zipcode.length; i++){
            //print out all values in one print statement
            System.out.println("My zip code is " + zipcode[i] + " and my street number is " + streetNumber[i]);
        }//end of for loop

    }//end of main method
}//end of class
