package understanding_Scan;
import java.util.Scanner;
public class AreaOfCircleScan {
public static void main(String[] args) {
Scanner S1= new Scanner(System.in);
System.out.println("Enter the radius of circle, r");
int r=S1.nextInt();
System.out.println("Area of Circle = "+((float)((Math.PI)*Math.pow(r, 2))));
S1.close();
}}
