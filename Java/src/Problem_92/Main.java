/*problem 92: write a java program to create a base class Animal 
with methods eat() and sound(). create a three subclasses:
	Lion, Tiger and Panther. override the eat() method in each 
	subclass to describe what each animal eats. in addition, 
	override the sound() method to make a specific sound for 
	each animal.*/
package Problem_92;

//Base class Animal
class Animal {
 // Method eat()
 public void eat() {
     System.out.println("Animal eats something.");
 }

 // Method sound()
 public void sound() {
     System.out.println("Animal makes a sound.");
 }
}

	//Subclass Lion
	class Lion extends Animal {
		// Override
	    public void eat() {
	        System.out.println("Lion eats birds, buffalo and giraffes.");
	    }
	    // override
	    public void sound() {
	    	System.out.println("Lion roooaaars!!!");
	    }
	}

	//Subclass Tiger
	class Tiger extends Animal {
		// Override
	    public void eat() {
	        System.out.println("Tiger eats crocodile, monkeys and leopards.");
	    }
	    //override
	    public void sound() {
	    	System.out.println("Tiger grooowls!!!");
	    }
	}
	
	//Subclass Panther
	class Panther extends Animal {
		// Override
	    public void eat() {
	        System.out.println("Panther eats deer, goats and sheep!!");
	        }
	    //override
	        public void sound() {
	        	System.out.println("Panther Meeooooorrww!!!");
	        }		
	}

public class Main {
	public static void main(String[] args) {
		// instance of lion, tiger and panther
		Lion lion = new Lion();
		Tiger tiger = new Tiger();		
		Panther panther = new Panther();
		
		//call eat() and sound() method
		System.out.println("Lion:");
        lion.eat();    
		lion.sound();
		
		System.out.println("\nTiger:");
        tiger.eat();
        tiger.sound();
        
        System.out.println("\nPanther:");
        panther.eat();
		panther.sound();

	}

}
