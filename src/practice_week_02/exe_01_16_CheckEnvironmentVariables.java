package practice_week_02;

public class exe_01_16_CheckEnvironmentVariables {
	public static void main(String[] args) {
		System.out.println("\nEnvironment variable PATH: ");
		System.out.println(System.getenv("PATH"));
		System.out.println("\nEnvironment variable TEMP: ");
		System.out.println(System.getenv("TEMP"));
		System.out.println("\nEnvironment variable USERNAME: ");
		System.out.println(System.getenv("USERNAME"));
	}
}
