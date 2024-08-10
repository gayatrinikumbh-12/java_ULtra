package OOP;

public class Car3 {

	private String color;
    String model;
	protected String year;
	public double price;

	public Car3(String c, String m) {
		this.color = c;
		this.model = m;
	}
	
	public Car3() {
		
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
		Car3 c = new Car3();
		
		c.set_colour("parraot");
		c.get_colour();
		System.out.println(c.set_colour("parraot"));
		System.out.println(c.get_colour());
		
		System.out.println(c.set_model("skada"));
		System.out.println(c.get_model());
	}
	

}
