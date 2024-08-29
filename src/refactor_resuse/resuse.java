package refactor_resuse;

public class resuse {
	
	double area(double r )
	{
		double radius;
		radius = r;
		double area = Math.PI * radius * radius;
		System.out.println("Area: " + area);
		return area;
	}
	
	double circumference(double r )
	{
		double radius;
		radius = r;
		double circumference = Math.PI * radius * radius;
		System.out.println("Circumference: " + circumference);
		return circumference;
	}
	
    public static void main(String[] args) {
        double radius = 5.0; 
        
        resuse r = new resuse();
        r.area(radius);
        r.circumference(radius);
       
    }
    
    
    
}