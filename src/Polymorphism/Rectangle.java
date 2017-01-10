package Polymorphism;

public class Rectangle extends AbstractGeometry {

	private int width; // chi�?u dài của hình chữ nhật
	private int height; // chi�?u cao của hình chữ nhật

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	/*
	 * hàm khởi tạo của hình chữ nhật 
	 * tham số là name, width, height
	 * 
	 */
	public Rectangle(String name, int width, int height) {
		super(name);
		this.width = width;
		this.height = height;
	}

	/*
	 * Tính chu vi của hình chữ nhật 
	 * công thức: (chi�?u dài +chi�?u rộng) *2;
	 * 
	 */
	@Override
	public double calculatePerimeter() {

		return (width + height) * 2;
	}

	/*
	 * Tính diện tích của hình chữ nhật
	 * công thức: chi�?u dài *chi�?u rộng
	 * 
	 */
	@Override
	public double calculateArea() {

		return width * height;
	}

}
