package string_practice;
import java.util.Arrays;
public class Comp_Arrays {
public static void main(String[] args) {
		String a[]= {"aa","bb","cc","dd"};
		String b[]= {"aa","bb","cc","dd"};
		int c[]= {10,20,30,40,50};
		int d[]= {10,20,30,40};
		if(Arrays.equals(a, b)) {System.out.println("The arrays are equal");}
		else {System.out.println("The arrays are not equal");
		}
		if(Arrays.equals(c, d)) {System.out.println("The arrays are equal");}
		else {System.out.println("The arrays are not equal");
		}
	}
}
