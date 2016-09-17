public class Armor extends Item {
	private int defense;

public Armor(String _name, int _weight, int _defense)
{
	super(_name, _weight);
	defense = _defense;
}

public int getDefense()
{
	return defense;
}

public void examine(){
	System.out.println("Your " + super.getName() + " Has a weight of " + super.getWeight() + " Defend rate equal to " + defense );
	}
}
