package basicprogram1;
public class ConstructorOverloading {
	ConstructorOverloading(){
		System.out.println("Construtor Overloading Example");	}
	ConstructorOverloading(int a){
		System.out.println("Construtor Overloading Example Using int a");}
	ConstructorOverloading(int a, int b){
		System.out.println("Construtor Overloading Example Using int a, int b");}
	ConstructorOverloading(int a, double b){
		System.out.println("Construtor Overloading Example Using int a, double b");}
	ConstructorOverloading(double b, int a){
		System.out.println("Construtor Overloading Example Using double b, int a");}
	ConstructorOverloading(boolean a, boolean b){
		System.out.println("Construtor Overloading Example Using boolean a, boolean b");}
	ConstructorOverloading(boolean a, boolean b, boolean c){
		System.out.println("Construtor Overloading Example Using boolean a, boolean b, boolean c");}
	public static void main(String[] args) {
		new ConstructorOverloading();
		new ConstructorOverloading(9);
		new ConstructorOverloading(3,5.6);
		new ConstructorOverloading(9.0,6);
		new ConstructorOverloading(true,true);
		new ConstructorOverloading(false,true,true);
	}
}
