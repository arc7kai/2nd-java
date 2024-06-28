package L8;

import java.util.Scanner;

public class calculator3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num;

    while (true) {
      System.out.println("For ADD type 1, SUBTRACT type 2, MULTIPLICATION type 3, DIVISION type 4, EXIT type 5");
      num = sc.nextInt();

      switch (num) {
        case 1:
          System.out.println("How Many Numbers You want to add");
          int n = sc.nextInt();
          int[] array = new int[n];
          System.out.println("Now Enter The Numbers");
          for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
          }
          int add = 0;
          for (int i = 0; i < n; i++) {
            add += array[i];
          }
          System.out.println("The Sum is " + add);
          break;

        case 2:
          System.out.println("Enter the number of values you want to subtract:");
          int subN = sc.nextInt();
          int[] subArray = new int[subN];
          System.out.println("Enter the values:");
          for (int i = 0; i < subN; i++) {
            subArray[i] = sc.nextInt();
          }
          while (true) {
            System.out.println(
                "Enter the order to subtract (e.g., 1 2 for subArray[0] - subArray[1]). Type 'finish' to end:");
            String input = sc.next();
            if (input.equalsIgnoreCase("finish")) {
              break;
            }
            int index1 = Integer.parseInt(input) - 1;
            int index2 = sc.nextInt() - 1;
            subArray[index1] -= subArray[index2];
            System.out.println("Current result: " + subArray[index1]);
          }
          System.out.println("The final Subtraction result is " + subArray[0]);
          break;

        case 3:
          System.out.println("Enter the number of values you want to multiply:");
          int mulN = sc.nextInt();
          int[] mulArray = new int[mulN];
          System.out.println("Enter the values:");
          for (int i = 0; i < mulN; i++) {
            mulArray[i] = sc.nextInt();
          }
          while (true) {
            System.out.println(
                "Enter the order to multiply (e.g., 1 2 for mulArray[0] * mulArray[1]). Type 'finish' to end:");
            String input = sc.next();
            if (input.equalsIgnoreCase("finish")) {
              break;
            }
            int index1 = Integer.parseInt(input) - 1;
            int index2 = sc.nextInt() - 1;
            mulArray[index1] *= mulArray[index2];
            System.out.println("Current result: " + mulArray[index1]);
          }
          System.out.println("The final Multiplication result is " + mulArray[0]);
          break;

        case 4:
          System.out.println("Enter the number of values you want to divide:");
          int divN = sc.nextInt();
          int[] divArray = new int[divN];
          System.out.println("Enter the values:");
          for (int i = 0; i < divN; i++) {
            divArray[i] = sc.nextInt();
          }
          while (true) {
            System.out
                .println("Enter the order to divide (e.g., 1 2 for divArray[0] / divArray[1]). Type 'finish' to end:");
            String input = sc.next();
            if (input.equalsIgnoreCase("finish")) {
              break;
            }
            int index1 = Integer.parseInt(input) - 1;
            int index2 = sc.nextInt() - 1;
            if (divArray[index2] == 0) {
              System.out.println("Error: Division by zero is not allowed. Try again.");
              continue;
            }
            divArray[index1] /= divArray[index2];
            System.out.println("Current result: " + divArray[index1]);
          }
          System.out.println("The final Division result is " + divArray[0]);
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
}