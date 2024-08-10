package OOP;

public class Calculator {

	double result;
	public double add(double a , double b)
	{
		result = a+b;
		return result;
	}
	
	public double subtract(double a , double b)
	{
		result = a-b;
		return result;
		
	}
	
	public double multiply(double a , double b)
	{
		result = a*b;
		return result;
	}
	
	public double divide(double a , double b)
	{
		result = a/b;
		return result;
		
	}
		
	
	
	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		System.out.println("multiplication " +cal.multiply(9.8, 10));
		System.out.println("divide " +cal.divide(9.8, 10));

	}

}
