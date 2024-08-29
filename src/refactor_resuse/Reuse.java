package refactor_resuse;

public class Reuse {

	double area(double radius) {

		double area = Math.PI * radius * radius;

		return area;
	}

	double circumference(double radius) {

		double circumference = 2 * Math.PI * radius;

		return circumference;
	}

	public static void main(String[] args) {
		double radius = 5.0;

		Reuse r = new Reuse();

		System.out.println("Area: " + r.area(radius));

		System.out.println("Circumference: " + r.circumference(radius));

	}

}