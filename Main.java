import java.util.Scanner;

public class Main
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Figure c=new Circle();
		Figure t=new Right_Triangle();
		Figure s=new Square();
		Figure r=new Rectangle();
		int counter=0;
		while(counter==0)
		{
			System.out.println("Enter:");
			System.out.println("1:To calculate the area of a Circle.");
			System.out.println("2:To calculate the area of a Right Triangle.");
			System.out.println("3:To calculate the area of a Square.");
			System.out.println("4:To calculate the area of a Rectangle.");
			System.out.println("5:To end the program.");
			String figure=sc.nextLine();
			switch(figure)
			{
			case "1": System.out.println("You chose to calculate the are of a Circle.");
				test(c, Integer.valueOf(figure));
				break;
			case "2": System.out.println("You chose to calculate the area of a Right Triangle.");
				test(t, Integer.valueOf(figure));
				break;
			case "3": System.out.println("You chose to calculate the area of a Square.");
				test(s, Integer.valueOf(figure));
				break;
			case "4": System.out.println("You chose to calculate the area of a Rectangle.");
				test(r, Integer.valueOf(figure));
				break;
			case "5": System.out.println("You've closed the program.");
				counter++;
				break;
			default: System.out.println("Incorrect input!");
				break;
			}
		}
	}
	public static void test(Figure o, int f)
	{
		o.getSides();
		switch(f)
		{
		case 1: System.out.println("The area of the Circle is "+o.calculateArea()+"\n");
			break;
		case 2: System.out.println("The area of the Right Triangle is "+o.calculateArea()+"\n");
			break;
		case 3: System.out.println("The area of the Square is "+o.calculateArea()+"\n");
			break;
		case 4: System.out.println("The area of the Rectangle is "+o.calculateArea()+"\n");
			break;
		}
	}
}
