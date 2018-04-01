package Calculator;

import java.text.DecimalFormat;



public class Shape extends Calculator {
    public Shape() {
        num1 = getDouble();
        num2 = getDouble();
        operation = getOperation();
        result = Shape(num1, num2, operation);
        String finalresult = new DecimalFormat("0.0000").format(result);
        System.out.println("Результат операции: " + finalresult);

    }

    public double getDouble() {
        System.out.println("Введите число:");
        double num;
        if (scanner.hasNextDouble()) {
            num = scanner.nextDouble();

        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();//рекурсия
            num = getDouble();
        }
        return num;
    }
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
    public static double Shape(double num1, double num2, char operation){
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
                result = Shape(num1, num2, getOperation());//рекурсия
        }
        return result;
    }

}







