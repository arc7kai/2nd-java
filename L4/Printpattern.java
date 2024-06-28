import java.util.Scanner;

public class Printpattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What's your Name:'");
    String Name = sc.nextLine();

    System.out.println("Enter the limit to print star N:");
    int n = sc.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = n; j >= i; j--) {
        System.out.print("*");
      }
      System.err.println();
    }
    sc.close();
    System.err.println(Name);
  }
}
