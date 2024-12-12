package my_utilities;

import java.util.Arrays;

public class ArrayUtil {
    /**
     * The method returns the minimum value in the given int array
     *
     * @param arr
     * @return int
     */
    public static int minNumInArr(int[] arr) {
        int min = 0;
        Arrays.sort(arr);

        min = arr[0];

        return min;
    }

    /**
     * This method return the maximum value in the given in array
     *
     * @param arr
     * @return int
     */
    public static int maxNumInArr(int[] arr) {
        int max = 0;
        Arrays.sort(arr);

        max = arr[arr.length - 1];

        return max;
    }

    /**
     * This method returns boolean result whether given int array contains the given number
     * @param arr given array
     * @param num given number
     * @return boolean
     * Made by: Ketevan
     */
    public static boolean contains (int [] arr, int num){
        boolean result = false;

        for (int each : arr){
            if (each == num){
                result = true;
                break;
            }
        }
        return result;
    }
}
