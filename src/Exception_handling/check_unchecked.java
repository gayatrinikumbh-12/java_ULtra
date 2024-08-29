package Exception_handling;

import java.io.IOException;

public class check_unchecked {

	void throwCheckedException() throws IOException
	{
		throw new IOException ("IO exception");
	}
	
	
	void throwUncheckedException()
	{
		throw new ArithmeticException ("arithmatic exception");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		check_unchecked c = new check_unchecked();
		try {
			c.throwCheckedException();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		c.throwUncheckedException();
	}

}
