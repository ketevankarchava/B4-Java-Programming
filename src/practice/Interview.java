package practice;

import java.util.Scanner;

public class Interview {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        System.out.println("What is the value of the score? ");
        int value = key.nextInt();
        System.out.println("Your score is " + value );

        if (value >= 45){
            System.out.println("You passed");
        }else {
            System.out.println("You failed");
        }

    }

}