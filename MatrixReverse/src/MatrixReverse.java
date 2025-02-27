import java.util.Scanner;
public class MatrixReverse {
public static void main(String arg[]) {
	Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[][]=new int[10][10];
System.out.println("Enter the element");
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		a[i][j]=s.nextInt();
		
	}
}
System.out.println("reverse of matrix");
for(int i=0;i<n;i++) {
	for(int j=0;j<n;j++) {
		System.out.println(a[j][i]);
		
	}
}
}
}

