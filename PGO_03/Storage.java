package PGO_ggc_s22563.PGO_03;

public class Storage {
  private int deliveryTime;

  public int getDeliveryTime() {
    return deliveryTime;
  }

  public void setDeliveryTime(int deliveryTime) {
    if (deliveryTime <= 0) {
      throw new RuntimeException("Czas dostawy nie może być mniejszy lub równy 0.");
    }

    this.deliveryTime = deliveryTime;
  }
}