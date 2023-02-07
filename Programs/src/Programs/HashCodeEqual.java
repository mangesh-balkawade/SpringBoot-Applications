package Programs;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

class emp
{
	int id;
	String name;
	public emp(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.length();
	}
	@Override
	public boolean equals(Object obj) {
		emp e=(emp) obj;
		System.out.println(e.name);
		if(e.name.equals(this.name))
			return  true;
		return false;
	}
	
	
}
public class HashCodeEqual
{
public static void main(String[] args) {
	emp e1=new emp(1,"Mangesh");
	emp e2=new emp(1,"Ram");
	emp e3=new emp(1,"Mangesh");
	HashSet<emp> li=new HashSet<>();
	li.add(e1);
	li.add(e2);
	li.add(e3);
	 for(emp e:li)
	 {
		 System.out.println(e.id+" "+e.name);
	 }
}
}
