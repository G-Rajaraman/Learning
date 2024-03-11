package basicprogram1;

public class Multiple_if_inside_if_else {
byte a = 40;
public static void main(String[] args) {
	Multiple_if_inside_if_else m1= new Multiple_if_inside_if_else();
		if(m1.a<100 && m1.a>0) {
			System.out.println("When a = "+m1.a+", a is within the range");
			if(m1.a<50 && m1.a>0) {
			System.out.println("When a = "+m1.a+", a is still within the range");}
			if(m1.a>100) {
			System.out.println("When a = "+m1.a+", a is above the range");}
			}
		else {
			System.out.println("When a = "+m1.a+", a is out of the range");}
}
}