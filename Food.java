public class Food extends Item {
 private int nutrition;
 private int quantity;


//Constructors for name, weight, nutrition, and quantity for food
public Food(String _name, int _weight, int _nutrition, int _quantity)
{
 super(_name, _weight);
 nutrition = _nutrition;
 quantity = _quantity;
}

//Returns nutrition
public int getNutrition()
{
 return nutrition * quantity;
}

//Returns weight
public int getWeight()
{
 return super.getWeight() * quantity;
}

//Returns quantity
public int getQuantity()
{
 return quantity;
}

//Updates current quantity 
public void setQuantity(int _newQuantity)
{
 quantity = _newQuantity;
}

//Prints the details for Food to screen
public void examine(){
 System.out.println("Your " + super.getName() + " Has a weight of " + getWeight() + " Nutrition rate equal to " + getNutrition() + " Quantity equal to " + quantity );
 }
}
