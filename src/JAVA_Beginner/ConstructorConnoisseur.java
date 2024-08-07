package JAVA_Beginner;

public class ConstructorConnoisseur {

	public class inside{
		
		public inside(int i)
		{
			
			System.out.println("inside parameter "+i);
		}

		
	}
	
	public static void main(String[] args) {
		//int a = 10;
		ConstructorConnoisseur outer  = new ConstructorConnoisseur();
	
		ConstructorConnoisseur.inside inner = outer.new inside(9);
				
	}

}
