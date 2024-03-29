package func_strms;

import static utils.ShopUtils.*;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

import com.shop.core.Category;
import com.shop.core.Product;

public class Test6 {

	public static void main(String[] args) 
	{
		try (Scanner sc = new Scanner(System.in)) 
		{
			//product map --display sum of all products from the specified category
			Map<Integer, Product> productMap = populateProductMap(populateProductList());
			System.out.println("Orig Map");
			productMap.forEach((k, v) -> System.out.println(v));
			
			System.out.println("Enter a category");
			Category cat = Category.valueOf(sc.next().toUpperCase());
			//display sum of all products from the specified category
			// src : map ---> Collection
			// intermediate : filter, map
			// term : sum
			double sum = productMap.values() //Collection<Product>
			.stream() //Stream<Product> : all  : src
			.filter(p -> p.getProductCategory()==cat)//Stream<Product> : filtered as per cat
			.mapToDouble(p -> p.getPrice())		//DoubleStream : double : prim.
			.sum();//terminal op.
			System.out.println("Sum "+sum);	

		}

	}

}
