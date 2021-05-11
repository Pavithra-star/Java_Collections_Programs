package four_twosix;

import java.util.ArrayList;
import java.util.Arrays;

public class List_To_Array {

	public static void main(String[] args) {
		String str[] = { "ramu", "sita" };
		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(str));
		Object b[] = a1.toArray();
		for (Object x : b) {
			System.out.println(x);
		}
	}

}
