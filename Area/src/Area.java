

public class Area {

void area(int r){
	float area=(float) (3.14*r*r);
	System.out.println("Area of the Circle "+area);
}
void area(int l,int b) {
	int area=l*b;
	System.out.println("Area of the Rectangle "+area);
	
}
void area(float d,int b1,int h) {
	float area=d*b1*h;
	System.out.println("Area of the Triangle "+area);
}
}
