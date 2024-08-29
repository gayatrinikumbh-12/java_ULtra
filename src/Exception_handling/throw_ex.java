package Exception_handling;

import java.io.IOException;

public class throw_ex {

	
	void method1() throws IOException
	{
		throw new IOException ("IO exception");
	}
	
	
	
	void method2() throws IOException 
	{
		method1();
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		throw_ex t = new throw_ex();
		try {
			t.method2();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
