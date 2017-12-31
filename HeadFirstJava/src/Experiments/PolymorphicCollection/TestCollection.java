package Experiments.PolymorphicCollection;

import java.util.ArrayList;
import java.util.List;

public class TestCollection {

	public static void main(String[] args) {

		ArrayList<Animal> ani = new ArrayList<Animal>();
		ani.add(new Animal());
		ani.add(new Dog());
		ani.add(new Cat());
		
		ArrayList<Dog> dogList = new ArrayList<Dog>();
		dogList.add(new Dog());
		dogList.add(new Dog());
		dogList.add(new Dog());
		
		
		
		TestCollection tc = new TestCollection();
		tc.takeAnimal(dogList);
		tc.anotherTakeAnimal(ani);
	}
	
	<T extends Animal> void takeAnimal(ArrayList<T> animals)
	{
		animals.add( (T) new Cat());
		for(Animal animal : animals)
		{
			animal.eat();
		}
	}
	
	void anotherTakeAnimal(ArrayList<? extends Animal> animals)
	{
		for(Animal animal : animals)
		{
			animal.eat();
		}
	}

}
