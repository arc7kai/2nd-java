package L8;

import java.util.Scanner;

public class checkpass {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Marks to Check the Result");
    int mo = sc.nextInt();

    if (mo <= 300 && mo >= 200) {
      System.out.println("Congratulations, you have passed");
    } else if (mo >= 310 && mo <= 410) {
      System.out.println("Congratulations, you are in the 1st Division");
    } else if (mo >= 410 && mo <= 500) {
      System.out.println("Congratulations, you are in the top 50 list");
    } else {
      System.out.println("Sorry, you have failed. Better luck next time");
    }
    sc.close();
  }
}
