public class Food extends Item {
 private int nutrition;
 private int quantity;



public Food(String _name, int _weight, int _nutrition, int _quantity)
{
 super(_name, _weight);
 nutrition = _nutrition;
 quantity = _quantity;
}

public int getNutrition()
{
 return nutrition * quantity;
}

public int getWeight()
{
 return super.getWeight() * quantity;
}

public int getQuantity()
{
 return quantity;
}

public void setQuantity(int _newQuantity)
{
 quantity = _newQuantity;
}

public void examine(){
 System.out.println("Your " + super.getName() + " Has a weight of " + getWeight() + " Nutrition rate equal to " + getNutrition() + " Quantity equal to " + quantity );
 }
}
