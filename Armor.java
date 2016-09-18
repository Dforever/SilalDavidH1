public class Armor extends Item {
 private int defense;

//Constructors for name, weight, and defense
public Armor(String _name, int _weight, int _defense)
 {
 super(_name, _weight);
 defense = _defense;
}

//Returns the defense
public int getDefense()
{
 return defense;
}

//Prints the details for Armor to screen
public void examine(){
 System.out.println("Your " + super.getName() + " Has a weight of " + super.getWeight() + " Defend rate equal to " + defense );
 }
}
