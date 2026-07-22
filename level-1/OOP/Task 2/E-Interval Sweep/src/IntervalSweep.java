
public class IntervalSweep {
    int oddCount;
    int evenCount;

    public IntervalSweep(int oddCount, int evenCount) {
        setOddCount(oddCount);
        setEvenCount(evenCount);
    }
    

    public void setOddCount(int oddCount) {
        if (oddCount > 0 && oddCount < 100) {
            
            this.oddCount = oddCount;
        }
    }


    public void setEvenCount(int evenCount) {
        if (evenCount > 0 && evenCount < 100) {
            
            this.evenCount = evenCount;
        }
    }


    public boolean isExist() {
        if (oddCount != 0 && evenCount != 0) {
            
            return (oddCount == evenCount) ||
                    (oddCount == evenCount + 1 ) ||
                    (evenCount == oddCount + 1);
        }
        return false;
    }
}