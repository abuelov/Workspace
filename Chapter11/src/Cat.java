
public class Cat extends Animal {

	public Cat(){
		super("Milk");
	}
	
	public Cat(String name){
		super(name);
	}

	@Override
	public String getSound() {
		return "Meow";
	}
}
