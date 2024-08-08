package User_Input;

public class Test {

	
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
		
		Test t = new Test();
		t.a = 5;
		t.b = 10;
		d= t.show(8);
		System.out.println("a "+a);
		System.out.println("b "+t.b);
		
		System.out.println("d "+d);
	}

}
