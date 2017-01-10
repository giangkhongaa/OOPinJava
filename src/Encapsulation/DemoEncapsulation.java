package Encapsulation;

/**
 * @author Giang
 *
 */
public class DemoEncapsulation {

	public static void main(String[] args) {
		Person person = new Person();
		person.setName("Tran Truong Giang");
		person.setAge(22);
		person.setAddress("Tien Giang");
		person.setPhone("0964179975");

		System.out.println(person.getName());
		System.out.println(person.getAge());
		System.out.println(person.getAddress());
		System.out.println(person.getPhone());
	}

}


