package blocks;
public class AND_Operator_Conditions {
int num1=32; int num2 =23;
public static void main(String[] args) {	
	AND_Operator_Conditions a1= new AND_Operator_Conditions();
	if(a1.num1>10&&a1.num2<13) {System.out.println("num1 is within range");}
	if(a1.num1>10&&a1.num2<13) {System.out.println("num2 is within range");}
	if(a1.num1>10&&a1.num2>13) {System.out.println("num1 is within range, num2 is within range");}
	if(a1.num1>10&&a1.num2<10) {System.out.println("num1 is within range, num2 is out of range");}
	if(a1.num1>10&&a1.num2>13) {System.out.println("num1 is out of range, num2 is within range");}
	if(a1.num1<10&&a1.num2<13) {System.out.println("num1 is out of range, num2 is out of range");}
	}

}
