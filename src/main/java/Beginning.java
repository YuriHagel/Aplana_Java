import  Arrays.ArrayString;
import Arrays.Swap;
import Box.HolidayGift;
import Calculator.Calculator;

import java.util.Scanner;

public class Beginning {
    public static void choseTask() {
        Scanner in = new Scanner(System.in);
        System.out.println("HOMEWORK \n" +
                "Enter number of task :\n" +
                "Calculator\n" +
                "         task1 (Calculator) - 1\n" +
                "Arrays \n" +
                "        task2 (String Array) - 2\n" +
                "        task3 (String Swap) - 3\n " +
                "Box\n" +
                "        task4 (Holiday gift) -4\n");

        int task = in.nextInt();
        if (task == 1) {
            Calculator.OOP.oop();
        } else if (task == 2) {
            ArrayString.outputMaxLengthElementInArray();

        } else if (task == 3) {
            Swap.outputSwapedArray();
        } else if (task == 4) {
            HolidayGift.makeHolidayGift();
        } else {
            System.err.println("Enter valid");
            choseTask();
        }
        in.close();
    }
        public static void main (String[]args){
            choseTask();
        }

}
