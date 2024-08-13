package Advance_OOP;

public class Duck implements Animal_II {

	

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		System.out.println("Flying...");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Swimming...");
	}
	
	public static void main(String[] args) {
		
		Duck d = new Duck();
		d.fly();
		d.swim();

	}

}
