package basicprogram;
public class Factorial {
public static void main(String[] args) {
	int input = 4;//4*3*2*1=24
	int output=1; int output_alt=input;
//for(int i=1;i<=input;i++) {
//	output=output*i;//starts from 1*1->1*2->2*3->6*4
//	System.out.println(output);
//}
	for(int i=input-1;i>=2;i--) {
		output_alt=output_alt*i;//4*3->12*2->24*1
	}
	System.out.println(output_alt);
	}

}