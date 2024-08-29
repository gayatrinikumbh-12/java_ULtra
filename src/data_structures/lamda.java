package data_structures;

import java.util.function.Function;

public class lamda {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		  Function<Integer, Integer> square = number -> number * number;
	        System.out.println(square.apply(5));
	}

}
