import java.io.*;
public class File {
public static void main(String arg[]) {
	try{
		FileWriter f=new FileWriter("a.txt");
		f.write("hai");
		f.close();
	}catch(IOException e) {
		System.out.println("an error occur");
	}
	
}
}
