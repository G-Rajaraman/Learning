package understanding_Scan;import java.util.Scanner;import java.text.DecimalFormat;
public class AddSubMulDiv_ScannerAltLocalMultiObj {static int a;static int b;
public static void main(String[] args) {add();sub();
AddSubMulDiv_ScannerAltLocalMultiObj A1= new AddSubMulDiv_ScannerAltLocalMultiObj(); A1.mul();A1.div();}
static void add() {System.out.println("add");
Scanner S1= new Scanner(System.in);
a=S1.nextInt();b=S1.nextInt();
System.out.println((a+"+"+b+" = ")+(a+b));//S1.close();
}
static void sub() {System.out.println("sub");
Scanner S1= new Scanner(System.in);
a=S1.nextInt();b=S1.nextInt();
System.out.println((a+"-"+b+" = ")+(a-b));//S1.close();
}
void mul() {System.out.println("mul");
Scanner S1= new Scanner(System.in);
a=S1.nextInt();b=S1.nextInt();
System.out.println((a+"*"+b+" = ")+(a*b));//S1.close();
}
void div() {System.out.println("div");
Scanner S1= new Scanner(System.in);
DecimalFormat d=new DecimalFormat("#.##");
a=S1.nextInt();b=S1.nextInt();
System.out.println((a+"/"+b+" = ")+(d.format((double)a/b)));//S1.close();
}}