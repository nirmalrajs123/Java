package interfaces;
public class Main {
public static void main(String arg[]) {
	dis d =new dis();
d.display();
}
}
interface display{
	void display1();
}
 class dis implements display{
	void display() {
		System.out.println("hai");
	}
}