/*problem 54: write a java program to create an abstract class Animal
 *  with an abstract method called sound(). create subclasses 
 *  Lion and Tiger that extend the Animal class and implement 
 *  the sound() method to make a specific sound for each animal.*/
package Problem_54;

abstract class Animal {
 public abstract void sound();
}

//Subclass Lion
class Lion extends Animal {
 // override
 public void sound() {
     System.out.println("Lion roooaaars!!!");
 }
}

//Subclass Tiger
class Tiger extends Animal {
 //override
 public void sound() {
     System.out.println("Tiger grooowls!!!");
 }
}

public class Main {

	public static void main(String[] args) {
		// instance
		Lion lion = new Lion();
        Tiger tiger = new Tiger();
        //OtherSpecies cat = new OtherSpecies();
        //Dog dog = new Dog();
        
        //call sound() method
        lion.sound();
        tiger.sound();
        //cat.sound();
        //dog.sound();

	}

}