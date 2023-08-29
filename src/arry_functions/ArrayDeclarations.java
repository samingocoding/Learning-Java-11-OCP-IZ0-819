package arry_functions;

import java.util.Arrays;

public class ArrayDeclarations {

    public static void main(String[] args) {
        String[] sam = new String[]{"sam", "sad", "rew"};

        // Create two arrays, one of Integer, one of int

        // elements initialized to null
        Integer[] integerArray = new Integer[5];

        // elements initialized to 0
        int[] intArray = new int[5];

        // Arrays.toString() prints elements as comma delimited String
        System.out.println("---------- Default Values -----------");
        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));

        // loop condition uses length attribute of one of the arrays.
        for (int i = 0; i < intArray.length; i++) {

            // Set data on arrays, autoboxing occurs for integerArray
            integerArray[i] = intArray[i] = (i + 1);
        }
        System.out.println("\n--------- Values after the Loop ----------");
        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));

        // Access a single element in array
        intArray[2] = 10;
        integerArray[0] = 99;

        System.out.println("\n---------- Final Values -----------");

        // Arrays.toString() prints elements as comma delimited String
        System.out.println("intArray = "
                + Arrays.toString(intArray));
        System.out.println("integerArray ="
                + Arrays.toString(integerArray));

    }
}
