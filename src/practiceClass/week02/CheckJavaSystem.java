package practiceClass.week02;

//Exercise 1.17
public class CheckJavaSystem {
	public static void main(String[] args) {
		System.out.println("\nJava Version: " + System.getProperty("java.version"));
		System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
		System.out.println("Java Home: " + System.getProperty("java.home"));
		System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
		System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
		System.out.println("Java Class Path: " + System.getProperty("java.class.path") + "\n");
	}
}
