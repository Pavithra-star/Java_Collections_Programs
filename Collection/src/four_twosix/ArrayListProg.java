package four_twosix;

import java.util.Arrays;
import java.util.Scanner;

import java.util.*;

public class ArrayListProg {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any value or name");
		String s1 = sc.nextLine();
		System.out.println(stringFormatting(s1));
	}

	public static String stringFormatting(String s1) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (i % 2 == 0) {
				if (c == 122)
					c = (char) (c - 25);
				else {
					c = (char) (c + 1);
				}
				sb.append(c);
			} else
				sb.append(c);
		}
		return sb.toString();
	}
}
//		String str,rev="";
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any name");
//		str = sc.nextLine();
//		for (int i = str.length() - 1; i >= 0; i--) {
//			rev = rev + str.charAt(i);
//		}
//		System.out.println(rev);
//
//	}
//
//}
//		int a[] = { 1, 5, 5, 6, 3, 2 };
//		System.out.println("Odd Numbers:");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 != 0) {
//				System.out.println(a[i]);
//			}
//		}
//		System.out.println("Even Numbers:");
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] % 2 == 0) {
//				System.out.println(a[i]);
//			}
//		}
//	}
//}
//		Scanner sc=new Scanner(System.in);
//		int i= (int) sc.nextInt();
//		for(int j=0 ;j<=i.length;j++) {
//		if(i[j]%2==0) {
//			System.out.println("even");
//		}
//		else {
//			System.out.println("odd");
//		}
//		}
//	}
//}
//		List<Integer> list=new ArrayList<Integer>();
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter any value");
//		
//		list.add(sc.nextInt());
////		list.add(10);
////		list.add(22);
////		list.add(28);
////		list.add(24);
////		list.add(26);
////		list.add(45);
//		List<Integer> l2=list.stream().filter(i->i%2==0).collect(Collectors.toList());
//		for (Integer integer : l2) {
//			System.out.println(integer);
//		}
//	}
//}
//	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter any number");
//		int num = sc.nextInt();
//		if (num < 0) {
//			System.out.println("Should be enter positive value");
//		} else {
//			boolean b = true;
//			for (int i = 2; i < num; i++) {
//				if (num % i == 0) {
//					b = false;
//					break;
//				}
//			}t
//			if (b) {
//				System.out.println(num + "=Palindrome");
//			} else {
//				System.out.println(num + "=not Palindrome");
//			}
//
//		}
//	}
//}

//		public class Tester {
//
//			public static void main(String[] args) {

//			Number x = 12; // Line 5
//
//			Number y = (Long) x; // Line 6
//
//			System.out.print(x+""+y); // Line 7
//
//			}
//
//			}

//		int n=10; 
//		int i=10;
//		System.out.println(n==i);
//		} }

// public class Tester {

//		public static void main(String[] args) {
//
//		do {
//
//		System.out.print("inside do");
//
//		} while (false);
//
//		while (false) {
//
//		System.out.print("inside while");
//
//		}
//
//		System.out.print("outside");
//
//		}
//
//		}

//	public static void main(String[] asd) { 
//		int a, b; 
//		a = 10; 
//		b = (a == 1) ? 20 : 30; 
//		System.out.println("Value of b is : " + b); 
//		b = (a == 10) ? 20 : 30;
//	System.out.println("Value of b is : " + b); 
//	}}
//	
//		public class Tester { 
//
//			public static void main(String[] args) { 

//			if (args.length > 0) 
//
//			for (String str : args) 
//
//			System.out.print(str); 
//
//			System.out.print("--"); 
//
//			} 
//
//			} 

//		 Integer i = Integer.parseInt(ags[0]); 
//		 int j = 12; 
//		 System.out.println("It is " + (j == i) + " that j==i.");
//		 }}//2 int _&%javaChamp; 3 int &javaChamp; 4 int 2009JavaChamp; 5 int $JavaChamp;

//		String str[] = { "radha", "krishna" };
//		ArrayList<String> a1 = new ArrayList<String>(Arrays.asList(str));
//		a1.add("sita");
//		Collections.addAll(a1, str);
//		a1.forEach(System.out::println);
//
//	}
