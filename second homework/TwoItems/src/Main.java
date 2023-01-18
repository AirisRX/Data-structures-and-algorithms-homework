// Airidas Rupsas - JNII21

public class Main {
    public static void main(String[] args) {
        TwoItems<String, String> Items = new TwoItems<>("Cup", "Straw");

        System.out.println(Items.getFirst());
        System.out.println(Items.getSecond());
        System.out.println(Items);
    }
}