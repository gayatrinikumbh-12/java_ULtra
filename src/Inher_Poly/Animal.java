package Inher_Poly;

public interface Animal {

	
	default void sound()
	{
		System.out.println("Animal sound");
	}
}
