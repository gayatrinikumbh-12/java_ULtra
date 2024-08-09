package OOP;

public class Car {

	
	String colour;
	String model;
	public Car(String c , String m)
	{
		this.colour = c;
		this.model = m;
	}
	
	public Car()
	{
		
	}
	public void describe()
	{
		System.out.println("This is a "+ colour +" "+model);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car("White", "Audi");
		Car c1 = new Car();
		c1.colour = "black";
		c1.model="Audi";
		//System.out.println(c1.colour+" "+c1.model);
		c.describe();
		//c1.describe();
	}

}
