import java.util.Scanner;

public class IfSample {
public static void main(String a[]) {
	System.out.println("enter the number");
	Scanner s=new Scanner(System.in);
	int n=s.nextInt();
	int sum=0;

	
	
	for(int i=0;i<n;i++) {
		sum=sum+i;
	}
	System.out.println("result is "+sum);	
}


}
