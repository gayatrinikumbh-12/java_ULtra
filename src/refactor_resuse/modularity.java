package refactor_resuse;

public class modularity {

	public static long fact(int num) {
		long factorial = 1;
		for (int i = 1; i <= num; ++i) {
			factorial *= i;
		}
		return factorial;
	}

	public static void main(String[] args) {
		int num = 5;

		System.out.println("Factorial of " + num + "is" + fact(num));
	}

}