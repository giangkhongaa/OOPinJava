package Polymorphism;

public class Circle extends AbstractGeometry {

	private float r; // bán kính của hình tròn

	public float getR() {
		return r;
	}

	public void setR(float r) {
		this.r = r;
	}

	// Hàm khởi tạo hình tròn
	public Circle(String name, float r) {
		super(name);
		this.r = r;
	}

	// Tính chu vi đư�?ng tròn
	// Công thức : r * 2 * pi.
	@Override
	public double calculatePerimeter() {

		return r * 2 * Math.PI;
	}

	// tính diện tích đư�?ng tròn
	// công thức : r * r * pi.
	@Override
	public double calculateArea() {

		return r * r * Math.PI;
	}

}
