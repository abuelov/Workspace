
public class Person {
		// TODO Auto-generated method stub
		private int age;
		private String name;
		
		public Person(){
			name = "Vincent";
			age = 15;
		}

		public Person(String name, int age) {
			this.age = age;
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		public String toString(){
			return String.format("%s, %d", name, age);
		}
}
