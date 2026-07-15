import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);

        int l1 = read.nextInt();
        int r1 = read.nextInt();
        Interval firstInterval = new Interval(l1, r1);

        int l2 = read.nextInt();
        int r2 = read.nextInt();
        Interval secondInterval = new Interval(l2, r2);

        Interval intersection = firstInterval.getIntersection(secondInterval);

        if (intersection != null) {
            System.out.println(intersection.toString());
        } else {
            System.out.println("-1");
        }

        read.close();
    }
}
