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
	
	public void setColor(String cl)
	{
		this.color = cl ;
		
	}
	

	public void setModel(String ml)
	{
		this.model =ml ;
		
	}
	
	
	
	
	
	public static void main(String[] args) {

		
		Car c = new Car();
		
		c.setColor("yellow");
		c.setModel("xuv");
		System.out.println(c.getColor());
		System.out.println(c.getModel());
		
	}
	

}