package basicprogram1;
public class ConstructorMethodOverloading {
	ConstructorMethodOverloading(){
		System.out.println("Non-Parametric");	}
	ConstructorMethodOverloading(int a, double b){
		System.out.println("int double");	}
	ConstructorMethodOverloading(double a, int b){
		System.out.println("double int");	}
	ConstructorMethodOverloading(byte a, double b){
		System.out.println("byte double");	}
	static void MethodOverloading () {
		System.out.println("Non-Parametric MethOver");	}
	static void MethodOverloading (int a, double b) {
		System.out.println("int double - Methover");	}
	static void MethodOverloading (Long a, double b) {//Long vs long - no purple colour but accepts
		System.out.println("long double - Methover");	}
	void MethodOverloadingNonStatic() {
		System.out.println("Non-Parametric - Non-Static MethOver");	}
	void MethodOverloadingNonStatic(short a, float b) {
		System.out.println("short float");	}
	void MethodOverloadingNonStatic(short a, double b) {
		System.out.println("short double");	}
	void MethodOverloading(short a, double b) {
		System.out.println("short double - Last line");	}
	public static void main(String[] args) {
		new ConstructorMethodOverloading(-200,2.5);
		new ConstructorMethodOverloading(7.5, 43);
		new ConstructorMethodOverloading((byte)21, 2.5);//Explicit casting of byte
		MethodOverloading();
		MethodOverloading(5,4.96);
		MethodOverloading((long)34, 8.890);
		ConstructorMethodOverloading C1= new ConstructorMethodOverloading();
		C1.MethodOverloadingNonStatic();
		C1.MethodOverloadingNonStatic((short)23, 1.75f);
		C1.MethodOverloadingNonStatic((short)19, 3.89);
		C1.MethodOverloading((short)89, 45.3);
	}
}
