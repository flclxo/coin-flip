import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in); // Get user input
        Random game = new Random(); // Generate number 1 or 2.

        System.out.println("Heads or Tails?");

        String headsOrTails = scan.nextLine(); // Get user choice Heads or Tails?

        int toss = game.nextInt(2) + 1; // Random gen from 1-2. 
        
        if (toss == 1) { // Random gen 1 = heads
            System.out.println("Heads  is the outcome of the coin toss. Thank you for playing!");
        }

        else { // If it's not 1 it = to tails 
            System.out.println("Tails is the outcome of the coin toss. Thank you for playing!");
        }

    }
}
