import java.util.*;

public class Main {
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        Random game = new Random();

        System.out.println("Heads or Tails?");

        String headsOrTails = scan.nextLine();

        int toss = game.nextInt(2) + 1;
        
        if (toss == 1) {
            System.out.println("Heads  is the outcome of the coin toss. Thank you for playing!");
        }

        else {
            System.out.println("Tails is the outcome of the coin toss. Thank you for playing!");
        }

    }
}
