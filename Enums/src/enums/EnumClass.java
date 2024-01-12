package enums;

enum Colors 
{
	RED(100), BLUE(200), BLACK;
	int cost;
	private Colors()
	{
		System.out.println("in parameterless constructor...");
		this.cost=555;
	}

	Colors(int i) 
	{
		System.out.println("in parametrized constructor...");
	}
}

public class EnumClass
{
	public static void main(String[] args) 
	{
		Colors obj=Colors.RED;
		System.out.println("in main method....");
	}
}