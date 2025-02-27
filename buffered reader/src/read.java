import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class read {
public static void main(String arg[])throws IOException {
	BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
	String name=reader.readLine();
	System.out.println(name);
}
}
