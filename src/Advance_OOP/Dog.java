package Advance_OOP;

public class Dog implements Animal{

	
	public void speak() {
		
		System.out.println("Woof!");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
				d.speak();
	}

}
