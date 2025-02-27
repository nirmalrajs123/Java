class Employee{
	void display() {
		System.out.println("Name of class is Employee");
	}
	void calcSalary() {
		System.out.println("Salary of Employee is 10,000");
	}
}	
class Engineer extends Employee {
	void calcSalary() {
	System.out.println("Salary of Employee is 20,000");	
	super.display();
	super.calcSalary();
	}
}
