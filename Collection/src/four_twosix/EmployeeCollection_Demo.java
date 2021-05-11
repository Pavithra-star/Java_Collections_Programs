package four_twosix;

import java.util.ArrayList;


class Employee {
	int id;
	String name;

	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}}

	class Student {
		int sno;
		String sname;

		public Student(int sno, String sname) {
			this.sno = sno;
			this.sname = sname;
		}

		public int getSno() {
			return sno;
		}

		public void setSno(int sno) {
			this.sno = sno;
		}

		public String getSname() {
			return sname;
		}

		public void setSname(String sname) {
			this.sname = sname;
		}

		public String toString() {
			return sno + " " + sname;
		}

	}


public class EmployeeCollection_Demo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Employee(10, "padma"));
		list.add(new Employee(11, "sita"));
		list.add(new Employee(13, "phani"));

		list.add(new Student(1, "ramu"));
		list.add(new Student(2, "laxman"));
		

		list.add("pavithra");
		Object b[] = list.toArray();
		for (Object x : b) {
			if (x instanceof Employee) {
				Employee e = (Employee) x;
				System.out.println("Employee info");
				System.out.println(e.id+ " " +e.name);
			}
			if( x instanceof Student) {
				Student f= (Student)x;
				System.out.println("studnet info");
				System.out.println(f.sno + " " + f.sname);
			}
			if(x instanceof String) {
				System.out.println(x.toString());
			}

		}

	}

}
