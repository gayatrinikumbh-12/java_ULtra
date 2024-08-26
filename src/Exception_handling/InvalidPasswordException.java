package Exception_handling;

public class InvalidPasswordException extends RuntimeException {

	public InvalidPasswordException(String str )
	{
		super(str);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "piku";
		InvalidPasswordException ip = new InvalidPasswordException(s);
		if(s.length()<8)
		{
			throw new InvalidPasswordException ("invalid pass exception");
		}
		
		
		
	}}

