package builtinmethods;

import java.util.Arrays;

public class BuiltinmethodsExample {
    public static void main(String[] args) {
        // first we need to use math function
        double number = Math.sqrt(144); //square root number 
        System.out.println(" the Square root of 144 is: " + number);
        number = Math.pow(2, 4);  // Power of two numbers using math function
        System.out.println("2 to the power of 4 is: " + number);
        number = Math.abs(-123.45);  // Absolute value using math function
        System.out.println("Absolute value of -123.45 is: " + number);

        // Using String class methods
        String str = "TNS foundation";
        String subStr = str.substring(4);  // Substring from index 5
        System.out.println("Substring from index 4 of 'TNS foundation': " + subStr);
        char ch = str.charAt(0);  // Character at index 0
        System.out.println("Character at index 0: " + ch);
        boolean endsWith = str.endsWith("ion");  // Check if ends with "ion"
        System.out.println("Does 'TNS foundation' end with 'ion'? " + endsWith);

        // Using Arrays  methods for sorting the array elements
        int[] array = {10, 5, 3, 2, 7};
        Arrays.sort(array);  // Sort the array elements 
        System.out.println("Sorted array: " + Arrays.toString(array));

        // Searching for a element after sorting the array elements
        int index = Arrays.binarySearch(array, 7);
        System.out.println("Index of 7 in the sorted array: " + index);
    }
}
