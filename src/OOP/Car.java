package OOP;

public class Car {

	private String color;
	private String model;

	public Car(String c, String m) {
		this.color = c;
		this.model = m;
	}
	
	public Car() {
		
	}

	public String get_colour()
	{
		return color  ;
		
	}
	
	
	public String set_colour(String color)
	{
		return this.color= color ;
		
	}
	
	public String get_model()
	{
		return model  ;
		
	}
	
	
	public String set_model(String model)
	{
		return this.model= model ;
		
	}
	
	/*
	public void describe() {
		System.out.println("This is a " + color + " " + model);

	}
	*/

	public static void main(String[] args) {

		//Car c = new Car("White", "Audi");
		Car c = new Car();
		
		c.set_colour("parraot");
		c.get_colour();
		System.out.println(c.set_colour("parraot"));
		System.out.println(c.get_colour());
		
		System.out.println(c.set_model("skada"));
		System.out.println(c.get_model());
	}
	

}
