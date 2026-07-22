
public class Product {

    private float basePrice;
    private short discountPercentage;
    private float netPrice;

    public Product(short discountPercentage, int netPrice) {

        this.discountPercentage = discountPercentage;
        this.netPrice = netPrice;
    }

    public float claculateBasePrice() {
        if (discountPercentage >= 1 && discountPercentage <= 99) {
            basePrice = netPrice * 100 / (100  - discountPercentage);
            return basePrice;
        }
        return 0;
    }

}