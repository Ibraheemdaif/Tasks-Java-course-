public class Interval {
    private int start;
    private int end;

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Interval getIntersection(Interval other) {
        int intersectStart = Math.max(this.start, other.start);
        int intersectEnd = Math.min(this.end, other.end);

        if (intersectStart <= intersectEnd) {
            return new Interval(intersectStart, intersectEnd);
        }

        return null;
    }

    @Override
    public String toString() {
        
        return start + " " + end;
    }

}
