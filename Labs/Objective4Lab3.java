import java.util.Scanner;

public class Objective4Lab3 {
	public static void main(String[] args) {
		int birthYear, age, currentYear;

		birthYear = 0;
		currentYear = 2023;

		Scanner input = new Scanner(System.in);
		System.out.println("How old are you?");
		int birth = input.nextInt();
		int by = currentYear - birth;


		System.out.println("You were born in " + by);
		input.close();

	}
}