package day04_varibles;

public class Fruits {

    public static void main(String[] args) {

       int apples = 70;
       int grapes = 80;
       int bananas = 100;


        // println statement, in parentheses we have double quotes with statement + value (int)
        // + ----- CONCATENATION / PLUS (MATH)
        System.out.println("This is how many apples I have: " + 60); // The value 60 --- HARDCODED
        System.out.println("This is how many apples I have: " + apples); // The apples is a variable --- DYNAMICALLY


        System.out.println(grapes); // grapes.sout
        System.out.println("grapes = " + grapes); // grapes.soutv
        System.out.println("bananas = " + bananas);

        System.out.println("------------------------");

        System.out.println("I sold 30 apples");
        apples = 40; //reassigned a variable
        System.out.println("This is how many apples I have after the sale: " + apples);


        System.out.println("------------------------");
        double price = 18.99;
        // "" --- String
        // + --- Concatenation
        // "" --- Sting
        System.out.println("The discounted price for all the left over apples is $" + "15.99"); // HARDCODED
        System.out.println("The discounted price for all the left over apples is $" + price); // DYNAMIC

        System.out.println("------------------------");
        // CONCATENATION vs plus (math)
        System.out.println(50 + 50); // plus (math) --- 100
        System.out.println("50" + 50); // CONCATENATION --- 5050

        System.out.println(10 + 10 + "10" + 10 + 10);
        // int + int + String + int + int
        // String plus int is String (after first String, everything becomes String)



    }

}
