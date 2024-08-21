package Inher_Poly;

public abstract class Animal_I {

	abstract void sound();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal_I a[] = {new Dog(), new Cat()};
		
		for(Animal_I g:a)
		{
			g.sound();
		}
		
		
	}
	
	
}
