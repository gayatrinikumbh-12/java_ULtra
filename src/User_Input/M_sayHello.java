package User_Input;

public class M_sayHello {

	public static void main(String[] args) {
		
		System.out.println(sayHello("Piku"));
		
		
		
		
	}

	
	
	static String sayHello(String name)
	{
		String greetings;
		
		greetings = "hello " + name;
		
		return greetings;
	}

}
