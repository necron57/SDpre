import java.util.Scanner;

public class Objective9Lab3 {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    int selection = 0;


    while(selection <= 2){
    	printMenu();
    	selection = kb.nextInt();
    	if(selection == 1){
    		System.out.println("Hello Human");
    	}
    	else if(selection == 2){
    		System.out.println("Apples, Bananas, Coconuts");
    	}
    	else {
    		System.out.println("Goodbye");
    	}

      
      
    }

    kb.close();

  }

  public static void printMenu() {
    System.out.println("_____Menu_____");
    System.out.println("1: Say Hello");
    System.out.println("2: List My favorite foods");
    System.out.println("3: Exit");
    System.out.println();
  }
}