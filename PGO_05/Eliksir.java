
import java.util.List;
import java.util.ArrayList;

//=========================
public class Eliksir {
  private final String name;
  private int powerOfIngredient;
  private boolean isCreated;
  private final List<Ingredient> ingredients;
  private Liqid catalyst;

  public Eliksir(String name, Liqid catalyst) {
    this.name = name;
    this.isCreated = false;
    this.catalyst = catalyst;
    this.ingredients = new ArrayList<>();
  }

  void Create() {
    if (isCreated) {
      System.out.println("Item was Cretaed");
      return;
    }
    isCreated = true;
    powerOfIngredient = 0;
    for (Ingredient ingredient : ingredients) {
      powerOfIngredient += ingredient.getReagent();
    }
    powerOfIngredient /= catalyst.getReagent();
  }

  public void setCatalyst(Liqid catalyst) {
    this.catalyst = catalyst;
  }

  void power() {
    if (isCreated) {
      System.out.println("Item was Created");
      return;
    }
    powerOfIngredient = 0;
    for (Ingredient ingredient : ingredients) {
      powerOfIngredient += ingredient.getReagent();
    }
    powerOfIngredient /= catalyst.getReagent();
    System.out.println("Elixir Power [" + name + "] is | " + powerOfIngredient + " |");
  }

  void addIngredient(Ingredient ingredient) {
    if (isCreated) {
      System.out.println("Item was created you cant created more ");
      return;
    }
    ingredients.add(ingredient);
  }

  void removeIngredient(Ingredient ingredient) {
    if (isCreated) {
      System.out.println("Item was created you cant creae more!");
      return;
    }
    ingredients.remove(ingredient);
  }

  public boolean isCreated() {
    return isCreated;
  }

  public void printListOfIngredient() {
    System.out.print("\n");
    System.out.println("List of ingredient of " + name + "\n");
    System.out.println("catalyst:\n");
    System.out.println(catalyst);

    System.out.println("ingredients:\n");

    for (Ingredient ingredient : ingredients) {
      System.out.println(ingredient);
    }

    System.out.println(" ");
  }

  public String getName() {
    return name;
  }

  public Liqid getCatalyst() {
    return catalyst;
  }
}