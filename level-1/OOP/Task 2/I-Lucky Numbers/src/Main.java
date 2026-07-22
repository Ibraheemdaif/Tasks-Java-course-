import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            LuckyNumberChecker checker = new LuckyNumberChecker(n);
            
            System.out.println(checker.check());
        }
        
        scanner.close();
    }
}