
public class Zoo {

	public static void main(String[] args){
		
		Animal a1 = new Cat("Bessie");
		a1.eat();
		a1.sleep();
		
		Cat c1 = new Cat();
		c1.eat();
		c1.sleep();
		c1.speak();
		
		Squirrel s1 = new Squirrel();
		s1.eat();
		s1.sleep();
		s1.speak();
	}
}
