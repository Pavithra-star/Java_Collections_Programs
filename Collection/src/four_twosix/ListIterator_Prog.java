package four_twosix;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIterator_Prog {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("radha");
		list.add("ramu");
		list.add("sita");
		list.add("raj");
		list.add("laxman");
		ListIterator<String> li=list.listIterator();
		System.out.println("forword direction");
		while(li.hasNext()) {
			System.out.println(li.next());
		}
System.out.println("back word");
while(li.hasPrevious()) {
	System.out.println(li.previous());
}
	}

}
