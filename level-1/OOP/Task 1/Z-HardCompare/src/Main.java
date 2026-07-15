import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        long a = read.nextLong();
        long b = read.nextLong();
        PowerElement elementOne = new PowerElement(a, b);

        long c = read.nextLong();
        long d = read.nextLong();
        PowerElement elementTwo = new PowerElement(c, d);

        elementOne.compareAndPrint(elementTwo);
        
        read.close();
    }
}
