package Inher_Poly;

public class Dog extends Animal{

	
	public Dog()
	{
		System.out.println("Dog constructor");
	}
	public void tryM()
	{
		eat();
	}

	
	public static void main(String[] args) {
        // Your code here
		
		Dog d = new Dog();
		
		Cat c = new Cat();
	
		System.out.println(d instanceof Dog);
		System.out.println( d instanceof Animal);
		//System.out.println(c instanceof Animal);
		//System.out.println( c instanceof Animal);
	
	
    }
	
}


