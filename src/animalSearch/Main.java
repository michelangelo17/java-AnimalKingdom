package animalSearch;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
  
  public static void main(String[] args) {
    List<Animal> animals = new ArrayList<>();

    animals.add(new Mammal("Panda", 1869));
    animals.add(new Mammal("Zebra", 1778));
    animals.add(new Mammal("Koala", 1816));
    animals.add(new Mammal("Sloth", 1804));
    animals.add(new Mammal("Armadillo", 1758));
    animals.add(new Mammal("Raccoon", 1758));
    animals.add(new Mammal("Bigfoot", 2021));

    animals.add(new Bird("Pigeon", 1837));
    animals.add(new Bird("Peacock", 1821));
    animals.add(new Bird("Toucan", 1758));
    animals.add(new Bird("Parrot", 1824));
    animals.add(new Bird("Swan", 1758));

    animals.add(new Fish("Salmon", 1758));
    animals.add(new Fish("Catfish", 1817));
    animals.add(new Fish("Perch", 1758));

    animals.sort((a1, a2) -> a2.getYearDisc() - a1.getYearDisc());

    System.out.println("\n*** List all the animals in descending order by year named ***\n");
    System.out.println(animals);

    animals.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
    System.out.println("\n*** List all the animals alphabetically ***\n");
    System.out.println(animals);

    animals.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
    System.out.println("\n*** List all the animals order by how they move ***\n");
    System.out.println(animals);
  }
}