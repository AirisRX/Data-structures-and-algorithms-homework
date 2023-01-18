// Airidas Rupsas - JNII21

import java.util.Collections;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Animal> animals = new LinkedList<>();

        Fish fish1 = new Fish("Fish1");
        fish1.setFinCount(10);

        Fish fish2 = new Fish("Fish2");
        fish2.setFinCount(30);

        Hamster hamster1 = new Hamster("Hamster1");
        hamster1.setTailLength(5);
        hamster1.setColor("black");

        Hamster hamster2 = new Hamster("Hamster2");
        hamster2.setTailLength(10);
        hamster2.setColor("white");

        animals.add(fish1);
        animals.add(fish2);
        animals.add(hamster1);
        animals.add(hamster2);

        Collections.sort(animals);

        for (int i = 0; i < 4; i++) {
            System.out.println(animals.get(i));
        }

        System.out.println("Searching animals named Hamster1:");
        find(animals, "Hamster1");
    }
    static void find(LinkedList<Animal> animals, String name) {
        for (int i = 0; i < 4; i++) {
            if (animals.get(i).getName().equals(name)) {
                System.out.println(animals.get(i));
            }
        }
    }
}