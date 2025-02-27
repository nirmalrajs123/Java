package opp;

public class hello {
	public static void main(String a[]) {
		Sample s1=new Sample();
		Sample s2=new Sample();
		s1.a=10;
		s1.b=20;
		s2.a=30;
		s2.b=40;
		//System.out.println("s1.a=" +s1.a+ "s1.b "+s1.b);
		//System.out.println("s2.a=" +s2.a+ "s2.b "+s2.b);
		s1.display();
		s2.display();
	}

}
