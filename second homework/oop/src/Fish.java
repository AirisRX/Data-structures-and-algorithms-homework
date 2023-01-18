public class Fish extends Animal {

    public int finCount;

    public Fish(String name) {
        super(name, "Fish");
    }

    public int getFinCount() {
        return finCount;
    }

    public void setFinCount(int finCount) {
        this.finCount = finCount;
    }

    @Override
    public String toString() {
        return "Fish: " +
                "Name =" + name +
                ", Fin count = " + finCount;
    }
}