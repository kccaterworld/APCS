import java.util.Scanner;

public class NoonSnooze {
    public static void main(String[] args) {
        int snoozeMinutes;
        Scanner input;
        if (args.length == 1) {
            snoozeMinutes = (int)Double.parseDouble(args[0]);
        }
        else {
            input = new Scanner(System.in);
            System.out.println("How many minutes to snooze for?");
            snoozeMinutes = input.nextInt();
        }
        if (args.length > 1) {
            System.out.println("Too many arguments.");
            return;
        }

        if (snoozeMinutes < 0) {
            System.out.println("No negative values are allowed");
            return;
        }
        int hours = snoozeMinutes / 60;
        int minutes = snoozeMinutes % 60;
        if (hours > 0) {
            if (hours > 12) {
                hours = hours % 12;
            }
            if (minutes < 10) {
                System.out.println("You will wake up at " + hours + ":0" + (String.valueOf(minutes)) + " PM.");
            } else {
                System.out.println("You will wake up at " + hours + ":" + minutes + " PM.");
            }
        } else {
            if (minutes < 10) {
                System.out.println("You will wake up at 12:0" + (String.valueOf(minutes)) + " PM.");
            } else {
                System.out.println("You will wake up at 12:" + minutes + " PM.");
            }
        }
    }
}
