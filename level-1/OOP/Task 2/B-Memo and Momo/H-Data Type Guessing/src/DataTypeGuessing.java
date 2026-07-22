public class DataTypeGuessing {
    long n;
    long k;
    long a;

    public DataTypeGuessing(long n, long k, long a) {
        this.n = n;
        this.k = k;
        this.a = a;

    }

    public String guessType() {
        long product = n * k;

        if (product % a != 0) {
            return "double";
        } else {
            long result = product / a;

            if (result <= 2147483647) {
                return "int";
            } else {
                return "long long";
            }

        }

    }

}
