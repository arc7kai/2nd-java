package L8;

import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num, add, sub, div, mul;

    while (true) {
      System.out.println("For ADD type 1, SUBTRACT type 2, MULTIPLICATION type 3, DIVISION type 4, EXIT type 5");
      num = sc.nextInt();

      switch (num) {
        case 1:
          System.out.println("How Many Numbers You want to add");
          int n = sc.nextInt();
          int array[] = new int[n];
          System.out.println("Now Enter The Numbers");
          for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
          }
          add = 0;
          for (int i = 0; i < n; i++) {
            add += array[i];
          }
          System.out.println("The Sum is " + add);
          break;

        case 2:
          System.out.println("How Many Numbers You want to subtract");
          int n1 = sc.nextInt();
          int[] array1 = new int[n1];
          System.out.println("Now Enter The Numbers");
          for (int i = 0; i < n1; i++) {
            array1[i] = sc.nextInt();
          }
          sub = array1[0];
          for (int i = 1; i < n1; i++) {
            sub -= array1[i];
          }
          System.out.println("The Subtraction is " + sub);
          break;

        case 3:
          System.out.println("How Many Numbers You want to multiply");
          int n2 = sc.nextInt();
          int[] array2 = new int[n2];
          System.out.println("Now Enter The Numbers");
          for (int i = 0; i < n2; i++) {
            array2[i] = sc.nextInt();
          }
          mul = 1;
          for (int i = 0; i < n2; i++) {
            mul *= array2[i];
          }
          System.out.println("The Multiplication is " + mul);
          break;

        case 4:
          System.out.println("How Many Numbers You want to divide");
          int n3 = sc.nextInt();
          int[] array3 = new int[n3];
          System.out.println("Now Enter The Numbers");
          for (int i = 0; i < n3; i++) {
            array3[i] = sc.nextInt();
          }
          div = array3[0];
          for (int i = 1; i < n3; i++) {
            div /= array3[i];
          }
          System.out.println("The Division is " + div);
          break;

        case 5:
          System.out.println("Exiting the calculator. Goodbye!");
          sc.close();
          return;

        default:
          System.out.println("Invalid input. Please enter a number between 1 and 5.");
          break;
      }
    }
  }
}
