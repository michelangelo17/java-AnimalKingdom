package animalSearch;

public class Bird extends Animal {

  public Bird(String name, int yearDisc) {
    super(name, yearDisc);
  }

  @Override
  public String move() {
    return "fly";
  }

  @Override
  public String breathe() {
    return "lungs";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }
}