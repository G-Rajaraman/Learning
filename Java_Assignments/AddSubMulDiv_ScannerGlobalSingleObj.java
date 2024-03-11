package understanding_Scan;
import java.util.*;import java.text.DecimalFormat;
public class AddSubMulDiv_ScannerGlobalSingleObj {static int a;static int b;
static Scanner S1= new Scanner(System.in);
public static void main(String[] args) {add();sub();
AddSubMulDiv_ScannerGlobalSingleObj A1= new AddSubMulDiv_ScannerGlobalSingleObj(); 
A1.mul();A1.div();}
static void add() {System.out.println("add");
a=S1.nextInt();b=S1.nextInt();
System.out.println((a+"+"+b+" = ")+(a+b));}
static void sub() {System.out.println("sub");
a=S1.nextInt();b=S1.nextInt();
System.out.println((a+"-"+b+" = ")+(a-b));}
void mul() {System.out.println("mul");
a=S1.nextInt();b=S1.nextInt();
System.out.println((a+"*"+b+" = ")+(a*b));}
void div() {System.out.println("div");
DecimalFormat d=new DecimalFormat("#.####");
a=S1.nextInt();b=S1.nextInt();
System.out.println((a+"/"+b+" = ")+(d.format((double)a/b)));}}