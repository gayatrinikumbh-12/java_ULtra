package Inher_Poly;

public interface Animal_interface {

	
	default void sound()
	{
		System.out.println("Animal sound");
	}
}
