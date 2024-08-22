package Inher_Poly;

public class Dog implements Animal{

	
	public Dog()
	{
		System.out.println("Dog constructor");
	}
	
	
	


	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("Woof");
	}
	
	public static void main(String[] args) {
        // Your code here
		
		Dog d = new Dog();
		Cat c = new Cat();
		d.sound();
		c.sound();

		
		
		
		
	
    }
	
}


