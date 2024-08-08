package JAVA_Beginner;

public class ClassCreator {

	
	public class innerworld {
		
		public void hello()
		{
			System.out.println("Hello from the inner class!");
		}
		
	}
	public static void main(String[] args) {
		
		
		ClassCreator outer = new ClassCreator();
		
		ClassCreator.innerworld inner = outer.new innerworld();
		
		
			inner.hello();	
	}

}
