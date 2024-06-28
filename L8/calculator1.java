package L8;

import java.util.Scanner;

public class calculator1 {
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
                    System.out.println("Enter the numbers to subtract (enter 'done' to finish):");
                    int sub = sc.nextInt();
                    while (sc.hasNextInt()) {
                        sub -= sc.nextInt();
                    }
                    sc.next(); // Clear 'done'
                    System.out.println("The Subtraction result is " + sub);
                    break;

                case 3:
                    System.out.println("Enter the numbers to multiply (enter 'done' to finish):");
                    int mul = 1;
                    while (sc.hasNextInt()) {
                        mul *= sc.nextInt();
                    }
                    sc.next(); // Clear 'done'
                    System.out.println("The Multiplication result is " + mul);
                    break;

                case 4:
                    System.out.println("Enter the numbers to divide (enter 'done' to finish):");
                    int div = sc.nextInt();
                    while (sc.hasNextInt()) {
                        int nextNum = sc.nextInt();
                        if (nextNum == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                            break;
                        }
                        div /= nextNum;
                    }
                    sc.next(); // Clear 'done'
                    System.out.println("The Division result is " + div);
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
