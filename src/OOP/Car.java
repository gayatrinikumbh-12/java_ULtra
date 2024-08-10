package OOP;

public class Car {


	private String color;
	private String model;
	
	

	public String get_colour()
	{
		return color  ;
		
	}
	

	public String get_model()
	{
		return model  ;
		
	}
	
	public String set_colour(String cl)
	{
		return this.color = cl ;
		
	}
	

	public String set_model(String ml)
	{
		return this.model =ml ;
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		
		Car c = new Car();
		
		c.set_colour("red");
		c.set_model("f6");
		System.out.println(c.get_colour());
		System.out.println(c.get_model());
		
		
		
	}
	

}