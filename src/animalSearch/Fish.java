package animalSearch;

public class Fish extends Animal {

  public Fish(String name, int yearDisc) {
    super(name, yearDisc);
  }

  @Override
  public String move() {
    return "swim";
  }

  @Override
  public String breathe() {
    return "gills";
  }

  @Override
  public String reproduce() {
    return "eggs";
  }
}