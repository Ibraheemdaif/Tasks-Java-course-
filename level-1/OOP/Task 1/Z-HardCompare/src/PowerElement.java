public class PowerElement {
    long base;
    long exponent;

    public PowerElement(long base, long exponent) {
        this.base = base;
        this.exponent = exponent;
    }
    
    public void compareAndPrint(PowerElement other) {
        double thisValue = this.exponent * Math.log(this.base);
        
        double otherValue = other.exponent * Math.log(other.base);
        
        if (thisValue > otherValue) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }   
    }
}