package refactor_resuse;

public class efficency {
	
	public static int sum(int numbers[],int sum)
	{
		 for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }
		return sum;
	}
	
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int sum = 0;
       
        System.out.println("Sum: " + sum(numbers,sum));
    }
}