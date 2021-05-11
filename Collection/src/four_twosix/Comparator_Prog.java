package four_twosix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

 

class Student1 implements Comparable<Student1> {
    int sno;
    String sname;

 

    public Student1() {

 

    }

 

    public Student1(int sno, String sname) {
        this.sno = sno;
        this.sname = sname;
    }

 

    @Override
    public int compareTo(Student1 o) {

 

        return this.sname.compareTo(o.sname);
    }

 

}

 

public class Comparator_Prog {

 

    public static void main(String[] args) {
        List<Student1> li = new ArrayList<Student1>();
        Student1 s1 = new Student1(4, "harsha");
        Student1 s2 = new Student1(5, "ravi");
        Student1 s3 = new Student1(1, "akash");
        Student1 s4 = new Student1(2, "jagan");
        Student1 s5 = new Student1(6, "raju");
        Student1 s6 = new Student1(3, "ramana");
        li.add(s1);
        li.add(s2);
        li.add(s3);
        li.add(s4);
        li.add(s5);
        li.add(s6);
        System.out.println("Before sorting");
        li.forEach(x -> System.out.println(x.sno + " - " + x.sname));
        Collections.sort(li);
        System.out.println("After sort");
        li.forEach(x -> System.out.println(x.sno + " - " + x.sname));

 

    }

 

}
 