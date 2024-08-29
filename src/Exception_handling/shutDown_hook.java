package Exception_handling;

import java.io.File;

public class shutDown_hook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Goodbye!");

        		File f  = new File("C:\\Users\\gnikumbh\\Downloads\\temp.txt");
        		f.delete();
        		  System.out.println("Goodbye!");
            }
        });
		
		
		
		System.exit(0);
	}

}
