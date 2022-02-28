package practiceClass.week02;

//Exercise 1.16
public class CheckEnvironmentVariables {
	public static void main(String[] args) {
		System.out.println("\nEnvironment variable PATH: ");
		System.out.println(System.getenv("PATH"));
		System.out.println("\nEnvironment variable TEMP: ");
		System.out.println(System.getenv("TEMP"));
		System.out.println("\nEnvironment variable USERNAME: ");
		System.out.println(System.getenv("USERNAME"));
	}
}
