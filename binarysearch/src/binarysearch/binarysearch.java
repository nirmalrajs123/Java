package binarysearch;
import java.util.Scanner;
public class binarysearch {
public static void main(String arg[]) {
	int i;
	Scanner s=new Scanner(System.in);
	int a[]=new int[10];
	System.out.println("Enter the size");
	int n=s.nextInt();
	System.out.println("Enter the accending array");
	for(i=0;i<n;i++) {
		 a[i]=s.nextInt();
	}
	System.out.println("Enter the search key");
	int key=s.nextInt();
	int l=0,u=n-1;
	for(i=0;i<n;i++) {
		int mid=(l+u)/2;
		if(mid==key) {
		System.out.println("Search key found");
		return;
		}
		else if(mid<key) {
			l=mid+1;
		}else {
			u=mid-1;
		}
	}
	System.out.println("Search key not found");
}
}
