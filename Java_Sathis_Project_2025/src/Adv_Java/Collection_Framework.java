package Adv_Java;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Collection_Framework {
	 static public void main(String[] args) {
		
//		List<Integer> values = new ArrayList<>();
//		
//		values.add(10);
//		values.add(20);
//		values.add(30);
//		values.add(1, 15);
//				
//		//Collections.sort(values);
//		
//		System.out.println(values);
//		System.out.println(values.size());
//		System.out.println(values.set(0, 11));
//		System.out.println(values.get(0));
//		
//		values.add("Java");
//		System.out.println(values);
		
		//for(int n:values)// cannot convert from element type object to int
			
//		for(int a:values)// cannot convert from element type object to int
//		{
//			//int val = (int)o*2;
//			System.out.println(a);
//		}
		
		
		
		
		// in collection don't have index method like get(),set()
//		Collection<Integer> cl = new ArrayList<>();
//		cl.add(10);
//		cl.add(20);
//		cl.add(30);
//		cl.add(10);
//				
//		while(cl.contains(10))
//			cl.remove(10);
//		System.out.println(cl.contains(10));
//		
//		System.out.println(cl);
		
		
		/*----------------------------------------------------------------*/
//		List<Integer> values = new ArrayList<>();
////		
//		values.add(10);
//		values.add(20);
//		values.add(30);
//
//		//values.remove(0);
//		//System.out.println(values.get(0));
//		System.out.println(values);
//		values.remove(values.indexOf(20));
//		System.out.println(values);
//		
		//Collection -remove() should be - Values
		//ArrayList -remove() should be - Index position
		
		/*----------------------------------------------------------------*/	
		
//		List<Integer> values = new ArrayList<>();
//	
//		values.add(10);
//		values.add(20);
//		values.add(30);
//		values.add(0, 5);
//		values.add(10); //duplicate allow
		
		//System.out.println(values);
		
		
//		Iterator it = values.iterator();
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
//		System.out.println(it.next());
		
		// 3 ways to print iterator, enhanced for loop and simply sysout
//		while(it.hasNext())
//			System.out.print(it.next()+	" ");
//		
//		System.out.println();
//		for(int i: values)
//			System.out.println(i);
//		
		
		/*----------------------------------------------------------------*/
		
		// Set interface in java -- 
		// unordered unique elements
		// drawback - don't have index order 
		
		//Set<Integer> s = new HashSet<>();// unordered elements
//		Set<Integer> s = new TreeSet<>();// ordered elements
//		
//		
//		s.add(10);
//		s.add(50);
//		s.add(17);
//		s.add(28);
//		s.add(10);
//		
//		System.out.println(s);
		
		/*----------------------------------------------------------------*/
		
		// Map interface
		// <key, value>	pair
		// <String, Integer> pair
		// Key followed by set interface (unordered and unique) and Value followed by List interface(allow duplicate)
		//Map<String,Integer> m = new HashMap<>();// allow null value
		//Map<String,Integer> m = new Hashtable<>();// not allow null value
		Map<String,Integer> m = new TreeMap<>();//sorter order and not allow null key but value may be null
		m.put("Ram", 97);
		m.put("Sathis", 97);
		m.put("Anu", 56);
		m.put("Raghul", 99);
		m.put("Ram", 90);
		//m.put("Jesto", null); // no
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.get("Sathis"));
		System.out.println(m.keySet());
		System.out.println(m.values());
		
		for(String str:m.keySet())
			System.out.println(str);
		
		for(int i :m.values())
			System.out.println(i);
		
		for(String key:m.keySet())
			System.out.println(key+":"+m.get(key));
		
		System.out.println(m.containsKey("Jesto"));
		System.out.println(m.containsValue(100));
		System.out.println(m.remove("Sathis" ));
	}

}
