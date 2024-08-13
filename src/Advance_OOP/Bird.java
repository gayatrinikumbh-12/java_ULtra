package Advance_OOP;

public abstract class Bird {
	
	abstract void sing();
	
	void eat()
	{
		System.out.println("Eating...");
	}
	
	Bird(String name)
	{
		System.out.println("name "+ name);
	}
	

}
