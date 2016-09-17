public class h_1_1 {
	public static void main (String args[]) {
		Item combat =new Item("combat",12);
		System.out.println("combat item name: " + combat.getName());
		System.out.println("combat item weight: " + combat.getWeight());
		System.out.print("test combat examine: ");
		combat.examine();

		Weapon weapon =new Weapon("weapon",12, 30);
				System.out.println("weapon item name: " + weapon.getName());
				System.out.println("weapon item weight: " + weapon.getWeight());
				System.out.println("damage due to weapon: " + weapon.getDamage());
				System.out.print("test weapon examine: ");
		weapon.examine();

		Armor armor =new Armor("armor",12, 40);
				System.out.println("armor item name: " + armor.getName());
				System.out.println("armor item weight: " + armor.getWeight());
				System.out.println("Defend rate equal to: " + armor.getDefense());
				System.out.print("test combat examine: ");
		armor.examine();


	}
}