package Advance_OOP;

public class Sparrow extends Bird implements Flyable {

	

	@Override
	void sing() {
		
		System.out.println("Singing...");
	}
	
	

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flying...");
	}
	
	
	public static void main(String[] args) {
	      
		Sparrow s = new Sparrow();
		s.eat();
		s.sing();
		s.fly();

	}

}
