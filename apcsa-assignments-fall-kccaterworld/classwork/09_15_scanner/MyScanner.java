import java.util.Scanner;

public class MyScanner {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.println("What's your name?");
    String name = input.nextLine();
    System.out.println("How old are you?");
    int age = input.nextInt();

    System.out.println("Hi " + name + "!");
    System.out.println("Wow, you look older than " + age + "! :o");
  }
}
