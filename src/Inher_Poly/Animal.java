package Inher_Poly;

public class Animal {

	void sound()
	{
		System.out.println("Animal sound...");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		a.sound();
		
		Dog d = new Dog();
		
		d.sound();
		
		
		Cat c = new Cat();
		c.sound();
		
	}
	
	
}
