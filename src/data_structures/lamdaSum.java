package data_structures;

import java.util.function.BiFunction;
import java.util.function.Function;

public class lamdaSum {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> sum = (num1, num2) ->  num1 + num2;
	      System.out.println(sum.apply(8, 5));
	}

}
