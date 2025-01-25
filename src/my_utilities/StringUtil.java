package my_utilities;

public class StringUtil {

    /**
     * This method fixes the format of the String
     * @param input is provided name (str)
     * @return the fixed format
     * Made by: Ketevan
     */
    public static String fixFormat (String input){

        String result = "";

        result = input.substring(0,1).toUpperCase() + input.substring(1).toLowerCase();

        return result;
    }


    /**
     * This method calculates how many times the given letter is in the given String
     * @param str given String
     * @param letter given letter
     * @return The number of the occurrence letter in String
     * Made by: Ketevan
     */

    public static int frequencyOfLetters (String str, char letter){   // ("apple", 'p')
        int count = 0;

        //char [] arr =  str.toCharArray();
        for (char each : str.toCharArray()) {
            if (each == letter){
                count++;
            }
        }

        return count;
    }


    /**
     * This method returns the reversed version of the String
     * @param str Given String
     * @return Reversed version of the Sting
     * Made by: Ketevan
     */
    public static String reversedString (String str) {
        String reversed = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            reversed += str.charAt( i );
        }
        return reversed;
    }


    /**
     * This method finds the characters which are in the String more than once
     * @param str is given String
     * @return the letters which occurs as a duplicate more than once
     * Made by: Ketevan
     */
    public static String findDuplicateChars (String str){

        String unique = "";
        String duplicates = "";


        for (int i = 0; i < str.length(); i++) {

            int count = 0;
            char eachLetterLoop1 = str.charAt(i);

            if (unique.contains(eachLetterLoop1 + "")) {
                continue;
            }
            for (int j = 0; j < str.length(); j++) {

                char eachLetterLoop2 = str.charAt(j);

                if (eachLetterLoop1 == eachLetterLoop2) {
                    count++;
                }

            }

            if (count > 1) {
                duplicates += eachLetterLoop1;
            }
            if (!unique.contains(eachLetterLoop1 + "")) {
                unique += eachLetterLoop1;
            }

        }
        return duplicates;
    }

    /**
     * This method finds the characters which are in the String just once.
     * @param str is given String
     * @return the unique letters which are only ones in String
     * Made by: Ketevan
     */
    public static String findUniqueCharacters (String str) {
        String unique =  "";

        for (int i = 0; i <str.length(); i++) {

            char eachChar = str.charAt(i);


            if (StringUtil.frequencyOfLetters(str, eachChar)== 1){
                unique += eachChar;
            }

        }


        return unique;
    }

}
