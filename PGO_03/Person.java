package PGO_ggc_s22563.PGO_03;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private String name;
  private String surname;
  private double moneyInCash;
  private double moneyOnCard;
  private ShoppingCart current;
  private List<ShoppingCart> history = new ArrayList<>();

  public Person(String name, String surname, int localDate, int adress) {
    this.name = name;
    this.surname = surname;
    this.moneyInCash = localDate;
    this.moneyOnCard = adress;
  }

  public void makeOrder() {
    current = new ShoppingCart();
  }

  public void BuyInCash() {
    if (current == null) {
      throw new RuntimeException("doesn't exist");
    }
    if (current.getTotalPrice() > moneyInCash) {
      throw new RuntimeException("Not enough money in cash");
    }

    history.add(current);
    current = null;
  }

  public void BuyByCard() {
    if (current == null) {
      throw new RuntimeException("doesn't exist");
    }
    if (current.getTotalPrice() > moneyOnCard) {
      throw new RuntimeException("Not enough money on card");
    }

    history.add(current);
    current = null;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    if (name == null) {
      throw new RuntimeException("Name cannot be empty.");
    }
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    if (surname == null) {
      throw new RuntimeException("Surname cannot be empty.");
    }
    this.surname = surname;
  }

  public double getMoneyInCash() {
    return moneyInCash;
  }

  public void setMoneyInCash(double moneyInCash) {
    if (moneyInCash < 0) {
      throw new RuntimeException("Money in cash cannot be negative");
    }
    this.moneyInCash = moneyInCash;
  }

  public double getMoneyOnCard() {
    return moneyOnCard;
  }

  public void setMoneyOnCard(double moneyOnCard) {
    if (moneyOnCard < 0) {
      throw new RuntimeException("Ilość pieniędzy na karcie nie może być mniejsza niż 0.");
    }
    this.moneyOnCard = moneyOnCard;
  }

  public List<ShoppingCart> getHistory() {
    return history;
  }

  public ShoppingCart getCurrent() {
    return current;
  }
}