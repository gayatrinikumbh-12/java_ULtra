package data_structures;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class list_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> myList = new LinkedList<Integer>();

		myList.add(10);
		myList.add(20);
		myList.add(30);
		myList.add(10);
		myList.add(40);

		Collections.sort(myList);

		System.out.println(myList);
	}

}