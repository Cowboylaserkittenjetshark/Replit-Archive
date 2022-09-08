import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("\033[H\033[2J"); // Clear console
    System.out.print("Enter the word to be guessed: ");
    String solution = "";
    while(solution.equals("")) {
      solution = scan.nextLine().toUpperCase();
      if(solution.length() != 5) {
        solution = "";System.out.print(String.format("\033[%dA",1)); // Move up
        System.out.print("\033[2K"); // Erase line content
        System.out.print("Enter the word to be guessed: ");
      }
    }
    System.out.println("\033[H\033[2J"); // Clear console
    System.out.println("Uppercase = correct, Lowercase = wrong spot, * = incorrect");
    for(int i = 0; i < 6; i++) {
      String guess = "";
      while(guess.equals("")) {
        guess = scan.nextLine().toUpperCase();
        if(guess.length() != 5) {
        guess = "";
        System.out.print(String.format("\033[%dA",1)); // Move up
        System.out.print("\033[2K"); // Erase line content
        }
      }
      Boolean pass = true;
      for(int j = 0; j < 5; j++) {
        if(solution.charAt(j) == guess.charAt(j)) {
          System.out.print("\033[92;1m" + solution.charAt(j) + "\033[0m");
        }
        else if(solution.indexOf(guess.charAt(j)) != -1) {
          System.out.print("\033[38;5;11m" + guess.substring(j,j+1).toLowerCase() + "\033[0m");
          pass = false;
        }
        else {
          System.out.print("\033[31;1m*\033[0m");
          pass = false;
        }
        }
      System.out.println();
      if(!pass && i==5) {
        System.out.println("You did not guess the word");
      }
      else if(pass) {
        System.out.println("You guessed the word");
        break;
      }
      }
    }
  }
// https://stackoverflow.com/a/22083329 ANSI Line clear
// https://stackoverflow.com/a/33206814 ANSI Colors