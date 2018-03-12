/**
 * Created by on 03.12.17
 * @author Hagel.Yuri
 * @versin 1.0
 *
 *
 */
package Calculator;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created class Calculator в котором четыре метода.
 *
 */
public class Calculator {
    static Scanner scanner = new Scanner(System.in);

    /**
     * Метод main. Является точкой входа. должен считывать 2 числа (с помощью getDouble()), считать операцию
     * (с помощью getOperation(),
     * передать все методу calc() и вывести на экран результат.
     *
     */

    public static void calc() {
        double num1 = getDouble();
        double num2 = getDouble();
        char operation = getOperation();
        double result = calc(num1,num2,operation);
        String finalresult = new DecimalFormat("0.0000").format(result);
        System.out.println("Результат операции: "+ finalresult);
    }

    /**
     * Метод getDouble считывает с консоли целое число и возвращать его
     * @return num
     */
    public static double getDouble(){
        System.out.println("Введите число:");
        double num;
        if(scanner.hasNextDouble()){
            num = scanner.nextDouble();

        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getDouble();
        }
        return num;
    }

    /**
     *Метод char getOperation() - считывает с консоли какое-то значение и возвращать символ с операцией (+, -, *  or /)
     * @return operation
     */
    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()== true){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    /**
     *Метод double calc - выполнять над числами num1 и num2 арифметическую операцию, заданную operation.
     * @param num1  числа
     * @param num2  числа
     * @param operation операцию
     * @return
     */
    public static double calc(double num1, double num2, char operation){
        double result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}