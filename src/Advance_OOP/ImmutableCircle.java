package Advance_OOP;

public final class ImmutableCircle {

	final double radius;
	
	ImmutableCircle(double r)
	{
		this.radius = r;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ImmutableCircle ic = new ImmutableCircle(8);
		
		System.out.println("radius "+ic.radius);
	}

}
