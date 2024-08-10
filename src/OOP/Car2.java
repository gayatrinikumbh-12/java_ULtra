package OOP;

public class Car2 {

	
	String color;
	String model;
	
	public Car2(String c , String m)
	{
		this.color = c;
		this.model = m;
	}
	
	public Car2()
	{
		
	}
	public void describe()
	{
		System.out.println("This is a "+ color +" "+model);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car2 c = new Car2("White", "Audi");
		Car2 c1 = new Car2();
		c1.color = "black";
		c1.model="Audi";
		//System.out.println(c1.colour+" "+c1.model);
		c.describe();
		//c1.describe();
	}

}
