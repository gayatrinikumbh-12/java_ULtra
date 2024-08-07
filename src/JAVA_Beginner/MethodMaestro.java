package JAVA_Beginner;

public class MethodMaestro {

	public class innerClass{
		
		public int square(int i)
		{
			int sqare = i * i;
			 
			System.out.println(i + " sqare is "+sqare);
			
			return sqare;
		}
		
	}
	
	public static void main(String[] args) {
		
		MethodMaestro outer = new MethodMaestro();
		MethodMaestro.innerClass inner = outer.new innerClass();
		inner.square(10);
		
		
	}

}
