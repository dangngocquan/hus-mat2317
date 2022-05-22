package theoryClass.week14.someTest;

public class Test {
	public static void main(String[] args) {
		Teacher teacher1 = new Teacher("Bris");
		teacher1.display();
		MathTeacher teacher2 = new MathTeacher("MathTeacher");
		teacher2.display();
		Teacher teacher3 = new MathTeacher("MathTeacher");
		teacher3.display();
		System.out.println(teacher3.getClass().getSimpleName());
		
		
		
	}
}
