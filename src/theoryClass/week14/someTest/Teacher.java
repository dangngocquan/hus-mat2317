package theoryClass.week14.someTest;

public class Teacher implements Human {
	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Teacher(String name) {
		this.name = name;
	}
	
	public void display() {
		System.out.println("I am a teacher");
	}

}
