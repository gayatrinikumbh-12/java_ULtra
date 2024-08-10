package OOP;

public class Car {

	String color;
	String model;

	public Car(String c, String m) {
		this.color = c;
		this.model = m;
	}

	public void describe() {
		System.out.println("This is a " + color + " " + model);

	}

	public static void main(String[] args) {

		Car c = new Car("White", "Audi");

		c.describe();

	}

}
