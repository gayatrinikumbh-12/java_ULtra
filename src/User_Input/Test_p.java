package User_Input;

public class Test_p {

	
	static int a ;
	int b ;
	

	public int show(int i )
	{
		int c;
		c = i;
		//System.out.println(c);
		return c;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d ;
		
		Test_p t = new Test_p();
		Test_p t2 = new Test_p();
		System.out.println("a "+t.a + "-a" +t2.a);
		System.out.println("b "+t.b+"-b"+t2.b);
		t.a = 5;
		t.b = 10;
		System.out.println("a "+t.a + "-a" +t2.a);
		System.out.println("b "+t.b+"-b"+t2.b);
		/*
		Test_p t2 = new Test_p();
		d= t.show(8);
		System.out.println("a "+a);
		System.out.println("b "+t.b);
		
		System.out.println("d "+d);
		*/
	}

}
