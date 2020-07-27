package animalSearch;

abstract class Animal {
  private static int nextId = 0;
  protected int id;
  protected String name;
  protected int yearDisc;

  public Animal(String name, int yearDisc) {
    id = nextId;
    nextId++;

    this.name = name;
    this.yearDisc = yearDisc;
  } 

  String eat() {
    return "Yum!";
  }

  String getName() {
    return name;
  }

  int getYearDisc() {
    return yearDisc;
  }

  abstract String move();
  abstract String breathe();
  abstract String reproduce();

  @Override
  public String toString() {
    return "Animal{id=" + id + ", name='" + name + "', yearNamed=" + yearDisc +"}\n";
  }
}