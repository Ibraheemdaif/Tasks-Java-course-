
public class Calculator {

    int num1;
    int num2;
    char operation;

    public Calculator (int num1 , int num2 , char operation) {
        this.num1 = num1;
        this.num2 = num2;
        this.operation = operation;
    }
    
    public int calculate() {
        switch (operation) {
            case '+':
                return num1 + num2;
            case '-':
                return num1 - num2;
            case '*':
                return num1 * num2;
            case '/':
                return num1 / num2;
        
            default:
                return 0;
        }
    }
}