package day04_varibles;

public class OlympicsDoneInClass {

    public static void main(String[] args) {

        int year;

        year = 2026;
        System.out.println("China " + year);
        year = 2030;
        System.out.println("France " + year);
        year= 2034;
        System.out.println("Italy " + year);

        System.out.println("-----------------------");

        // We made this sample to make our code more DYNAMIC
        year = 2027;
        System.out.println("China " + year);
        year = year + 4;
        System.out.println("France " + year);
        year = year + 4;
        System.out.println("Italy " + year);

    }

}
