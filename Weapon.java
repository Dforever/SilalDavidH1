public class Weapon extends Item {
 private int damage;

//Constructors for name, weight, and damage
public Weapon(String _name, int _weight, int _damage)
{
 super(_name, _weight);
 damage = _damage;
}

//Returns the damage
public int getDamage()
{
 return damage;
}

//Prints the details for Weapon to the screen
public void examine(){
 System.out.println("Your " + super.getName() + " Has a weight of " + super.getWeight() + " Damage equal to " + damage );
 }
}
