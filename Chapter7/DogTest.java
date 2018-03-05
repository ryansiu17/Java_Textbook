// ****************************************************************
// DogTest.java
//
// A simple test class that creates a Dog and makes it speak.
//          
// ****************************************************************

public class DogTest
{
    public static void main(String[] args)
    {
	Dog dog = new Dog("Spike");
	System.out.println(dog.getName() + " says " + dog.speak());

	Labrador dog2 = new Labrador("Fluffy", "red");
	System.out.println(dog2.getName() + " says " + dog2.speak());
	
	Yorkshire dog3 = new Yorkshire("Bool");
	System.out.println(dog3.getName() + " says " + dog3.speak());	
	
	
	dog2.avgBreedWeight(); 
	dog3.avgBreedWeight();
    }
}

