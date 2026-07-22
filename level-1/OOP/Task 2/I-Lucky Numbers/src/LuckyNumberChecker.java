class LuckyNumberChecker {
    private int number;

    public LuckyNumberChecker(int number) {
        this.number = number;
    }

    public String check() {
        int tens = this.number / 10;
        int ones = this.number % 10;

        boolean isTensDivisibleByOnes = (ones != 0) && (tens % ones == 0);
        boolean isOnesDivisibleByTens = (tens != 0) && (ones % tens == 0);

        if (isTensDivisibleByOnes || isOnesDivisibleByTens) {
            return "YES";
        } else {
            return "NO";
        }
    }
}