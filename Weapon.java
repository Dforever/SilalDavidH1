public class Weapon extends Item {
	private int damage;

public Weapon(String _name, int _weight, int _damage)
{
	super(_name, _weight);
	damage = _damage;
}

public int getDamage()
{
	return damage;
}

public void examine(){
	System.out.println("Your " + super.getName() + " Has a weight of " + super.getWeight() + " Damage equal to " + damage );
	}
}
