import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        String expression = read.next();
        char operator = ' ';
        int operatorIndex = -1;

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if (c == '+' || c == '-' || c == '*' || c == '/'){
                operator = c;
                operatorIndex = i;
                break;
            }
        }


        int num1 = Integer.parseInt(expression.substring(0, operatorIndex));
        int num2 = Integer.parseInt(expression.substring(operatorIndex + 1));

        Calculator calculator = new Calculator(num1, num2, operator);
        System.out.println(calculator.calculate());
        read.close();

    }
}
