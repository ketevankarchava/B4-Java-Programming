//package day18_loops;
//
//import java.util.Scanner;
//
//public class RemoveDuplicates {
//    public static void main(String[] args) {
//        Scanner key = new Scanner(System.in);
//        System.out.print("Please, enter a word: ");
//        String word = key.next();
//        String unique = "";
//        int duplicates = 0;
//
//
//        for (int i = 0; i < word.length(); i++) {
//            char eachChar = word.charAt(i);
//
//            if (!unique.contains("" + eachChar)){
//                unique += eachChar;
//            }else {
//                duplicates++;
//            }
//
//        }
//
//        System.out.println(unique);
//        System.out.println(duplicates);
//    }
//}


package day18_loops;
/*
    Remove Duplicates
        Write a program that can remove duplicates from a String / keep one character from each.
         Ex:
                Input: abcabbcd
                Output: abcd
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "sdjkfhdskjhfskdjfh";
        String unique = "";


        for (int i = 0; i < str.length(); i++) {

            char eachChar = str.charAt(i);

            // if unique DOES NOT have eachChar, then add
            if (!unique.contains("" + eachChar)){
                unique += eachChar;
            }

        }

        System.out.println("Original: " + str);
        System.out.println("Uniques: " + unique);


    }


}