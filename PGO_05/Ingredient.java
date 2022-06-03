public class Ingredient {
  private final String name;
  private final int baseReagent;

  // setter
  public Ingredient(String name, int baseReagent) {
    this.name = name;
    this.baseReagent = baseReagent;
  }

  // getters
  int getReagent() {
    return baseReagent;
  }

  public String getName() {
    return name;
  }

  // przeciazenie
  @Override
  public String toString() {
    return "Ingredient name: " + name + "\n" + " | "
        + "baseReagent: " + baseReagent;
  }
}