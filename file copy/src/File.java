import java.io.*;
public class File {
public static void main(String arg[]) {
	
	FileOutputStream fout=null;
	FileInputStream fin=null;
	try {
		fout=new FileOutputStream("b.txt");
	 fin=new FileInputStream("a.txt");
	 while(fin.read()!=-1) {
		  int c=fin.read();
		  System.out.print((char)c);
				  fout.write(c);

	 }
	 fin.close();
		fout.close(); 
	 
	}catch(IOException e) {
		System.out.println("an error occur"+e);
	}
}
}
