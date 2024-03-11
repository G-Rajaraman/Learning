package blocks;
public class OR_Operator_Conditions {
int i= 12;int j=16;
public static void main(String[] args) {
	OR_Operator_Conditions o1= new OR_Operator_Conditions();
	if(o1.i>10||o1.i<13) {System.out.println("i is within range");}
	if(o1.i<10||o1.j>13) {System.out.println("j is within range");}
	if(o1.i>10||o1.i>13) {System.out.println("i is within range, j is within range");}
	if(o1.i>10||o1.j<10) {System.out.println("i is within range, j is out of range");}
	if(o1.i>10||o1.j>13) {System.out.println("i is out of range, j is within range");}
	if(o1.i<10||o1.i<13) {System.out.println("i is out of range, j is out of range");}
	
	}
	}
