package JAVA_Beginner;

public class MethodMaestro {

	public class innerClass{
		
		public void square(int i)
		{
			int sqare = i * i;
			 
			System.out.println(i + " sqare is "+sqare);
			
		}
		
	}
	
	public static void main(String[] args) {
		
		MethodMaestro outer = new MethodMaestro();
		MethodMaestro.innerClass inner = outer.new innerClass();
		inner.square(10);
		
		
	}

}
