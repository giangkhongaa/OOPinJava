package Interface_AbstractClass;

import java.util.ArrayList;
import java.util.List;

public class DemoInterface_AbstractClass {

	public static void main(String[] args) {
		List<AbstractAnimal> animalsArray = new ArrayList<AbstractAnimal>();// create list animal

		animalsArray.add(new Cat("Tom")); // add animal reference to Cat
		animalsArray.add(new Dog("Jack"));// add animal reference to Dog

        for(int i =0; i<animalsArray.size(); i++)
        {
        	AbstractAnimal animal= (AbstractAnimal)animalsArray.get(i); // ep kieu ve AbstractAnimal
        	animal.makeSound(); // execute makeSound
        	if (animal instanceof ISwimable) // check object to inherit of interface ISwinable
            {
                ((ISwimable)animal).swim();  // execute swim
            }
        }

	}

}
