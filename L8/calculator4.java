package L8;

import java.util.Scanner;

public class calculator4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int choice;

    while (true) {
      System.out.println("For ADD type 1, SUBTRACT type 2, MULTIPLICATION type 3, DIVISION type 4, EXIT type 5");
      choice = sc.nextInt();

      switch (choice) {
        case 1:
          performAddition(sc);
          break;
        case 2:
          performSubtraction(sc);
          break;
        case 3:
          performMultiplication(sc);
          break;
        case 4:
          performDivision(sc);
          break;
        case 5:
          System.out.println("Exiting the calculator. Goodbye!");
          sc.close();
          return;
        default:
          System.out.println("Invalid input. Please enter a number between 1 and 5.");
          sc.nextLine(); // Clear the buffer
          break;
      }
    }
  }

  private static void performAddition(Scanner sc) {
    System.out.println("How many numbers do you want to add?");
    int n = sc.nextInt();
    float sum = 0;
    System.out.println("Enter the numbers:");
    for (int i = 0; i < n; i++) {
      sum += sc.nextFloat();
    }
    System.out.println("The sum is " + sum);
  }

  private static void performSubtraction(Scanner sc) {
    System.out.println("Enter the number of values you want to subtract:");
    int n = sc.nextInt();
    float[] numbers = new float[n];
    System.out.println("Enter the values:");
    for (int i = 0; i < n; i++) {
      numbers[i] = sc.nextFloat();
    }
    while (true) {
      System.out.println("Enter the order to subtract (e.g., 1 2 for numbers[0] - numbers[1]). Type 'finish' to end:");
      String input = sc.next();
      if (input.equalsIgnoreCase("finish")) {
        break;
      }
      int index1 = Integer.parseInt(input) - 1;
      int index2 = sc.nextInt() - 1;
      numbers[index1] -= numbers[index2];
      System.out.println("Current result: " + numbers[index1]);
    }
    System.out.println("The final subtraction result is " + numbers[0]);
  }

  private static void performMultiplication(Scanner sc) {
    System.out.println("Enter the number of values you want to multiply:");
    int n = sc.nextInt();
    float[] numbers = new float[n];
    System.out.println("Enter the values:");
    for (int i = 0; i < n; i++) {
      numbers[i] = sc.nextFloat();
    }
    while (true) {
      System.out.println("Enter the order to multiply (e.g., 1 2 for numbers[0] * numbers[1]). Type 'finish' to end:");
      String input = sc.next();
      if (input.equalsIgnoreCase("finish")) {
        break;
      }
      int index1 = Integer.parseInt(input) - 1;
      int index2 = sc.nextInt() - 1;
      numbers[index1] *= numbers[index2];
      System.out.println("Current result: " + numbers[index1]);
    }
    System.out.println("The final multiplication result is " + numbers[0]);
  }

  private static void performDivision(Scanner sc) {
    System.out.println("Enter the number of values you want to divide:");
    int n = sc.nextInt();
    float[] numbers = new float[n];
    System.out.println("Enter the values:");
    for (int i = 0; i < n; i++) {
      numbers[i] = sc.nextFloat();
    }
    while (true) {
      System.out.println("Enter the order to divide (e.g., 1 2 for numbers[0] / numbers[1]). Type 'finish' to end:");
      String input = sc.next();
      if (input.equalsIgnoreCase("finish")) {
        break;
      }
      int index1 = Integer.parseInt(input) - 1;
      int index2 = sc.nextInt() - 1;
      if (numbers[index2] == 0) {
        System.out.println("Error: Division by zero is not allowed. Try again.");
        continue;
      }
      numbers[index1] /= numbers[index2];
      System.out.println("Current result: " + numbers[index1]);
    }
    System.out.println("The final division result is " + numbers[0]);
  }
}
