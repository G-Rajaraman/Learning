package blocks;
public class NOT_Operator_Conditions {
	int i=19; int j=21;
public static void main(String[] args) {
	NOT_Operator_Conditions no1=new NOT_Operator_Conditions();
	if(!(no1.i>10||no1.i<13)) {System.out.println("i is true");}
	if(!(no1.i<10&&no1.j>13)) {System.out.println("j is true");}
	if(!(no1.i>10||no1.i>13)) {System.out.println("i is true, j is true");}
	if(!(no1.i>10&&no1.j<10)) {System.out.println("i is true, j false");}
	if(!(no1.i>10||no1.j>13)) {System.out.println("i is false, j is true");}
	if(!(no1.i<10&&no1.i<13)) {System.out.println("i is false, j is false");}
	}

}
