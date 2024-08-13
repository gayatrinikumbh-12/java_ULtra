package Advance_OOP;

public interface Animal {

	
	
	default void eat()
	{
		
		System.out.println("Eating..");
	}
	
	void speak();
}
