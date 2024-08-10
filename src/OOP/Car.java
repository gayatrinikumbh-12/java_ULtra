package OOP;

public class Car {

	private String color;
    String model;
	protected int year;
	public double price;
	
	public void describe() {
		System.out.println("color"+color);
		System.out.println("model"+model);
		System.out.println("year"+year);
		System.out.println("price"+price);
	}
	

	public static void main(String[] args) {

		
		Car c = new Car();
		c.color = "white";
		c.model ="venue";
		c.year= 2018;
		c.price = 20.23;
		c.describe();
		
		
	}
	

}
