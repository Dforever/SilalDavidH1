public class Item{
private String name;
private int weight;

public Item(String _name, int _weight)
{
	name = _name;
	weight = _weight;
}

public String getName()
{
	return name;
}

public int getWeight()
{
	return weight;
}

public void examine(){
	System.out.println("Your " + getName() + " Has a weight of " + getWeight() );
	}
}
