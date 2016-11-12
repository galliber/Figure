import java.util.Scanner;

public abstract class Figure 
{
	public int sideA;
	public int sideB;
	static Scanner sc=new Scanner(System.in);
	public void getSides()
	{
		System.out.println("Enter side A:");
		sideA=sc.nextInt();
		System.out.println("Enter side B:");
		sideB=sc.nextInt();
	}
	public abstract double calculateArea();
	
	
}
