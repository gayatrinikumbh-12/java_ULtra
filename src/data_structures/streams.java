package data_structures;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class streams {

	public static <T> void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Stream<T> stream;
		IntStream.range(1, 10).forEach(
                val -> System.out.println(val)
        );
		
	}

}
