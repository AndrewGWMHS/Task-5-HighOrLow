import java.util.Scanner;
public class HigherOrLower {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int guess = 0;
        int randomNum = (int)(Math.random() * 10) + 1;
        boolean valid = false;

        do {
            System.out.println("Try to guess my number [1-10]");
            if (scan.hasNextInt()) {
                guess = scan.nextInt();
                if (guess > 0 && guess <= 10) {
                    valid = true;
                }
                else {
                    scan.nextLine();
                    System.out.println("Value exceeded given range, try again.");
                    System.out.println();
                }
            } else {
                scan.nextLine();
                System.out.println("Wrong data type, try again.");
                System.out.println();
            }
        } while (!valid);

        System.out.println("My number was " + randomNum);

        if (guess < randomNum) {
            System.out.println("Your number was too low.");
        }
        else if (guess > randomNum) {
            System.out.println("Your number was too high.");
        }
        else {
            System.out.println("You guessed it correctly!");
        }
    }
}