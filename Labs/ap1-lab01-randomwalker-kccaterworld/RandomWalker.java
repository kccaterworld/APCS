import java.util.Scanner;

public class RandomWalker {
  public static void main(String[] args) {
    int n;
    int x = 0;
    int y = 0;
    if (args.length != 0) {
      n = (int)Double.parseDouble(args[0]);
    }
    else {
      System.out.print("n: ");
      Scanner input = new Scanner(System.in);
      n = input.nextInt();
    }
    int sum = 0;
    for(int i = 0; i < n; i++) {
      int direction = (int)(Math.random() * 4) + 1;
      sum += direction;
      //North: 1
      System.out.println(direction);
      if (direction == 1) {
	      y++;
      }
      //South: 2
      if (direction == 2) {
	      y--;
      }
      //East: 3
      if (direction == 3) {
	      x++;
      }
      //West: 4
      if (direction == 4) {
	      x--;
      }
    }
    double average = (double)sum / n;
    double fromOrigin = (x * x) + (y * y);
    System.out.println("Total distance traveled: " + fromOrigin);
    System.out.println("Average step length: " + average);
  }
}
