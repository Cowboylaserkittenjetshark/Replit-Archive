import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("How many gallons are in the tank: ");
    double gallons = scan.nextDouble();
    System.out.print("What is your fuel effeciency (miles per gallon): ");
    double milesPerGallon = scan.nextDouble();
    System.out.print("What is the price of gas per gallon: ");
    double gasPrice = scan.nextDouble();
    System.out.println("The price per 100 miles is " + ((100 / milesPerGallon) * gasPrice));
    System.out.println("You can go " + (gallons * milesPerGallon) + " miles with the gas you have.");
  }
}