package data_structures;


import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Integer> mySet = new HashSet<Integer>();
		mySet.add(5);
		mySet.add(15);
		mySet.add(25);
		mySet.add(35);
		mySet.add(45);
	
		mySet.remove(35);
		
		Iterator i = mySet.iterator();
		
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}

}
