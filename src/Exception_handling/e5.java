package Exception_handling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class e5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 try( FileReader r = new FileReader("C:\\Users\\gnikumbh\\Downloads\\input.txt"))
		 {
			 BufferedReader b = new BufferedReader(r);
			 String str = b.readLine();
			 Stream<String> allLine = b.lines();
			 for(int i=0;i<allLine.count();i++)
			 {
				 System.out.println(allLine.l);
			 }
			 
			 
			 
			 //FileReader r = new  FileReader("C:\\\\Users\\\\gnikumbh\\\\Downloads\\\\input.txt");
			//int s= r.read();
			//r.read(null)
			 System.out.println(str);
		 }
		catch(IOException e)
		 {
			e.printStackTrace();
			
		 }
	}

}
