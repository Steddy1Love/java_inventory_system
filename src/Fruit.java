package Inventory_system.src;

public class Fruit extends Item {
  private String type;

  public Fruit(String type, String name, int quantity) {
    super(name, quantity);
    this.type = type;
  }

  public String getType() {
    return type;
  }

  @Override
    public void displayInfo() { 
    System.out.println("Name: " + getName() + ", Type: " + getType() + ", Quantity: " + getQuantity());
  }
}
