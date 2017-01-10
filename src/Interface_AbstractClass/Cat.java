package Interface_AbstractClass;

public class Cat extends AbstractAnimal implements ISwimable {

	// ham khoi tao duoc ke thua tu abstract class
	public Cat(String name) {
		super(name, "meo meo");

	}

	// ham trien khai cho interface
	@Override
	public void swim() {
		System.out.println("My Name is " + name + " - " + "I cann't swim!!!");

	}

}
