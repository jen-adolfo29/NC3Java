package Problem_54;

public class OtherSpecies extends Animal {
	public void sound() {
	     System.out.println("Meooow!!!");
	 	}
}
//Subclass Dog
class Dog extends Animal {
//override
public void sound() {
   System.out.println("Wooof Woooof!!!");
}
}