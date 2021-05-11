package four_twosix;

import java.util.HashSet;

class Stu{
	int id;
	String name;
	public Stu(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Stu [id=" + id + ", name=" + name + "]";
	}
	public int hashCode() {
		return this.id;
		
	}
	public boolean equals(Object ob) {
		Stu s= (Stu)ob;
		return this.id==s.id && this.name.equals(s.name);
		
	}
}
public class Demo {

	public static void main(String[] args) {
		HashSet<Stu> hs=new HashSet<Stu>();
		Stu s1=new Stu(10,"anusha");
		Stu s2=new Stu(10,"anusha");
		Stu s3=new Stu(1,"shiva");
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);
		hs.forEach(System.out::println);

	}

}
