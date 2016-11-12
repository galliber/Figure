
public class Circle extends Figure 
{
	public int radius;
	@Override
	public void getSides()
	{
		System.out.println("Enter the radius of the Circle:");
		radius=sc.nextInt();
	}
	public double calculateArea()
	{
		return Math.PI*(radius*radius);
	}
}
