import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        long eyes = read.nextLong();
        long mouths = read.nextLong();
        long bodies = read.nextLong();

        Katryoshka katryoshka = new Katryoshka(eyes, mouths, bodies);
        katryoshka.calculateKatryoshka();
        read.close();
    }
}
