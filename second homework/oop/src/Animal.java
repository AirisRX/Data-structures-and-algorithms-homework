import java.lang.Comparable;

public abstract class Animal implements Comparable<Animal> {
        String name;
        String type;

        public Animal(String name, String type) {
            this.name = name;
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public int compareTo(Animal animal) {
            int compare = this.type.compareTo(animal.type);

            if (compare == 0) {
                return this.name.compareTo(animal.name);
            }

            return compare;

        }
    }