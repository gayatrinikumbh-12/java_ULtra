package Control_structures;

public class WhileLoopWizard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 , num2, next_num, n;
		num1=0;
		num2=1;
		
		n=1;
		System.out.println(num1);
		
		System.out.println(num2);
		while(n<=8)
		{
			next_num= num1+num2;
			System.out.println(next_num);
			n++;
			num1=num2;
			num2=next_num;
			
			
		}
	}

}
