package Programs;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamS {
	public static void main(String[] args) {
		List<Integer> li = Arrays.asList(1, 8, 5, 4, 10, 5, 6, 93, 4);
		List<Integer> li2 = li.stream().filter((e1) -> {
			if (e1 % 2 == 0)
				return true;
			else
				return false;
		}).map((e) -> 
		{
			return e * e;
		}).sorted().toList();

		li2.forEach(e -> System.out.println(e));

		Integer isum = li2.stream().reduce(0, (a, b) -> {
			return a + b;
		});

		System.out.println(isum);

		int i = li2.stream().reduce(0, (a, b) -> {
			return a + b;
		});

		System.out.println(i);
		
		

	}
}
