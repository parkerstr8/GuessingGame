import java.util.Scanner;

public class Game
{
    public static void Games(int num1)
    {
        Scanner input = new Scanner(System.in);
        String level = "";
        System.out.print("pick a level: easy or hard");
        level = input.nextLine();
        if(level=="hard")
        {
            System.out.print("Ok. This is a challenge");
            System.out.print("I'm thinking of a number between 1 and 1000");
            System.out.print("Guess Away");
            Scanner number=new Scanner(System.in);
            int guess=input.nextInt();
            if(guess<num1)
            {
                System.out.print("Too big!");
            }

            while()

        }
}
