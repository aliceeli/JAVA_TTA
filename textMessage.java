import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner kybrd = new Scanner(System.in);
    System.out.println("Please type your first text message: ");
    String text1 = kybrd.nextLine();
    System.out.println("Please type your second text message: ");
    String text2 = kybrd.nextLine();
    System.out.println(text1 + " " + text2);
 
  }
}