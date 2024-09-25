package Inventory_system.src;
import java.util.ArrayList;

public class Inventory {
  
  private ArrayList<Item> items;

  public Inventory() {
    items = new ArrayList<>();
  }

  public void addItem(Item item) {
    items.add(item);
  }

  public void addItem(String type, String name, int quantity) {
    items.add(new Fruit(type, name, quantity));
  }
  
  public void addItem(String name, int quantity, int buttons, String type) {
    items.add(new Toy(name, quantity, buttons, type));
  }

  public void displayInventory(){
    for (Item item : items) {
      item.displayInfo();
    }
  }

  public void displayInventory(String type) {
    for (Item item : items) {
      if (item instanceof Fruit && ((Fruit) item).getType()
      .equalsIgnoreCase(type)) {
        System.out.println(item.toString());
      } else if (item instanceof Toy && ((Weapon) item).getType()
      .equalsIgnoreCase(type)) {
        System.out.println(item.toString());
      }
    }
  }
}
