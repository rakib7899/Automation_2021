package Day2_030721;

public class LinearArray {
    public static void main(String[] args) {
        //declare the variables
        String[] cities, countries, locations;
        int[] streetNumber, houseNumber;

        cities = new String[] {"Brooklyn", "Queens", "Manhattan", "Bronx", "Staten Island"};
        streetNumber = new int[]{222, 345, 567, 888, 1000};
        houseNumber = new int[]{2222, 4, 4, 4, 4,};

        //I want to print queens and street number as 222;
        System.out.println(" My city is " +  cities[1] + " and street number is "  +  streetNumber[0] );


    }//End of main method
}//end of class
