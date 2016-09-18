public class h_1_1 {
 public static void main (String args[]) {
  Item combat =new Item("spear",12);
  System.out.println("combat item name: " + combat.getName());
  System.out.println("combat item weight: " + combat.getWeight());
  System.out.print("test combat examine: ");
  combat.examine();

  Weapon weapon =new Weapon("axe",12, 30);
    System.out.println("weapon item name: " + weapon.getName());
    System.out.println("weapon item weight: " + weapon.getWeight());
    System.out.println("damage due to weapon: " + weapon.getDamage());
    System.out.print("test weapon examine: ");
  weapon.examine();

  Armor armor =new Armor("sheild",12, 40);
    System.out.println("armor item name: " + armor.getName());
    System.out.println("armor item weight: " + armor.getWeight());
    System.out.println("Defend rate equal to: " + armor.getDefense());
    System.out.print("test armor examine: ");
  armor.examine();
  
  Food food =new Food("corn",12, 50, 55);
    System.out.println("food item name: " + food.getName());
    System.out.println("food item weight: " + food.getWeight());
    System.out.println("Nutrition rate equal to: " + food.getNutrition());
    System.out.println("Quantity equal to: " + food.getQuantity());
    System.out.print("test food examine: ");
  food.examine();
  
  System.out.println("Change quantity");
  food.setQuantity(20);
  food.examine();
 
 }
}

