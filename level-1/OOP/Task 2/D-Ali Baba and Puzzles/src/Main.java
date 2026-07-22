import java.util.Scanner;

public class Main{
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        long a = read.nextLong();
        long b = read.nextLong();
        long c = read.nextLong();
        long d = read.nextLong();

        AliBabaPuzzle puzzle = new AliBabaPuzzle(a, b, c, d);
        
        if (puzzle.isSolvable()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
