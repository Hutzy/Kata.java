import java.util.Scanner;

public class Main {
    static int result;
    static int test;

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите 2 целых числа: ");
        String str = input.nextLine();
        String[] userInput = str.split(" "); //деление массива на элменеты, с помощью пробела
           if (new Scanner(str).hasNextInt()) {
               try {
               String operand = userInput[1];
               int a = Integer.parseInt(userInput[0]); //приведение первой переменной в целое число и отделение ее от массива
               int b = Integer.parseInt(userInput[2]); //приведение второй переменной в целое число и отделение ее от массива
               if (a < 1 || a > 10)
                   throw new Exception("throws Exception //т.к. введено неподходящее число больше 10 или меньше 1");
               if (b < 1 || b > 10)
                   throw new Exception("throws Exception //т.к. введено неподходящее число больше 10 или меньше 1");
               if (userInput.length > 3)
                   throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
               if (userInput.length < 2)
                   throw new Exception("throws Exception //т.к. строка не является математической операцией");
               result = calc(a, b, operand);
               System.out.println(result);
//               test = romanToNumber(str);
//               System.out.println(test);
               } catch (NumberFormatException e) {
                   System.out.println("throws Exception //т.к. число должно быть целым"); //отлавливаем ошибку при вводе дробного числа
               }

            } else {
               String operand = userInput[1];
               String strA = String.valueOf(romanToNumber(userInput[0])); //приведение первой переменной в целое число и отделение ее от массива
               String strB = String.valueOf(romanToNumber(userInput[2])); //приведение второй переменной в целое число и отделение ее от массива
               result = calc(Integer.parseInt(strA), Integer.parseInt(strB), operand);
               System.out.println(Roman());
           }
    }

    public static int romanToNumber(String str) {
           int a = 0;
           switch (str) {
               case "I":
                   a = 1;
                   break;
               case "II":
                   a = 2;
                   break;
               case "III":
                   a = 3;
                   break;
               case "IV":
                   a = 4;
                   break;
               case "V":
                   a = 5;
                   break;
               case "VI":
                   a = 6;
                   break;
               case "VII":
                   a = 7;
                   break;
               case "VIII":
                   a = 8;
                   break;
               case "IX":
                   a = 9;
                   break;
               case "X":
                   a = 10;
               default:
           }
           return a;
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


    public static int calc(int a, int b, String operand) {
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