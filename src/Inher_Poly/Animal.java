package Inher_Poly;

public class Animal {

	void sound()
	{
		System.out.println("Animal sound...");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a[] = {new Dog(), new Cat()};
		
		for(Animal g:a)
		{
			g.sound();
		}
		
		
	}
	
	
}
