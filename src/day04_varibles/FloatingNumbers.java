package day04_varibles;

public class FloatingNumbers {

    public static void main(String[] args) {


        // In java we cannot store the fraction with int datatypes
        System.out.println(3/4); // 0.75 --- int gives whole number portion --- 0
        System.out.println(13/4); // 3.25 --- int gives whole number portion --- 3

        // That is why we have floating type datatypes
        double price = 10.99; // this is the way to store decimal numbers with fractions
        float gpa= 3.4f; // This is another way to store decimal number with fractions (used with f at the end)

        System.out.println(price); // Datatype is double
        System.out.println(gpa); // Datatype is float
        System.out.println(5.6); // Datatype is Double by DEFAULT
        System.out.println(3.0/4); // double/int (PROMOTION)
        System.out.println(13/4.0); //order doesn't matter (PROMOTION)
        System.out.println(13.0/4); //order doesn't matter (PROMOTION)



    }


}
