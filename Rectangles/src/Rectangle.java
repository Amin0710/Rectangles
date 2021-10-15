
// Rectangle class
public class Rectangle implements Comparable<Rectangle> {

	// variable declaration
	private float length;
	private float width;
	private float area;

	// default constructor
	public Rectangle() {
	}

	// parameterized constructor with area calculation
	public Rectangle(float length, float width) {
		this.length = length;
		this.width = width;
		calculateArea();
	}

	// gettters and setters
	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public float getArea() {
		return area;
	}

	public void setArea(float area) {
		this.area = area;
	}

	// method to calculate area
	public void calculateArea() {
		this.area = this.length * this.width;
	}

	// to string method
	@Override
	public String toString() {
		return "Length: " + String.format("%.2f", length) + "cm, Width:" + String.format("%.2f", width) + "cm, Area:"
				+ String.format("%.2f", area) + "cm";
	}

	// compare to method
	@Override
	public int compareTo(Rectangle rectangle) {
		// based on value of area
		if (this.area == rectangle.area)
			return 0;
		else if (this.area > rectangle.area)
			return 1;
		else
			return -1;
	}

}
