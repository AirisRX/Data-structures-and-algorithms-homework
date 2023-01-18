// Airidas Rupšas - JNII21

public class Main {
    public static void main(String[] args) {
        fraction fraction = new fraction(5, 10);
        fraction fraction2 = new fraction(10, 20);
        fraction = new fraction(10, 20, 2);
        fraction.add(2); // Adds your desired number to the fullNum integer by calling the object in the class
        fraction.add(10, 2);
        fraction.add(2, 5, 7);
        fraction.add(fraction2);
        fraction.toDouble();
        fraction.sub(1);
        fraction.sub(1, 2);
        fraction.sub(2, 4, 6);
        fraction.sub(fraction2);
        fraction.multiply(2);
        fraction.multiply(2, 4);
        fraction.multiply(2, 4, 6);
        fraction.multiply(fraction2);

        System.out.println(fraction.toString());
    }
}