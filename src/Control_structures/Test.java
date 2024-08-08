package Control_structures;

public class Test {

	int x = 14;
	public void show()
	{
		int x = 8;
		System.out.println("instance "+this.x);
		System.out.println("local "+x);
	}
	public static void main(String[] args) {
		
		Test t = new Test();
		t.show();
		
	}

}
