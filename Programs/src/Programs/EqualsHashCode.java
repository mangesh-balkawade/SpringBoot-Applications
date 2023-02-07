package Programs;

import java.util.HashSet;

class Student1
{
	int roll;
	String name;
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.roll;
	}
	@Override
	public boolean equals(Object obj) {
		Student1 other=(Student1)obj;
		if(this.roll==other.roll)
			return true;
		return false;
	}
	
	
}

public class EqualsHashCode 
{
 public static void main(String[] args) 
 {
	 Student1 s1=new Student1();
	 s1.roll=1;
	 Student1 s2=new Student1();
	 s2.roll=1;
	 HashSet<Student1> set1=new HashSet<>();
	 set1.add(s1);
	 set1.add(s2);
	 System.out.println(set1);
//	 System.out.println(s1.hashCode());
//	 System.out.println(s2.hashCode());
//	 if(s1==s2)
//		 System.out.println("Same");
}
}
