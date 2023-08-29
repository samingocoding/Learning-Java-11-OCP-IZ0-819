package arry_functions;

import java.util.Arrays;
import java.util.List;

public class Arraycomparison {
    public static void main(String[] args) {

        // Set up some array data for comparison.
        String[] firstString = {"abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"};
        String[] copyOfFirstString = {"abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"};
        String[] firstStringUnsorted = {"jkl", "mno", "pqr", "stu", "vwx",
                "yz", "abc", "def", "ghi"};
        String[] partialFirstString = {"abc", "def", "ghi", "jkl", "mno"};

        String firstStringReference[] = firstString;

        // Create pass-thru Lists from the arrays to test List equality
        List firstList = Arrays.asList(firstString);
        List secondList = Arrays.asList(copyOfFirstString);
//
//        // First, compare arrays using object.equals
//        System.out.println("------------- Object.equals checks refrence ------------");
//        System.out.println(" (firstString.equals(copyOfFirstString)) f = "
//                + firstString.equals(copyOfFirstString));
//        System.out.println(" (firstString.equals(firstStringReference))t = "
//                + firstString.equals(firstStringReference));
//
//        // Compare arrays using Arrays.equals
//        System.out.println("\n------------- Arrays.equals checks elements------------");
//        System.out.println(" (Arrays.equals(firstString,copyOfFirstString)) t = "
//                + Arrays.equals(firstString, copyOfFirstString));
//        System.out.println(" (Arrays.equals(firstString,firstStringReference)) t = "
//                + Arrays.equals(firstString, firstStringReference));
//        System.out.println(" (Arrays.equals(firstString,firstStringUnsorted)) f= "
//                + Arrays.equals(firstString, firstStringUnsorted));
//
//        // Compare arrays using Arrays.compare
//        System.out.println("\n------------- Arrays.compare ------------");
//        System.out.println(" (Arrays.compare(firstString,copyOfFirstString)) 0 = "
//                + Arrays.compare(firstString, copyOfFirstString));
//        System.out.println(" (Arrays.compare(firstString,firstStringReference)) 0 = " +
//                "" + Arrays.compare(firstString, firstStringReference));
//        System.out.println(" (Arrays.compare(firstString,firstStringUnsorted)) -?= "
//                + Arrays.compare(firstString, firstStringUnsorted));
//        System.out.println(" (Arrays.compare(firstStringUnsorted,firstString)) ?= "
//                + Arrays.compare(firstStringUnsorted, firstString));
//        System.out.println(" (Arrays.compare(firstString,partialFirstString)) 4= "
//                + Arrays.compare(firstString, partialFirstString));
//        System.out.println(" (Arrays.compare(partialFirstString,firstString)) -4 = "
//                + Arrays.compare(partialFirstString, firstString));


        // More examples of Arrays.compare
        System.out.println("\n------------- More Arrays.compare ------------");
        System.out.println(" (Arrays.compare(firstString,firstStringUnsorted)) -9 = "
                + Arrays.compare(firstString, firstStringUnsorted));

        // If we compare the first elements, we get the same result as comparing the full arrays...
        System.out.println("firstString[0].compareTo(firstStringUnsorted[0] -? = "
                + firstString[0].compareTo(firstStringUnsorted[0]));
                                        //{"abc", "def", "ghi", "jkl", "mno","pqr", "stu", "vwx", "yz"};
        //  New String array, only  first 3 elements are shared with firstString - the prefix.
        String[] notFullyPrefixedString = {"abc", "def", "ghi", "yz", "vwx", "stu"};
        System.out.println(" (Arrays.compare(firstString,notFullyPrefixedString)) -?= "
                + Arrays.compare(firstString, notFullyPrefixedString));

        // Verify that above result is same as comparing elements at  first non-matching index..
        System.out.println("firstString[3].compareTo(notFullyPrefixedString[3]  -? = " +
                firstString[3].compareTo(notFullyPrefixedString[3]));


        // Comparing subsets of elements in arrays
        System.out.println("\n----  Arrays.compare for Element Ranges ----");

        // Set up arrays - note that both arrays contain "abc", "def", "ghi"
        String[] stringArray = {"abc", "def", "ghi", "jkl", "mno",
                "pqr", "stu", "vwx", "yz"};

        String[] stringUnsortedArray = {"jkl", "mno", "pqr", "stu",
                "vwx", "yz", "abc", "def", "ghi"};

        // We are going to compare the 1st 3 elements of the ordered array,
        // with the last 3 elements of the unsorted array:
        System.out.println(" (Arrays.compare(stringArray, 0, 3, stringUnsortedArray, 6, 9)) +1= "
                + Arrays.compare(stringArray, 0, 3, stringUnsortedArray, 6, 9));

        System.out.println("\"abc\", \"def\", \"ghi\", \"jkl\" vs  \"abc\", \"def\", \"ghi\" ");
        // Interestingly, you do not have to specify the same number of elements.
        System.out.println(" (Arrays.compare(stringArray, 0, 5, stringUnsortedArray, 6, 9)) +3 = "
                + Arrays.compare(stringArray, 0, 5, stringUnsortedArray, 6, 9));

        System.out.println("\n------------- List.equals ------------");
        System.out.println(" (firstList.equals(secondList)) = "
                + firstList.equals(secondList));

        System.out.println("Testing lists and Arrays");
//
//        List firstList = Arrays.asList(firstString);
//        List secondList = Arrays.asList(copyOfFirstString);

        firstList.set(2, "drf");
        //changing the list changes the original array

        System.out.println("printing original first array" + Arrays.toString(firstString));

        System.out.println("printing changed list "+ firstList.toString());




    }
}
