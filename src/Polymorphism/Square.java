package Polymorphism;

public class Square extends AbstractGeometry {

	private int width;// cạnh hình vuông

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	/*
	 * Hàm khởi tạo của hình vuông 
	 * Tham số là name, width
	 * 
	 */
	public Square(String name, int width) {
		super(name);
		this.width = width;
	}

	/*
	 * Tính chu vi của hình vuông 
	 * Công thức: 4 * cạnh
	 * 
	 */
	@Override
	public double calculatePerimeter() {

		return 4 * width;
	}

	/*
	 * Tính diện tích của hình vuông
	 * Công thức: cạnh * cạnh
	 * 
	 */
	@Override
	public double calculateArea() {

		return width * width;
	}

}
