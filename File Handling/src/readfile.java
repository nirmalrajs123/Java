import java.io.*;
import java.util.*;
public class readfile {
public static void main(String arg[]) {
	try {
		FileReader f=new FileReader("a.txt");
		while(f.read()!=-1) {
		int s=f.read();
		System.out.println((char)s);
		}
		f.close();
	}catch(IOException e){
		System.out.println("an error occur"+e);
	}
}
}
