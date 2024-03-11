package basicprogram1;

public class CircumferenceOf {
	static byte side = 10; static byte radius = 10;static byte length = 20;
	static byte breadth = 10;static byte height = 10;

	public static void main(String[] args) {
	Triangle();Circle();Rectangle();Square();
	}
	static void Triangle() {
		side=20;
		System.out.println("Equilateral Triangle's Perimeter =" +(byte)(side*3));
	}
	static void Circle() {
		System.out.println("Circumference ="+(float)(2*Math.PI*radius));
	}
	static void Rectangle() {
		System.out.println("Rectangle's Perimeter ="+(2*(length+breadth)));
	}
	static void Square() {
		side=5;
		System.out.println("Square's Perimeter"+(side*4));
	}

}
