package four_twosix;

import java.util.Comparator;
import java.util.TreeSet;

class Mycoma implements Comparator<StringBuffer>{

	@Override
	public int compare(StringBuffer o1, StringBuffer o2) {
		String m1=o1.toString();
		String m2=o2.toString();
		return m1.compareTo(m2);
	}
	
}
public class StringBuffer_Comparator {

	public static void main(String[] args) {
		TreeSet<StringBuffer> ts=new TreeSet<StringBuffer>(new Mycoma());
ts.add(new StringBuffer("pandu"));
ts.add(new StringBuffer("radha"));
ts.add(new StringBuffer("Anusha"));
ts.forEach(x->System.out.println(x));
	}
}
