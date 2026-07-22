import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner read = new Scanner(System.in);

        long n = read.nextLong();
        long k = read.nextLong();
        long a = read.nextLong();

        DataTypeGuessing guesser = new DataTypeGuessing(n, k, a);
        System.out.println(guesser.guessType());

        read.close();
    }
}
