package datatypes;

import java.util.Arrays;

/***
 * Strings, Arrays
 */
public class NonPrimitive {
    public static void main(String[] args) {
        myStr("Smith");
        stringImportantMethods();
        intArrays();
        stringArray(new String[]{"Mazda", "BMW"});
        multidimensionalArrays();
    }
    public static void myStr(String name) {
        String str = "hello world";
        str += "\nmy name is " + name;

        System.out.println(str);
    }

    /***
     *
     *  https://www.journaldev.com/33358/java-string-functions-methods
         length()
         isEmpty(), isBlank()
         charAt()
         getChars(), toCharArray()
         getBytes()
         equals(), hashCode() and equalsIgnoreCase()
         contentEquals()
         compareTo() and compareToIgnoreCase()
         startsWith() and endsWith()
         indexOf() and lastIndexOf()
         substring() and subSequence()
         concat()
         matches()
         replace(), replaceFirst(), and replaceAll()
         contains()
         split()
         join()
         toLowerCase() and toUpperCase()
         trim(), strip(), stripLeading(), and stripTrailing()
         lines()
         indent()
         transform()
         format()
         intern()
         valueOf() and copyValueOf()
         repeat()
         describeConstable() and resolveConstantDesc()
         formatted(), stripIndent(), and translateEscapes()
     */
    public static void stringImportantMethods() {
        String s = "Hello world";

        //length is 0
        System.out.println(s.length());

    }

    public static void intArrays() {
        //set int array
        int[] intArray = new int[3];
        for(int i=0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        System.out.println(Arrays.toString(intArray));

        //age
        int[] age = new int[]{40, 50, 60};
        System.out.println("Age array length = " + age.length);
        System.out.println("First age element = " + age[0]);
        System.out.println("Age = " + Arrays.toString(age));
        age[0] = 3;
        System.out.println("Age = " + Arrays.toString(age));

        //numbers
        int[] numbers = {2, -8, 10};
        System.out.println("Numbers = " + Arrays.toString(numbers));

    }

    public static void stringArray(String[] stringArray) {
        System.out.println("String array length = " + stringArray.length);
        System.out.println("String array reference = " + stringArray);
        System.out.println("String array elements = " + Arrays.toString(stringArray));
    }

    public static void multidimensionalArrays() {
        int[][] multidimensionalArray = new int[2][];
        multidimensionalArray[0] = new int[2];
        multidimensionalArray[1] = new int[2];

        multidimensionalArray[0][0] = 1;
        multidimensionalArray[0][1] = 2;
        multidimensionalArray[1][0] = 3;
        multidimensionalArray[1][1] = 4;

        System.out.println("Numbers = " + Arrays.deepToString(multidimensionalArray));
    }


}
