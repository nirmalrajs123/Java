
 abstract class shape {

abstract void numberOfSides(); 

}

class Rectangle extends shape{
    void numberOfSides() {
	System.out.println("Number of sides of Rectangle is 4");	
	}
}
class Triangle extends shape{
    void numberOfSides() {
	System.out.println("Number of sides of Triangle  is 3");	
	}
}
class Hexagon extends shape{
	void numberOfSides() {
	System.out.println("Number of sides of Hexagon is 6");	
	}
}