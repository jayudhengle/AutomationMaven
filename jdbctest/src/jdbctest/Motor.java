package jdbctest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Motor 
{
	public static void main(String[] args) 
	{
		  int i =24;		  
		  double j =24;
		  float k =24;
		  
		  System.out.println("Integer value of i " +i);
		  System.out.println("Double value of j " +j);
		  System.out.println("Float value of k " +k);
		  
		  
		  String name1 = "Jayu Dhengle";
		  System.out.println("String value of name " +name1);
		  
		  String name2 = "Mr.";		  	 
		  
		  
		  System.out.println("String concat of name " +	name1.charAt(0));
		  System.out.println("String concat of name " +	name2.concat(name1));
		  System.out.println("String concat of name " +	name1.indexOf('J'));

		  
		  int intArray[];    //declaring array
		  intArray = new int[20];  // allocating memory to array

		  intArray = new int[]{ 1,2,3,4,5,6,7,8,9,10}; 
		  
		  
		  ArrayList<Integer> ar= new ArrayList<Integer>();
		  ArrayList<Integer> ar1= new ArrayList<Integer>();
		  
		  ar.add(2);
		  ar.add(6);
		  ar.add(5);
		  
		  ar.sort(null);;
		  
		  System.out.println("Array Sirted"+ar);

		  
		  ar.set(1, 4);
		  
		  HashSet<Integer> hs = new HashSet<Integer>();
		  
		  LinkedHashSet<Integer> lhs = new LinkedHashSet<Integer>();
		  lhs.add(3);
		  lhs.add(1);
		  lhs.add(1);
		  lhs.add(2);
		  
		  System.out.println("Linked Hash Set"+lhs);

		  
		  hs.add(3);
		  hs.add(1);
		  hs.add(1);
		  hs.add(2);
		  
		  hs.addAll(ar);
		  
		  System.out.println("Array Set"+ar);
		  
		  System.out.println("Hash Set"+hs);
		  
		  
		  HashMap<Integer, String> hm = new HashMap<Integer, String>();
		  
		  hm.put(1, "Jayu");
		  hm.put(2, "Dibya");
		  hm.put(3, "Likitha");
		  
		  
		  Set<Integer> hs1 = hm.keySet();
		  

		  System.out.println("Hash Map Keyset "+hs1);
		  
		  
		  System.out.println("Hash Map "+hm.get(2));
		  
		  
		  System.out.println("Get "+ar.get(2));
		  
		  ar1.add(3);
		  ar1.add(5);
		  ar1.add(4);
		  
		  
		  System.out.println("Add All" +ar.addAll(ar1));

		  Iterator it;		  
		  it = ar.iterator();
		  
		  
		  System.out.println(" Array List "+ar);
		  
	
		  try
		  {
			  while(it.hasNext())
				  System.out.println(" Value "+it.next());  
			  
		  }
		  catch(Exception e)
		  {
			  System.out.println("Not sure!!!");
		  }
		  			  
		  
		  
		  
		  
		  for (int l = 0; l < intArray.length; l++) 
		  {
			  System.out.println(intArray[l]);
		  }
		  
		  System.out.println("For each loop ");
		  try
		  {
			  for(int i1 : intArray)
				  System.out.println(i1);
		  }
		  catch(Exception e)
		  {
			  System.out.println("We got the error!!!");
		  }
		  

		  
		
		




	}
}
