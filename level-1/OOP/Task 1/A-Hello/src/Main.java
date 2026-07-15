import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Welcome welcome = new Welcome();

        welcome.name = read.next();
        welcome.sayHello();
        read.close();
    }
}
