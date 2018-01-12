
public class Squirrel extends Animal implements Endangered{

	public Squirrel(String name){
		super(name);
		
		
	}

	@Override
	public String getSound() {
		return "Snickering-noise";
	}

	@Override
	public void survive() {
		System.out.println("I will survive");
		
	}
}

