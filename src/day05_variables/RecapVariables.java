package day05_variables;

public class RecapVariables {

    public static void main(String[] args) {

        // Declared ome variables [LOCAL VARIABLES, inside main method]
        byte numOfTeaCup;
        double totalPrice;
        int numOfTotalStudents;

        // ASSIGNING / INITIALIZING the variables
        numOfTeaCup = 4;
        totalPrice = 20.0;
        numOfTotalStudents = 30;

        System.out.println(numOfTeaCup);
        System.out.println(totalPrice);
        System.out.println(numOfTotalStudents);

        System.out.println("---------------");

        System.out.println(numOfTeaCup * numOfTotalStudents); // int *int
        System.out.println(numOfTeaCup + "*" + numOfTotalStudents); // int + String + int

        System.out.println("---------------");

        // Declare and Assign in ONE statement together
        double temperature = 67.7;
        int day = 4;
        System.out.println("Today is " + 4 + " th day of the week"); // HARDCODED
        System.out.println("Today is " + day + " th day of the week\n"); // DYNAMIC CODE
        // for new line /n on line 32 at the end, or println on next line, or \n in 34 at the beginning.
        System.out.println("Today the temperature was " + temperature + " degree");

        System.out.println("---------------");

        System.out.println("Test: " + 4 + 5); //Test: 45
        System.out.println("Test: " + (4 + 5)); // Test: 9


        int i1 = 5, i2 = 6, i3 = 8; // same datatype can be declared together



    }



}
