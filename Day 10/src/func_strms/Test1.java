package func_strms;
import java.util.Arrays;

public class Test1 
{

	public static void main(String[] args) 
	{
		int[] data= {10,23,1,2,45,5,6,-10,8,567,89};
		//sort the data (asc) n display data : in single java stmt (using Functional streams)
		//1. Stream the data from int[] : src
		//2 any intermediate ops ???
		//3 . any terminal op ???
		Arrays.stream(data) //IntStream java.util.Arrays.stream(int[] array)
		.sorted() //IntStream : sorted as per Natural ordering --- int strm
		.forEach(i -> System.out.print(i+" "));
		
		
		//by using method reference
		System.out.println("\n-----------------");
		Arrays.stream(data)
		.sorted()
		.forEach(System.out::println);
	}

}



