package Interface_AbstractClass;

public abstract class AbstractAnimal {
	protected String name;
	protected String sound;

	public AbstractAnimal(String name, String sound) {
		this.name = name;
		this.sound = sound;
	}

	public void makeSound() {
		System.out.println("My Name is " + name + " - " + sound);
	}
}
