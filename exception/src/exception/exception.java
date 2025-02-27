package exception;
import java.io.IOException;
public class exception {
public static void main(String arg[]) throws IOException{
	try {
		int n=10;
		System.out.println(n/0);
		
	}catch (ArithmeticException e) {  
        System.out.println("Error While Writing!!!");  
        e.printStackTrace();  
    }finally{
    	System.out.println("program completed");
    }
}
}
