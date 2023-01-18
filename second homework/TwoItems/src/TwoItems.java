public class TwoItems<X, Y> {

    private X first;
    private Y second;

    public X getFirst() {
        return first;
    }

    public void setFirst(X first) {
        this.first = first;
    }

    public Y getSecond() {
        return second;
    }

    public void setSecond(Y second) {
        this.second = second;
    }

    public TwoItems(X first, Y second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public String toString() {
        return "TwoItems: " +
                "first = " + first +
                ", second = " + second;
    }
}