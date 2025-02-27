
public class Employee {
	public static void main(String arg[]) {
		Manager m=new Manager();
		Officer o=new Officer();
		System.out.println("Print the details of Manager");
		System.out.println("Name "+m.name);
		System.out.println("Age "+m.age);
		System.out.println("Phone Number "+m.phone_number);
		System.out.println("Address "+m.address);
		m.print_salary();
		System.out.println("Print the details of Officer");
		System.out.println("Name "+o.name);
		System.out.println("Age "+o.age);
		System.out.println("Phone Number "+o.phone_number);
		System.out.println("Address "+o.address);
		o.print_salary();
	}
	
}
