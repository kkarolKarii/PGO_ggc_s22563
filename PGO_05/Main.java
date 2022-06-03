
public class Main {
  public static void main(String[] args) {
    System.out.println("|testy Alchemiczne|");
    // =========================================================
    Eliksir EliksirMixture = new Eliksir("Odwar z archegrafa Witcher mixture", new Alcohol("Belvedere", 05, 55, 55));
    EliksirMixture.addIngredient(new Flower("horseradish", 50, 15));
    // EliksirMixture.Create();
    EliksirMixture.addIngredient(new Flower("Aloes", 88, 0));
    EliksirMixture.addIngredient(new Crystal("crystal", 1000, 50, 500));
    // EliksirMixture.Create();
    // EliksirMixture.power();
    EliksirMixture.addIngredient(new Crystal("crystal", 1500, 10, 800));
    EliksirMixture.Create();
    EliksirMixture.power();
    EliksirMixture.printListOfIngredient();
    // =========================================================
  }
}