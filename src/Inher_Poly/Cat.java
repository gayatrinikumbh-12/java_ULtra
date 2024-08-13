package Inher_Poly;

public class Cat extends Animal {

	
	void sound()
	{
		System.out.println("Meow");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		a.sound();
		
		Animal d = new Dog();
		
		d.sound();
		
		
		Animal c = new Cat();
		c.sound();
		
	}
	
}
