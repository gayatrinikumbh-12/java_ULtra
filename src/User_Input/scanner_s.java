package User_Input;

import java.util.Scanner;

public class scanner_s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter string");
		
		String a = sc.nextLine();
		
		System.out.println("Entered string "+a);
		
		String[] b = a.split(" ");
		
		for(String f :b)
		{
			System.out.println(f);
		}
		
		
	}

}
