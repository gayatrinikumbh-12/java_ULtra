package OOP;

public class Rectangle {

	private double length;
	private double width;

	public double getLenght() {
		return this.length;
	}

	public double getWidth() {
		return this.width;
	}

	public void setLenght(double l) {
		this.length = l;
	}

	public void setWidth(double w) {
		this.width = w;
	}

	public double calculateArea() {

		return (this.length * this.width);
	}

	public double calculatePerimeter() {

		return (2 * (this.length + this.width));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r = new Rectangle();

		r.setLenght(70);
		r.setWidth(10);
		System.out.println("area " + r.calculateArea());

		System.out.println("perimeter " + r.calculatePerimeter());
	}

}
