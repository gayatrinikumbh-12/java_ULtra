package Advance_OOP;

public class Sparrow extends Bird {

	
	Sparrow(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	

	@Override
	void sing() {

		System.out.println("Singing...");
	}

	public static void main(String[] args) {

		Sparrow s = new Sparrow("piku");
		s.eat();
		s.sing();
		

	}

}
