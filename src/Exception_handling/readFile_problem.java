package Exception_handling;

import java.io.IOException;

public class readFile_problem{
	
	
	void readFile() throws IOException
	{
		throw new IOException ("IO exception");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		readFile_problem r = new readFile_problem();
		try {
			r.readFile();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
