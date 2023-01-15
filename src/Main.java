/*
работает после деления на 0, срабатывает двойное исклюение при делении на 0
подключить римские цифры
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static int result;
    static Scanner input = new Scanner(System.in);
    static int a, b;
    static char operand;

    public static void main(String[] args) throws Exception {
        try {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 2 целых числа: ");
        String str = input.nextLine();
        String[] userInput = str.split(" "); //деление массива на элменеты, с помощью пробела
        if (userInput.length > 3)
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        if (userInput.length < 2)
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        String operand = userInput[1];
        int a = Integer.parseInt(userInput[0]); //приведение первой переменной в целое число и отделение ее от массива
        int b = Integer.parseInt(userInput[2]); //приведение второй переменной в целое число и отделение ее от массива
        if (a < 0 || a > 10)
            throw new Exception("throws Exception //т.к. введено неподходящее число больше 10 или меньше 0");
        if (b < 0 || b > 10)
            throw new Exception("throws Exception //т.к. введено неподходящее число больше 10 или меньше 0");
        result = calc(a, b, operand);
        System.out.println(result);
        System.out.println(str.length());
        System.out.println(String.format("%s %s", a, b)); //тест вывода переменных
        System.out.println(result);
        } catch (NumberFormatException e) {
            System.out.println("throws Exception //т.к. число должно быть целым"); //отлавливаем ошибку при вводе дробного числа
        }
    }


 /*       private static int romanToNumber (String roman) {
            try {
                if (roman.equals("I")) {
                    return 1;
                } else if (roman.equals("II")) {
                    return 2;
                } else if (roman.equals("III")) {
                    return 3;
                } else if (roman.equals("IV")) {
                    return 4;
                } else if (roman.equals("V")) {
                    return 5;
                } else if (roman.equals("VI")) {
                    return 6;
                } else if (roman.equals("VII")) {
                    return 7;
                } else if (roman.equals("VIII")) {
                    return 8;
                } else if (roman.equals("IX")) {
                    return 9;
                } else if (roman.equals("X")) {
                    return 10;
                }
            } catch (InputMismatchException e) {
                throw new InputMismatchException("Неверный формат данных");
            }
            return -1;
        }
*/

    public static int calc(int a, int b, String operand) throws Exception {
            int result = 0;
            switch (operand) {
                case "+":
                    result = a + b;
                    break;
                case "-":
                    result = a - b;
                    break;
                case "*":
                    result = a * b;
                    break;
                case "/":
                    try {
                        result = a / b;
                    } catch (ArithmeticException e) {
                        System.out.println("Exception : Нельзя делить на 0");
                    }
                default:
                        throw new Exception("Неверная операция");
            }
            return result;
        }
    }
