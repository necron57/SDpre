import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;

    System.out.println("Please enter the first whole number you would like to add.");
    int numb1 = keyboard.nextInt();

    System.out.println("Please enter the second whole number you would like to add.");
    int numb2 = keyboard.nextInt();

    System.out.println("Please enter the third whole number you would like to add.");
    int numb3 = keyboard.nextInt();

    System.out.println("Please enter the first decimal number you would like to add.");
    double dubl1 = keyboard.nextDouble();

    System.out.println("Please enter the second decimal number you would like to add.");
    double dubl2 = keyboard.nextDouble();

    System.out.println("Please enter the third decimal number you would	like to add.");
    double dubl3 = keyboard.nextDouble();

    

    System.out.println("The sum of " + numb1 + "+" + numb2 + "+" + numb3 + "="); System.out.println(numb1 + numb2 + numb3);
    System.out.println("The sum of " + dubl1 + "+" + dubl2 + "+" + dubl3 + "="); System.out.println(dubl1 + dubl2 + dubl3);

    

  }
}
