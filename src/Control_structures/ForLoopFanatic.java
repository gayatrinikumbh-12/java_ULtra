package Control_structures;

public class ForLoopFanatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1 , num2 ,  next_num;
		num1=0;
		num2=1;
	
		System.out.println(num1);

		System.out.println(num2);
		
		
		for(int i=1;i<=8;i++)
		{
		
			
			next_num = num1 + num2;
			 System.out.println(next_num);
			
			 num1=num2;	
			 num2=next_num;
			
		}
		
	}

}
