
public class Squirrel extends Animal {

	public Squirrel(){
		super("Nuts");
	}
	
	public Squirrel(String name){
		super(name);
	}

	@Override
	public String getSound() {
		return "Clicking-noises*";
	}
}


