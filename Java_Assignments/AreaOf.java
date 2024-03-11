package basicprogram1;
public class AreaOf {
static float radius= 5; static float side=10;static float length=20;
static float breadth= 30;static float base=15;static float height=35;
	public static void main(String[] args) {
	Triangle();Circle();Rectangle();Square();
	}
	static void Triangle() {
	System.out.println("Area of the triangle =" + (0.5f) * base * height);
// Area of equilateral triangle = (1/4)(√3*a^2)
	float area = (float) ((Math.sqrt(3) * Math.pow(side, 2)) / 4);
	System.out.println("Area of Equilateral Triangle =" + area);
	}
	static void Circle() {
	radius=25;
	System.out.println("Area of the circle =" + ((float) (Math.PI * Math.pow(radius, 2))));
	}
	static void Rectangle() {
	length=40;breadth=50;
		System.out.println("Area of rectangle is =" + (int)(length*breadth));
	}
	static void Square() {
	//overflow caused negative result. refer screenshot.
	side=20;
	System.out.println("Area of the square =" +  (byte)Math.pow(side, 2));
	}
}
