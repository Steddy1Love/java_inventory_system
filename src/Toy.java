package Inventory_system.src;

public class Toy extends Item {
  private int buttons;
  private String type;

  public Toy(String name, int quantity, int buttons, String type) {
    super(name, quantity);
    this.buttons = buttons;
    this.type = type;
  }

  public int getButtons() {
    return buttons;
  }

  public String getType() {
    return type;
  }

  @Override
  public void displayInfo() {
    System.out.println("Toy: " + getName() + ", Quantity: " + 
    getQuantity() + ", Buttons: " + getButtons() + ", Type: " + getType());
  }
}

