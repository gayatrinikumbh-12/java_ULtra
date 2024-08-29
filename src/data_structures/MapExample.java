package data_structures;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map <Integer ,String  >myMap = new HashMap();
		
		myMap.put(1, "piku");
		
		myMap.put(2, "pikui.......;");
		
		myMap.put(3, "pikudee//////////////////////");
		
	
		
		myMap.remove(2);
		
		System.out.println(myMap);
	}

}
