package four_twosix;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableProg {

	public static void main(String[] args) {
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("Adhra Pradesh", "Amaravathi");
		ht.put("Telangan", "Hyderabad");
		ht.put("Nagaland", "Kohima");
		ht.put("Maharstra", "Mumbai");
		ht.put("Sikkim", "Gangtok");
		Enumeration<String> keys = ht.keys();
		while (keys.hasMoreElements()) {
			String k = (String) keys.nextElement();
			String h = ht.get(k);
			System.out.println(k + " - " + h);
		}

	}

}
