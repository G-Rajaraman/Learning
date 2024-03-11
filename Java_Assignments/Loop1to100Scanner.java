package understanding_Scan;
import java.util.Scanner;
public class Loop1to100Scanner {
public static void main(String[] args) {
		Scanner S1 = new Scanner(System.in);
		System.out.println("Enter the value of i");
		int i=S1.nextInt();
		System.out.println("Enter the value of j");
		int j = S1.nextInt();
		for (i = i; i <= j; i++) {
			System.out.print(i+" ");
			S1.close();
		}
	}
}
