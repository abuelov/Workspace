
public class Student extends Person{
	
	private int id , gradeLvl;
	
	public Student(){
		super("Default", 13);
		id = 00001;
		gradeLvl = 1;
	}
	
	public Student(String name, int age, int id, int gradeLvl){
		super(name, age);
		this.id = id;
		this.gradeLvl = gradeLvl;
	}
	
	public String toString(){
		return "Student: " + getName() + ", Grade: " + gradeLvl;
	}
}
