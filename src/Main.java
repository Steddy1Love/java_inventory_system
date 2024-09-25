package Inventory_system.src;

public class Main {
  public static void main(String[] args) {
    Inventory inventory = new Inventory();

    //Fruit fruit1 = new Fruit("Fuji", "Apple", 15);
    //Toy toy1 = new Toy("Minecraft zombie", 4, 1, "Plush");

    inventory.addItem("Fuji", "Apple", 15);
    inventory.addItem("Minecraft zombie", 4, 1, "Plush");

    inventory.displayInventory();
  }
}
