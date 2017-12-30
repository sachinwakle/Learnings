package Experiments.PolymorphicCollection;

class Animal {
	void eat()
	{
		System.out.println("Animal eat");
	}
}

class Dog extends Animal
{
	void bark()
	{
		System.out.println("Dog barks");
	}
	
	@Override
	void eat() {
		System.out.println("Dog eat");
	}
}

class Cat extends Animal
{
	void meaw()
	{
		System.out.println("Cat meaw");
	}
	
	@Override
	void eat() {
		System.out.println("Cat eat");
	}
}
