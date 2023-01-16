/*
подключить римские цифры
 */

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
//            if (new Scanner(str).hasNextInt()) {
//                System.out.println("999");
//            } else {
//                System.out.println("000");
//            }
        if (userInput.length > 3)
            throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        if (userInput.length < 2)
            throw new Exception("throws Exception //т.к. строка не является математической операцией");
        String operand = userInput[1];
        int a = Integer.parseInt(userInput[0]); //приведение первой переменной в целое число и отделение ее от массива
        int b = Integer.parseInt(userInput[2]); //приведение второй переменной в целое число и отделение ее от массива
        if (a < 1 || a > 10)
            throw new Exception("throws Exception //т.к. введено неподходящее число больше 10 или меньше 1");
        if (b < 1 || b > 10)
            throw new Exception("throws Exception //т.к. введено неподходящее число больше 10 или меньше 1");
        result = calc(a, b, operand);
        System.out.println(result);
        System.out.println(Roman());
        } catch (NumberFormatException e) {
            System.out.println("throws Exception //т.к. число должно быть целым"); //отлавливаем ошибку при вводе дробного числа
        }
    }



       public static int romanToNumber(String str) {
                if (str.equals("I")) {
                    return 1;
                } else if (str.equals("II")) {
                    return 2;
                } else if (str.equals("III")) {
                    return 3;
                } else if (str.equals("IV")) {
                    return 4;
                } else if (str.equals("V")) {
                    return 5;
                } else if (str.equals("VI")) {
                    return 6;
                } else if (str.equals("VII")) {
                    return 7;
                } else if (str.equals("VIII")) {
                    return 8;
                } else if (str.equals("IX")) {
                    return 9;
                } else if (str.equals("X")) {
                    return 10;
                }
           return 0;
       }



    public static String Roman() {
        try {
            String[] roman = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XVII", "XVIII", "XIX", "XX",
                    "XXI", "XXII", "XXIII", "XXIV", "XXV", "XXVI", "XXVII", "XXVIII", "XXIX", "XXX", "XXXI", "XXXII", "XXXIII", "XXXIV", "XXXV", "XXXVI", "XXXVII", "XXXVIII", "XXXIX", "XL",
                    "XLI", "XLII", "XLIII", "XLIV", "XLV", "XLVI", "XLVII", "XLVIII", "XLIX", "L", "LI", "LII", "LIII", "LIV", "LV", "LVI", "LVII", "LVIII", "LIX", "LX",
                    "LXI", "LXII", "LXIII", "LXIV", "LXV", "LXVI", "LXVII", "LXVIII", "LXIX", "LXX",
                    "LXXI", "LXXII", "LXXIII", "LXXIV", "LXXV", "LXXVI", "LXXVII", "LXXVIII", "LXXIX", "LXXX",
                    "LXXXI", "LXXXII", "LXXXIII", "LXXXIV", "LXXXV", "LXXXVI", "LXXXVII", "LXXXVIII", "LXXXIX", "XC",
                    "XCI", "XCII", "XCIII", "XCIV", "XCV", "XCVI", "XCVII", "XCVIII", "XCIX", "C"
            };
            return roman[result];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new RuntimeException("throws Exception //т.к. в римской системе нет отрицательных чисел");
        }
    }



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
                        result = a / b;
                default:
            }
            return result;
        }
    }


        /*
    if (a instanceof Integer) {
                System.out.println(str.length());
                System.out.println(String.format("%s %s", a, b));
            }
            else {
                System.out.println(Roman());
            }
     */