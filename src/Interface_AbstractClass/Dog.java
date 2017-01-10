package Interface_AbstractClass;

public class Dog extends AbstractAnimal implements ISwimable {

	// ham khoi tao duoc ke thua tu abstract class
	public Dog(String name) {
		super(name, "gau gau");
	}

	// ham trien khai cho interface
	@Override
	public void swim() {
		System.out.println("My Name is " + name + " - " + "I can swim!!!");

	}

}
