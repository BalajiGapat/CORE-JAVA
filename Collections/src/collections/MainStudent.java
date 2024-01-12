package collections;

import java.util.ArrayList;
import java.util.Collections;

class Students
{
	public int rollNo;
	public String name;
	public String std;
	public double percentage;
	public long mobile;
	
	
	public Students() 
	{
		super();
	}

	public Students(int rollNo, String name, String std, double percentage, long mobile) 
	{
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.std = std;
		this.percentage = percentage;
		this.mobile = mobile;
	}


	@Override
	public String toString() 
	{
		return "Students [rollNo=" + rollNo + ", name=" + name + ", std=" + std + ", percentage=" + percentage
				+ ", mobile=" + mobile + "]";
	}
		
}

public class MainStudent
{
	public static void main(String[] args) 
	{	
		ArrayList<Students> alist=new ArrayList<>();
		alist.add(new Students(123, "anushka", "PG DAC", 66.25, 9096973617L));
		alist.add(new Students(123, "aarti", "PG DAC", 66.25, 9096973617L));
		alist.add(new Students(123, "ankita", "PG DAC", 66.25, 9096973617L));
		alist.add(new Students(123, "madhuri", "PG DAC", 66.25, 9096973617L));
		alist.add(new Students(123, "dipika", "PG DBDA", 66.25, 9096973617L));
		
		Students stud1=new Students(123, "katrina", "PG DAC", 66.25, 9096973617L);
		alist.add(stud1);
		
		// System.out.println(alist.toString());
		// System.out.println(alist);
		// System.out.println();
		
		for(Students s:alist)
			System.out.println(s);
		
		System.out.println("\n"+alist.contains(stud1));
		
	}
}
