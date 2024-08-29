package Exception_handling;

public class InvalidAgeException extends RuntimeException {

	public InvalidAgeException(String s )
	{
		super(s);
		
	}
	
	
	public String toString()
	{
		System.out.println("return msg");
		return "string msg";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s = "piku";
		int age = 16;
		//InvalidAgeException ip = new InvalidAgeException(age);
		
		try
		{
			if(age<18)
			{
				throw new InvalidAgeException ("invalid pass exception");
			}
		}
		catch(InvalidAgeException i)
		{
			i.toString();
			i.printStackTrace();
		}
		
		
	}}

