public class Item{
private String name;
private int weight;

//Constructors for name and weight
public Item(String _name, int _weight)
{
 name = _name;
 weight = _weight;
}

//Returns the name
public String getName()
{
 return name;
}

//Returns the weight
public int getWeight()
{
 return weight;
}

//Prints the details of the object to screen
public void examine(){
 System.out.println("Your " + getName() + " Has a weight of " + getWeight() );
 }
}
