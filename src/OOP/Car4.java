package OOP;

public class Car4 {

	private String color;
    String model;
	protected int year;
	public double price;
	
	public void describe() {
		
		System.out.println("model"+model);
		System.out.println("year"+year);
		System.out.println("price"+price);
	}
	
	public String get_color() {
		System.out.println("color"+color);
		return color;
	}
	
	public String set_color(String clr) {
		return this.color=clr;
	}
	
	
	
	public static void main(String[] args) {

		
		Car4 c = new Car4();
		//c.color = "white";
		c.set_color("black");
		c.get_color();
		c.model ="venue";
		c.year= 2018;
		c.price = 20.23;
		c.describe();
		
		
	}
	

}
