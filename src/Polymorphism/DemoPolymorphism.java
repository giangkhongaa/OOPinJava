package Polymorphism;

public class DemoPolymorphism {

	public static void main(String[] args) {
		AbstractGeometry geometry_1 = new Circle("đư�?ng tròn", 5); 
		AbstractGeometry geometry_2 = new Rectangle("hình chữ nhật", 10, 6);
		AbstractGeometry geometry_3 = new Square("hình vuông", 5);
		
		System.out.println(geometry_1.calculatePerimeter()); 
		System.out.println(geometry_2.calculatePerimeter()); 
		System.out.println(geometry_3.calculatePerimeter()); 
		
		System.out.println(geometry_1.calculateArea()); 
		System.out.println(geometry_2.calculateArea()); 
		System.out.println(geometry_3.calculateArea()); 
	}

}
