package OOP;

public class Car {

	private String color;
	private String model;

	public Car() {
		this.color = "White";
		this.model = "Sedan";
	}

	public Car(String c, String m) {
		this.color = c;
		this.model = m;
	}

	public static void main(String[] args) {

		Car c = new Car();
		Car c1 = new Car("black", "ME");

		System.out.println(c.color + " " + c.model);
		System.out.println(c1.color + "  " + c1.model);

	}

}