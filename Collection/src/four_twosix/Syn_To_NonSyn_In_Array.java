package four_twosix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;

public class Syn_To_NonSyn_In_Array {

	public static void main(String[] args) {
		String str[] = { "radha", "krishna" };
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(str));
		a1.add("sita");
		Collections.synchronizedList(a1);
		a1.forEach(System.out::println);

	}

}
/*
1)ArrayList<String> li=new ArrayList<String>();
List l=Collections.synchronizedList(li);

2)HashSet<String> sh=new HashSet<String>();
set h=Collections.synchronizedSet(sh);

3)HashMap<String> h=new HashMap<String>();
Map m=Collections.synchronizedMap(h);

4) TreeSet t= new TreeSet();
SortedSet s=Collections.synchronizedSortedSet(s);

5)TreeMap t= new TreeMap();
SortedSet s=Collections.synchronizedSortedMap(s);
























*/