package OOP;

public class Car_p {

	String color;
	String model;

	public Car_p(String c, String m) {
		this.color = c;
		this.model = m;
	}

	public void describe() {
		System.out.println("This is a " + color + " " + model);

	}

	public static void main(String[] args) {

		Car_p c = new Car_p("White", "Audi");

		c.describe();

	}

}
