package OOP;

public class Car {


	private String color;
	private String model;
	
	

	public String getColor()
	{
		return color  ;
		
	}
	

	public String getModel()
	{
		return model  ;
		
	}
	
	public String setColor(String cl)
	{
		return this.color = cl ;
		
	}
	

	public String setModel(String ml)
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