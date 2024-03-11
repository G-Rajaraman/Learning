package array;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
public class four {
	public static void main(String[] args) {
		LinkedHashSet l= new LinkedHashSet();
		l.add("Ashwini");
		l.add(null);
		l.add(null);
		l.add("Subathra");
		l.add("Ashwini");
		l.add("Subathra");
		l.add("Uthra");
		l.add("Shubam");
		l.add("Raja");
		l.add(13);
		l.add(true);
		l.add(true);
		l.add(true);
		LinkedHashSet l2= new LinkedHashSet();
		l2.add(40);l2.add(20);l2.add(30);l2.add(20);l2.add(10);
		System.out.println(l2);
		//Collections.sort(l2);
		System.out.println(l);
	//	Collections.sort(l);//cannot be sorted
		
	}

}
