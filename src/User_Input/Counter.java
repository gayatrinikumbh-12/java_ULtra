package User_Input;

public class Counter {
	
	static int count = 0;
	public Counter()
	{
		
		System.out.println(count);
		count++;
	}
	public static void main(String[] args) {
		
		Counter cv = new Counter();
		Counter cv1 = new Counter();
		Counter cv2= new Counter();
		Counter cv3 = new Counter();
		
		System.out.println(count);
	}

}
