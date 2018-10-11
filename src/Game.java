import java.util.Scanner;


public class Game
{
    public static void Games(int num1) {
        Scanner input = new Scanner(System.in);
        String level = "";
        int guesses = 0;
        System.out.print("pick a level: easy or hard");
        level = input.nextLine();
        if (level == "hard") {
            int x = (int) (Math.random() * 1000) * +1;
            System.out.print("Ok. This is a challenge");
            System.out.print("I'm thinking of a number between 1 and 1000");
            System.out.print("Guess Away");
            Scanner number = new Scanner(System.in);
            int guess = input.nextInt();
            while (guess != (num1)) {
                if (guess < (num1)) {
                    System.out.print("Too small!");
                    guesses = guesses + 1;
                }
                if (guess > (num1)) {
                    System.out.print("Too big!");
                    guesses = guesses + 1;
                }
            }
            System.out.println("YOU GOT IT!");
            System.out.println("It took you" + "guesses" + "guesses to get my number.");


        }
        if (level == "easy") {
            int y = (int) (Math.random() * 10) + 1;
            System.out.print("OK. Here we go!");
            System.out.print("I'm thinking of a number between 1 and 10");
            System.out.print("Guess Away");
            Scanner number = new Scanner(System.in);
            int guess = input.nextInt();
            while (guess != (num1)) {
                if (guess < (num1)) {
                    System.out.print("Too small!");
                    guesses = guesses + 1;
                }
                if (guess > (num1)) {
                    System.out.print("Too big!");
                    guesses = guesses + 1;
                }
            }
            System.out.println("YOU GOT IT!");
            System.out.println("It took you" + "guesses" + "guesses to get my number.");

        }
    }
}
