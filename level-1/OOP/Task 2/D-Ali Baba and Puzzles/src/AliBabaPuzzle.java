public class AliBabaPuzzle {
    private long a;
    private long b;
    private long c;
    private long d;

    public AliBabaPuzzle(long a, long b, long c, long d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public boolean isSolvable() {
        return  (a + b - c == d) ||
                (a - b + c == d) ||
                (a + b * c == d) ||
                (a - b * c == d) ||
                (a * b + c == d) ||
                (a * b - c == d);
    }
}
