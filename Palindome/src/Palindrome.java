import java.util.Scanner;
public class Palindrome {
public static void main(String arg[]) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the String");
	String str=s.nextLine();
	int len=str.length();
	int flag=0;
	for(int i=0;len>i;i++) {
		if(str.charAt(i)!=str.charAt(len-i-1)) {
			flag=1;
			break;
		}
	}
	if(flag==1) {
		System.out.println("Not Palindrome");
	}else {
		System.out.println("Palindrome");
	}
}
}
