
public class Square extends Figure
{
	@Override
	public void getSides()
	{
		System.out.println("Enter the square's side:");
		sideA=sc.nextInt();
	}
	public double calculateArea()
	{
		return sideA*sideA;
	}
	
}
