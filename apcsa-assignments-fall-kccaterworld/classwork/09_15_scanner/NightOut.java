import java.util.Scanner;

public class NightOut{
  public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    System.out.println("How much does dinner usually cost?");
    double dinner = input.nextDouble();
    dinner = (dinner * 3);
    System.out.println("How much is laser tag for one person?");
    double laserTag = input.nextDouble();
    laserTag = (2 * laserTag);
    System.out.println("How much does a triple scoop cost?");
    double scoop = input.nextDouble();
    scoop = (scoop + (scoop / 3));

    System.out.println("Dinner: " + dinner);
    System.out.println("Laser Tag: " + laserTag);
    System.out.println("Ice Cream: " + scoop);
    System.out.println("Grand total: " + (dinner + scoop + laserTag));
  }
}
