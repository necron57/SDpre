import java.util.Scanner;
public class Objective7Lab5 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int userNum = 0;

    while (userNum <= 2) {
      System.out.println("_____Menu_____");
      System.out.println("1: Say Hello");
      System.out.println("2: List My favorite foods");
      System.out.println("3: Exit");
      System.out.println();

      userNum = kb.nextInt();

      if(userNum == 1) {
        System.out.println("Hello Human");
      }
      else if (userNum == 2) {
        System.out.println("Apples, Bananas, Coconuts");
      }
      else {
        System.out.println("Goodbye");
      }


      
    }

    kb.close();
  }
}