package four_twosix;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Comparable_Names {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();

		a1.add("sita");
		a1.add("radha");
		a1.add("AAa");

		List<String> l2 = a1.stream().sorted().collect(Collectors.toList());
		// System.out.println(l2);
		l2.forEach(x -> System.out.println(x));
	}

}
