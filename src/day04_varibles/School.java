package day04_varibles;

public class School {

    public static void main(String[] args) {

        int numberOfStudentsInGrade1 = 20;
        int numberOfStudentsInGrade2 = 30;
        int numberOfStudentsInGrade3 = 40;
        int numberOfStudentsInGrade4 = 50;
        int numberOfStudentsInGrade5 = 60;

        int totalStudentNumber = numberOfStudentsInGrade1 + numberOfStudentsInGrade2 + numberOfStudentsInGrade3 + numberOfStudentsInGrade4 + numberOfStudentsInGrade5;

        // System.out.println(totalStudentNumber);

        double numberOfDaysInAYear = 100.5;
        double numOfSnowDays = 12.5;
        double averageGpa = 2.6;

        System.out.println("Number of Students in Grade 1: " + numberOfStudentsInGrade1);
        System.out.println("Number of Students in Grade 2: " + numberOfStudentsInGrade2);
        System.out.println("Number of Students in Grade 3: " + numberOfStudentsInGrade3);
        System.out.println("Number of Students in Grade 4: " + numberOfStudentsInGrade4);
        System.out.println("Number of Students in Grade 5: " + numberOfStudentsInGrade5);

        System.out.println();

        System.out.println("Total Student Numbers in our School:\t " + totalStudentNumber);
        System.out.println("Number of School Days:\t\t\t\t\t " + numberOfDaysInAYear);
        System.out.println("Number of Snow Days:\t\t\t\t\t " + numOfSnowDays);
        System.out.println("Average GPA:\t\t\t\t\t\t\t " + averageGpa);





    }



}
