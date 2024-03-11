package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Two 
{
	public static void main(String[] args) 
	{
	ArrayList a1=new ArrayList();
	ArrayList a2=new ArrayList();
	a1.add(43);
	a1.add(57);
	a1.add(11);
	a1.add(27);
	a1.add(31);
	a1.add(98);
	a1.add(16);
	Collections.sort(a1);;
	a1=a2;
	Arrays.sort(a1,Collections.reverseOrder());
	a1.Collections.reverseOrder();
	System.out.println(a2);
	System.out.println(a1);
	
	}

}
