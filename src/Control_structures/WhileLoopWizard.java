package Control_structures;

import java.util.ArrayList;

public class WhileLoopWizard {

	public static void main(String[] args) {
		
		int num1 , num2, next_num, n;
		num1=0;
		num2=1;
		
		n=1;
		
		ArrayList <Integer> a = new  <Integer> ArrayList();
		
		
	
		while(n<=8)
		{
			next_num= num1+num2;
			a.add(next_num);
			//System.out.println(next_num);
			n++;
			num1=num2;
			num2=next_num;
			
			
		}
		
		//Object[] b_arr=a.toArray();
		
		for(int i = a.size()-1; i>0;i--)
		{
			System.out.println(a.get(i));
		}
		System.out.println(1);
		System.out.println(0);
		
	}

}
