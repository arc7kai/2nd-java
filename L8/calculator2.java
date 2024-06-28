package L8;

import java.util.Scanner;

public class calculator2 {
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
                    System.out.println("Enter the order to subtract (e.g., 1 2 for subArray[0] - subArray[1]):");
                    int subResult = subArray[0];
                    for (int i = 1; i < subN; i++) {
                        int index = sc.nextInt() - 1;
                        subResult -= subArray[index];
                    }
                    System.out.println("The Subtraction result is " + subResult);
                    break;

                case 3:
                    System.out.println("Enter the number of values you want to multiply:");
                    int mulN = sc.nextInt();
                    int[] mulArray = new int[mulN];
                    System.out.println("Enter the values:");
                    for (int i = 0; i < mulN; i++) {
                        mulArray[i] = sc.nextInt();
                    }
                    System.out.println("Enter the order to multiply (e.g., 1 2 for mulArray[0] * mulArray[1]):");
                    int mulResult = mulArray[0];
                    for (int i = 1; i < mulN; i++) {
                        int index = sc.nextInt() - 1;
                        mulResult *= mulArray[index];
                    }
                    System.out.println("The Multiplication result is " + mulResult);
                    break;

                case 4:
                    System.out.println("Enter the number of values you want to divide:");
                    int divN = sc.nextInt();
                    int[] divArray = new int[divN];
                    System.out.println("Enter the values:");
                    for (int i = 0; i < divN; i++) {
                        divArray[i] = sc.nextInt();
                    }
                    System.out.println("Enter the order to divide (e.g., 1 2 for divArray[0] / divArray[1]):");
                    int divResult = divArray[0];
                    for (int i = 1; i < divN; i++) {
                        int index = sc.nextInt() - 1;
                        if (divArray[index] == 0) {
                            System.out.println("Error: Division by zero is not allowed.");
                            break;
                        }
                        divResult /= divArray[index];
                    }
                    System.out.println("The Division result is " + divResult);
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
