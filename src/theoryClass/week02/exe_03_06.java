package theoryClass.week02;

import java.util.Calendar;
import java.util.Scanner;

public class exe_03_06 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Tuổi của bạn hiện tại là? ");
		int age1 = Integer.parseInt(scanner.next());
		System.out.print("Tuổi bạn mong muốn nghỉ hưu? ");
		int age2 = Integer.parseInt(scanner.next());
		System.out.println("Bạn còn " + (age2 - age1) + " nữa làm việc cho đến khi nghỉ hưu.");
		int year = Calendar.getInstance().get(Calendar.YEAR);
		System.out.println("Năm nay là năm " + year + ", và bạn sẽ nghỉ hưu vào năm " + (year + age2 - age1));
		scanner.close();
	}
}
