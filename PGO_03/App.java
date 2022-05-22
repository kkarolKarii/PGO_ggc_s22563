package PGO_ggc_s22563.PGO_03;

import java.util.ArrayList;
import java.util.List;

public class App {
  public static void main(String[] args) {
    Person person = new Person("Karol", "Calka", 10, 0);
    person.makeOrder();

    List<Products> productList = new ArrayList<>();
    productList.add(new Products("asdadasd", ProductType.Electronic, 1, 1));

    person.getCurrent().setproductsList(productList);
    person.BuyByCard();
    person.BuyInCash();

  }
}