package string_practice;
import java.util.Scanner;
public class String_Vertical {
public static void main(String[] args) {
Scanner Sc= new Scanner(System.in);
System.out.println("Enter the string to be printed:");
String assign=Sc.next();
for(int i=0;i<assign.length();i++) {
System.out.println(assign.charAt(i));
}}}