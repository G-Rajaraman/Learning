package basicprogram1;
public class LeapYearCheck {
static short a= 1992;
static void if_else() {
		if ((a % 4)==0)
		{
			System.out.println(a+" is a leap year");
		}
		else {
			System.out.println(a+" is not a leap year");
		}}

	public static void main(String[] args) {
		if_else();
		a=1993;
		if_else();
		
		}
	}
