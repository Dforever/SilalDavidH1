public class h_1_1 {
	public static void main (String args[]) {
		Item combat =new Item("combat",12);
		System.out.println("combat item name: " + combat.getName());
		System.out.println("combat item weight: " + combat.getWeight());
		System.out.print("test combat examine: ");
		combat.examine();
	}
}