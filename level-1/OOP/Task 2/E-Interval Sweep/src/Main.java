import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner read = new Scanner(System.in);

        short a = read.nextShort();
        short b = read.nextShort();

        IntervalSweep intervalSweep = new IntervalSweep(a, b);

        if (intervalSweep.isExist()) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
