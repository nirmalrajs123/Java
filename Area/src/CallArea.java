import java.util.Scanner;

public class CallArea {
public static void main(String arg[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Area of Different Shapes");
	Area a=new Area();
	System.out.println("Find the Area of the Circle ");
	System.out.println("Enter the Radius");
	int r=s.nextInt();
	a.area(r);
	System.out.println("Find the Area of the Rectangle");
	System.out.println("Enter the length");
	int l=s.nextInt();
	System.out.println("Enter the breadth");
	int b=s.nextInt();
	a.area(l,b);
	System.out.println("Find the Area of the Triangle");
	System.out.println("Enter the breadth");
	int b1=s.nextInt();
	System.out.println("Enter the height");
	int h=s.nextInt();
	float d=(float) 0.5;
	a.area(d,b1,h);
	
}
}
