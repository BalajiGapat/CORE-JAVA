package func_strms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Test3 {

	public static void main(String[] args) {
		// are the streams reusable ? NO
		int[] data = { 10, 23, 1, 2, 45, 5, 6, -10, 8, 567, 89 };
		ArrayList<Integer> ints=new ArrayList<>(Arrays.asList(10, 23, 1, 2, 45, 5, 6, -10, 8, 567, 89));
		ints.add(1222);
		System.out.println("display arraylist : "+ints);
		
		ints.forEach(p->System.out.print(p+"  ")); //by foreach
		
		//attach strm n display elems
		System.out.println("\nseq processing\n");
		ints.stream() //Stream<Integer>
		.forEach(i -> System.out.print(i+" "));//ordered o/p
		
		
		//attach parallel strm n display elems
		System.out.println("\nparallel processing");
		ints.parallelStream() //Stream<Integer>
		.forEach(i -> System.out.print(i+" "));
		
	}

}
