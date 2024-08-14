package Inher_Poly;

public abstract class Animal {

	abstract void sound();
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a[] = {new Dog(), new Cat()};
		
		for(Animal g:a)
		{
			g.sound();
		}
		
		
	}
	
	
}
