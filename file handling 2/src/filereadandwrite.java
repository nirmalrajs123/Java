import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;  
public class filereadandwrite
{
    public static void main(String[] args) {  
    try {  
        FileWriter fwrite = new FileWriter("a.txt");  
        fwrite.write("Written using FileWriter!!!");   
        fwrite.close(); 

         FileReader fr=new FileReader("a.txt");    
         int i;    
         while((i=fr.read())!=-1)    
              System.out.print((char)i);    
         fr.close();    
        } catch (IOException e) {  
        System.out.println("Error While Writing!!!");  
        e.printStackTrace();  
        }  
    }  
}