import java.util.Scanner;
public class Frequency {
public static void main(String arg[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=s.nextLine();
	System.out.println("Enter the count character ");
	char ch=s.next().charAt(0);
	int len=str.length();
	 int count=0;
	for(int i=0;len>i;i++) {
		if(ch==str.charAt(i)) {
			count++;
		}
	}
	System.out.println("count character of "+str+"is "+count);
}
}
