package Polymorphism;

public abstract class AbstractGeometry {
	private String name; // name of shape

	public AbstractGeometry(String name) {
		this.name = name;
	}

	public abstract double calculatePerimeter();// tính chu vi của hình h�?c

	public abstract double calculateArea();// Tính diện tích của hình h�?c
}
