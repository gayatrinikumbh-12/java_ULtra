package Exception_handling;

public class shutDown_hook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runtime.getRuntime().addShutdownHook(new Thread() {
            public void run() {
                System.out.println("Goodbye!");
            }
        });
		
		System.exit(0);
	}

}
