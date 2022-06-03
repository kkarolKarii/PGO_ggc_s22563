public class Liqid extends Ingredient {
  // od zero do 100
  private int dissolubility;

  public Liqid(String name, int baseReagent, int dissolubility) {
    super(name, baseReagent);
    dissolubilitySetter(dissolubility);
  }

  public void dissolubilitySetter(int dissolubility) {
    this.dissolubility = Utils.isPercent(dissolubility, getName());
  }

  public int getDissolubility() {
    return dissolubility;
  }

  @Override
  public String toString() {
    return "Type: Liqid" + "\n" + " | "
        + super.toString()
        + "Dissolubility: " + dissolubility + "\n";
  }
}
