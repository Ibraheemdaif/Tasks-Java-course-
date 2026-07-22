public class Nums {
    private long memo;
    private long momo;
    private long key;

    public Nums(long memo , long momo , long key){
        this.memo = memo;
        this.momo = momo;
        this.key = key;
    }

    public void getMassage(){
        if (key != 0) {
            
            if (memo % key == 0 && momo % key == 0) {
                System.out.println("Both");
            } else if (memo % key == 0) {
                System.out.println("Memo");
            } else if (momo % key == 0) {
                System.out.println("Momo");
            } else {
                System.out.println("No One");
            }
        }
    }
}
