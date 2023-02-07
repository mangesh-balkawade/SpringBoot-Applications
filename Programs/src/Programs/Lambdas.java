package Programs;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

interface ilamda
{
	int add(int ino1,int ino2);
}

public class Lambdas 
{
public static void main(String[] args) 
{
 
	ilamda addx=(ino1,ino2)-> ino1+ino2;
	System.out.println(addx.add(1, 2));
	
	Function<Integer, Integer> f1=(ino1)->ino1+1;
	System.out.println(f1.apply(10));
	
	Predicate<Integer> p1=(ino1)->{
		if(ino1>=18)
			return true;
		return false;
	};
	
	System.out.println(p1.test(19));
	
	Consumer<Integer> c1=(ino1)->System.out.println(ino1);
	c1.accept(10);
	
	Supplier<Integer> s1=()->1;
	System.out.println(s1.get());
	
	
}

}
