package four_twosix;

import java.util.Comparator;
import java.util.TreeSet;

class MyComaparator implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		return -o1.compareTo(o2);
	}
	
}
public class Comparator_prpgram {
public static void main(String[] args) {
	TreeSet<String> ts=new TreeSet<String>(new MyComaparator());
	ts.add("orange");
	ts.add("mango");
	ts.add("banana");
	ts.forEach(x-> System.out.println(x));
}
}
