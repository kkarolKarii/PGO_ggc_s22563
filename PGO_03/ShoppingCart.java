package PGO_ggc_s22563.PGO_03;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShoppingCart {
  private static Set<ShoppingCart> shoppingCarts = new HashSet<>();
  private static int index = 0;

  private int id;
  private List<Products> productsList = new ArrayList<>();

  public ShoppingCart() {
    this.id = ++index;
    shoppingCarts.add(this);
  }

  public void sell() {
    if (!productsList.isEmpty()) {
      for (Products product : productsList) {
        product.sell();
      }
    }
  }

  public double getTotalPrice() {
    if (!productsList.isEmpty()) {
      double totalPrice = 0;
      for (Products product : productsList) {
        totalPrice += product.getPrice();
      }
      return totalPrice;
    } else {
      return 0;
    }
  }

  public double getTotalDeliveryTime() {
    if (!productsList.isEmpty()) {
      double totalDeliveryTime = 0;
      for (Products product : productsList) {
        Storage storage = product.getStorage();

        if (storage == null) {
          continue;
        }

        totalDeliveryTime += storage.getDeliveryTime();
      }
      return totalDeliveryTime;
    } else {
      return 0;
    }
  }

  public int getId() {
    return id;
  }

  public List<Products> getproductsList() {
    return productsList;
  }

  public void setproductsList(List<Products> productsList) {
    this.productsList = productsList;
  }
}