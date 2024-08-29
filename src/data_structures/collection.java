package data_structures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> myList = new LinkedList<String>();

		myList.add("piku");
		myList.add("motu");
		myList.add("mau");

		Set<Integer> mySet = new HashSet<Integer>();
		mySet.add(2);
		mySet.add(4);
		mySet.add(6);

		Map<Integer, String> myMap = new HashMap();

		myMap.put(1, "piku");

		myMap.put(2, "Mau");

		myMap.put(3, "Motu");
		
		for(String s :myList)
		{
			System.out.println("list element  "+s);
		}
		
	
		Iterator i = mySet.iterator();
		while(i.hasNext())
		{
			System.out.println("set elements"+i.next());
		}
		
		Set s = myMap.entrySet();
		
		Iterator ss = s.iterator();
		while(ss.hasNext())
		{
			System.out.println("Map elements"+ss.next());
			System.out.println("Map elements"+myMap.entrySet());
		}

	}

}
