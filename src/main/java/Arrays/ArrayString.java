package Arrays;

import java.util.Scanner;

/**
 * @autor Hagel Yuri
 */
public class ArrayString {

    public static void outputMaxLengthElementInArray() {
        String[] array = new String[inputSizeOfArray()];
        insertElementInArray(array);
        findElementWithMaxLenght(array);
    }

    public static int inputSizeOfArray() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter array length: ");
        int size = input.nextInt();
        if (size == 0) {
            System.out.println("Array length can be > 0: ");
            inputSizeOfArray();
        }
        return size;
    }

    public static void insertElementInArray(String array[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert array elements:");

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a '" + i + "' element:");
            array[i] = input.next();

        }
        input.close();
    }

    public static void findElementWithMaxLenght(String array[]) {
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[maxIndex].length() < array[i].length()) {
                maxIndex = i;
            }
        }
        System.out.println("Element with MAX legth: " + array[maxIndex]);
    }
}