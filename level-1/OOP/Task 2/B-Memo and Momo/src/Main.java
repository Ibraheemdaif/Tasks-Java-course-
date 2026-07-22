import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner read = new Scanner(System.in);

        long memo = read.nextLong();
        long momo = read.nextLong();
        long key = read.nextLong();

        Nums nums = new Nums(memo, momo, key);
        nums.getMassage();
        read.close();
    
    }
}
