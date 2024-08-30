package refactor_resuse;

public class dup {

		static int ave(int numbers[])
		{
			int sum=0;
			for (int number : numbers) {
	            sum += number;
	        }
			
			return sum;
		}

	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};
	       
	        System.out.println("Sum: " + ave(numbers));
	        double average = 0;
	       
	        average= ave(numbers);
	        average /= numbers.length;
	        System.out.println("Average: " + average);
	    
	}
	
	
	
	
}
