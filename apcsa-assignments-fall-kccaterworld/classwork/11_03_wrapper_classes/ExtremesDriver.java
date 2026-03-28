import java.util.Scanner;

public class ExtremesDriver{
    public static void main(String[] args) {
        Scanner inputs = new Scanner(System.in);
        Extremes guessing = new Extremes();

        System.out.println("Guess the maximum Integer value: ");
        Integer maxGuess = inputs.nextInt();
        System.out.println("You were off by " + guessing.maxDiff(maxGuess));
        System.out.println("Guess the minimum Integer value: ");
        Integer minGuess = inputs.nextInt();
        System.out.println("You were off by " + guessing.minDiff(minGuess));
        inputs.close();
    }
}
