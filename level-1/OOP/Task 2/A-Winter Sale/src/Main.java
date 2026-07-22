import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        short discountPercentage = read.nextShort();
        int netPrice = read.nextInt();
        Product product = new Product(discountPercentage,netPrice);
        
        DecimalFormat decimalFormat = new DecimalFormat("0.00");

        System.out.printf(decimalFormat.format(product.claculateBasePrice()) );




        read.close();

    }
}
