package four_twosix;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Employee1 implements Comparable {
	int emNo;
	String name;

	@Override
	public String toString() {
		return "Employee [emNo=" + emNo + ", name=" + name + "]";
	}

	public int getEmNo() {
		return emNo;
	}

	public void setEmNo(int emNo) {
		this.emNo = emNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Employee1(int emNo, String name) {
		super();
		this.emNo = emNo;
		this.name = name;
	}

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		Employee1 e = (Employee1) arg0;
		return this.emNo - e.emNo;
	}

//	@Override
//	public int compareTo(Object arg0) {
//		// TODO Auto-generated method stub
//		Employee1 e = (Employee1) arg0;
//
//		//return this.name - e.name;
//	}
}

public class Comparable_Prog {

	public static void main(String[] args) {
		List<Employee1> list = new ArrayList<Employee1>();
		Employee1 e1 = new Employee1(10, "pavi");
		Employee1 e2 = new Employee1(4, "ravi");
		Employee1 e3 = new Employee1(6, "rani");
		Employee1 e4 = new Employee1(8, "pallavi");
		Employee1 e5 = new Employee1(1, "radha");
		Employee1 e6 = new Employee1(5, "sita");
		Employee1 e7 = new Employee1(2, "raj");
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		list.add(e7);
		List<Employee1> l1=list.stream().sorted().collect(Collectors.toList());
		l1.forEach(x->System.out.println(x+" sortd in stream"));
		List<Employee1> l2=list.stream().sorted().collect(Collectors.toList());
		l2.forEach(x->System.out.println(x+" sortd in stream String name"));
		//l1.forEach(System.out::println);
		//System.out.println("sorted in stream" +l1);
		System.out.println("list of the meployee" );
		list.forEach(x->System.out.println(x.getEmNo() + " " + x.getName()));
		Collections.sort(list);
				System.out.println("after sorting");
		list.forEach(x->System.out.println(x.getEmNo()+ " " + x.getName()));

	}
}
