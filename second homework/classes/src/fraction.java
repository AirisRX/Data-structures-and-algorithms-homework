public class fraction {
    int numerator;

    public fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.simplify();
    }

    public fraction(int numerator, int denominator, int fullNum) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.fullNum = fullNum;
        this.simplify();
    }

    public int getNumerator() { return numerator; }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    int denominator;

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    int fullNum;

    public int getFullNum() {
        return fullNum;
    }

    public void setFullNum(int fullNum) { this.fullNum = fullNum; }

    public void add(int x) {
        this.fullNum += x;
        this.simplify();
    } // Adding a function to add numbers to the fullNum integer

    public void add(int x, int y) {
        if(y==denominator){
            this.numerator+=x;
        }
        else {
            this.numerator=(numerator*y)+(x*denominator);
            this.denominator=denominator*y;
        }
        if(numerator>denominator)
        {
            this.fullNum+=numerator/denominator;
            this.numerator -= (denominator*(numerator / denominator));
        }
        this.simplify();
    }

    public void add(int x, int y, int z) {
        this.add(x);
        this.add(y, z);
        this.simplify();
    }

    public void add(fraction fraction1) {
        this.add(fraction1.fullNum, fraction1.numerator, fraction1.denominator);
        this.simplify();
    }

    public void sub (int x){
        this.fullNum-=x;
        this.simplify();
    }

    public void sub(int x, int  y){
        if(y==this.denominator){
            this.numerator-=x;
        }
        else {
            this.numerator=(this.numerator*y)-(x*this.denominator);
            this.denominator=this.denominator*y;
        }
        this.simplify();
    }

    public void sub (int z, int x, int y){
        this.sub(z);
        this.sub(x,y);
    }

    public void sub (fraction fraction){
        this.sub(fraction.fullNum, fraction.numerator, fraction.denominator);
    }

    public void multiply(int x, int y){
        this.numerator=(this.fullNum*this.denominator+this.numerator)*x;
        this.fullNum=0;
        this.denominator=this.denominator*y;
        this.simplify();
    }

    public void multiply (int x){
        this.multiply(x,1);
    }

    public void multiply(int z, int x, int y){
        x=z*y+x;
        this.multiply(x,y);
    }

    public void multiply(fraction fraction){
        this.multiply((fraction.numerator+fraction.fullNum*fraction.denominator),fraction.denominator);
    }

    private void simplify() {
        if (this.numerator < 0) {
            while (this.numerator < 0) {
                this.numerator += this.denominator;
                this.fullNum--;
            }
        }
        if (this.numerator > denominator) {
            this.fullNum += this.numerator / this.denominator;
            this.numerator = this.numerator - (this.denominator * (this.numerator / this.denominator));
        }
        int temp = this.numerator;
        while (temp > 0) {
            if (this.numerator % temp == 0 && this.denominator % temp == 0) break;
            else temp--;
        }
        if (this.numerator % temp == 0 && this.denominator % temp == 0) {
            this.numerator = this.numerator / temp;
            this.denominator = this.denominator / temp;
        }
    }

    public double toDouble(){
        return this.fullNum +(double) Math.round((this.numerator / (double) this.denominator) * 100) / 100;
    }

    @Override
    public String toString() {
        return " " + fullNum +
                " " + numerator +
                " / " + denominator +
                " | " + toDouble() +
                '}';
    }
}