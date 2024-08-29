package Exception_handling;

public class InvalidAgeException extends Exception {

	public InvalidAgeException(String s )
	{
		super(s);
		
	}
	
	
	public String toString()
	{
		
		return "string msg"+super.getMessage();
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
			
			i.printStackTrace();
		}
		
		
	}}

