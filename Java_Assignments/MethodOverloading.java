package basicprogram1;
public class MethodOverloading {
	void MethOver(int a, int b, double c){
		System.out.println("Method Overloading Example Using int a, int b, double c");
		double d= a*b*c;
		System.out.println(d);
	}
	void MethOver(double a, int b, int c){
		System.out.println("Method Overloading Example Using double a, int b, int c");
	}
	void MethOver(int a, double b, int c){
		System.out.println("Method Overloading Example Using int a, double b, int c");
	}
	static void MethOver(String a, char b){
		System.out.println("Method Overloading Example Using String a, char b");
	}
	static void MethOver(char a, String b){
		System.out.println("Method Overloading Example Using char a, String b");
	}
	public static void main(String[] args) {
		MethodOverloading M1= new MethodOverloading();
		M1.MethOver(100,10,0.333);
		M1.MethOver(56.25,785,89);
		M1.MethOver(14,89.25,12);
		MethOver("Good",'m');
		MethOver('G',"Night");

	}

}
