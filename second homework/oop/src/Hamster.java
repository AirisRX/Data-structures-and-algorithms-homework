public class Hamster extends Animal {

    public int tailLength;
    public String color;

    public Hamster(String name) {
        super(name, "Hamster");
    }

    public int getTailLength() {
        return tailLength;
    }

    public void setTailLength(int tailLength) {
        this.tailLength = tailLength;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Hamster: " +
                "Name = " + name +
                ", Tale length = " + tailLength +
                "cm, Color = " + color;
    }
}