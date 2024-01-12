package generics;
import java.util.ArrayList;


class HashMap<K,V>
{
	public void add(K key1, V value1) 
	{
		
	}
	
	public <V> V get(K keys)
	{
		return null;
	}
}



class BBB<T>
{
	public void add(T o)
	{
		
	}
	
	public T get(int index)
	{
		return null;
	}
	
	
	@Override
	public String toString()
	{
		return null;
	}
}




class AAA
{
	public void add(Object o)
	{
		
	}
	
	public Object get(int index)
	{
		return null;
	}
}



public class Demo1 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings({"deprecation" ,"unused"})
		Integer i=new Integer(10);
		System.out.println("I : "+i);
		
		ArrayList<String> al=new ArrayList<>(20);
		al.add("Balaji");
		al.add("Gapat");
		al.add("12");
		al.add("123");
		al.add("Dongrewadi");
		System.out.println(al.toString());
		
		ArrayList<Object> al1 = new ArrayList<>();
		al1.add("hello");
		al1.add(123);
		System.out.println(al1.toString());
		String s1=(String) al1.get(0);
		
		AAA obj=new AAA();
		obj.add("balaji");
		String Name= (String) obj.get(0); // type casting is must
		
		
		BBB<String> obj1=new BBB<>();
		obj1.add("DONGREWADI");
		obj1.add("123");
		System.out.println(obj1.toString());
		
		HashMap<Integer, String> hm=new HashMap<>();
		hm.add(123, "Balaji");
		String str=hm.get(12);
		
	}
}
