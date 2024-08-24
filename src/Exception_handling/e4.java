package Exception_handling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class e4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
               
               try
               {
            	   FileWriter fw = new FileWriter("log.txt");
            	   fw.write("jvm shutdown unexpecdlly ");
               }
               catch(IOException e)
               {
            	   e.printStackTrace();
               }
		
                
                
		}
		});
		
		System.exit(0);
	}
}


	
	



