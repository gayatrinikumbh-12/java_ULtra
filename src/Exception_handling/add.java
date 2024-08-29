package Exception_handling;

public class add {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 , num2 , res;
		num1 = 10;
		num2 = 0;
		
		try {
			res= num1/num2;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
