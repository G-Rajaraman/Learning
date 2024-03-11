package basicprogram1;

public class PositiveNegative {
int a=-45;
	void if_else() {
		if(a>0 ) {
			System.out.println("This local variable a is positive");
		}
		else {
			System.out.println("This local variable a is negative");
		}
	}

	public static void main(String[] args) {
		PositiveNegative p1= new PositiveNegative ();
		p1.if_else();
		p1.a=45;
		p1.if_else();
		
	}

}
