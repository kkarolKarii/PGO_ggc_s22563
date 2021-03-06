public class Ore extends Minerals {
  private final boolean metallic;

  public Ore(String name, int baseReagent, int power, boolean metallic) {
    super(name, baseReagent, power);
    this.metallic = metallic;
  }

  public boolean isMetallic() {
    return metallic;
  }

  @Override
  int getReagent() {
    return super.getReagent() / (metallic ? 1 : 2);
  }

  @Override
  public String toString() {
    return "Subtype: Ore" + "\n" + "|"
        + super.toString()
        + "Metallic: " + (metallic ? "Yes" : "No") + "\n";
  }
}