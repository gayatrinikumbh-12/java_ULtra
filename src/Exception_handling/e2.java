package Exception_handling;

import java.io.IOException;

public class e2 {

	public static void readFile() throws IOException
	{
		throw new IOException ("file not found");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("file not found" );
			e.printStackTrace();
		}
		
	}

}
