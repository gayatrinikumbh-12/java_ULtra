package Inher_Poly;

public class Dog implements Carnivore, Pet{

	
	
	
	

	@Override
	public void name() {
		// TODO Auto-generated method stub
		System.out.println("Dog");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating meat");
	}
	
	public static void main(String[] args) {
        // Your code here
		
		Dog d = new Dog();
		
		
		d.eat();
		d.name();
		
	
    }
	
}


