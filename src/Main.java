import java.util.Scanner;

public class Main {
    static int result;
    static Scanner input = new Scanner(System.in);
    static int a, b;
    static String operand;

    public static void main(String[] args) throws Exception {
        System.out.println("Введите 2 целых числа: ");
        String str = input.nextLine();
        String [] userInput = str.split(" "); //деление массива на элменеты, с помощью пробела
        if (userInput.length>5) throw new Exception("throws Exception //т.к. формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        if (userInput.length<3) throw new Exception("throws Exception //т.к. строка не является математической операцией");
        String operand = userInput[1];
        int a = Integer.parseInt(userInput[0]); //приведение первой переменной в целое число и отделение ее от массива
        int b = Integer.parseInt(userInput[2]); //приведение второй переменной в целое число и отделение ее от массива
        if (a < 0 || a >10 && b < 0 || b>10) throw new Exception("throws Exception //т.к. введено неподходящее число больше 10 или меньше 0");


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
                    System.out.println("Exception : " + e);
                    break;
                }
                break;
            default:
                throw new Exception("Неверная операция");
        }
        //System.out.println(String.format("%s %s", a, b)); //тест вывода переменных
        System.out.println(result);
        System.out.println(str.length());



    }

}