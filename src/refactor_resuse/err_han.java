package refactor_resuse;

import java.util.Scanner;

public class err_han {

	public static void main(String[] args) {
		

		
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num;
		try {
			num = scanner.nextInt();
			  System.out.println("You entered: " + num);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
      
	}

}
