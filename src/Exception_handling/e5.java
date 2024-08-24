package Exception_handling;

import java.io.FileInputStream;
import java.io.FileReader;

public class e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 try( FileInputStream input = new FileInputStream("C:\\Users\\gnikumbh\\Downloads\\input.txt"))
		 {
			 FileReader r = new  FileReader("C:\\\\Users\\\\gnikumbh\\\\Downloads\\\\input.txt");
			int s= r.read();
			//r.read(null)
			 System.out.println(s);
		 }
		catch(Exception e)
		 {
			e.printStackTrace();
		 }
	}

}
