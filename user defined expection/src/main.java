import java.util.Scanner;

public class main {
	public static void main(String arg[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("program started");
		System.out.println("enter the number");
		int i=s.nextInt();
try {
	int n=10/i;
	System.out.println(n);
}catch(Exception ex) {
	System.out.println("number not divisible by zero");
}		System.out.println("program stop successfully");
}
}
