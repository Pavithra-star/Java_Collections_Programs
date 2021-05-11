package four_twosix;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_ShortCut {

	public static void main(String[] args) {
		ArrayList<String> a1 = new ArrayList<String>();
		String str[] = { "radha", "sita", "raj" };
		Collections.addAll(a1, str);
		a1.forEach(System.out::println);

	}

}
