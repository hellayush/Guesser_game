
import java.util.*;

class Guessser
{
   int GuessingPer()
   {
    Scanner hello = new Scanner(System.in);
    System.out.println("Enter the guesser number : ");
    int tel = hello.nextInt();
    return tel;

    }
}

class Players
{
     int Guessingplayer()
    {
        Scanner  play= new Scanner(System.in);
        System.out.println("HEY!! Guess the number :");
        int guess = play.nextInt();
        return guess;

    }
}
class Umpire 
{
    int NumFromGuesser;
    int player1;
    int player2;
    int player3;

    void NumFromGuesser()
    {
        Guessser g = new Guessser();
        NumFromGuesser=g.GuessingPer();
    }

     void NumFromPlayer()
    {
        Players p1= new Players();
        Players p2= new Players();
        Players p3= new Players();
        player1= p1.Guessingplayer();
        player2= p2.Guessingplayer();
        player3= p3.Guessingplayer();

    }

    void compare()
    {
        if(NumFromGuesser==player1 )
        {
             if (NumFromGuesser==player1 && NumFromGuesser==player2 && NumFromGuesser==player3)
            {
                System.out.println("PLAYER 1 ,2 , 3 ALL OF THEM WON THE GAME!!");
            }
            else if (player2==player1)
            {
                System.out.println("PLAYER 1 AND 2 WON THE GAME !! ");
            }
            else if(player3==player1)
            {
                System.out.println("PLAYER 1 AND 3 WON THE GAME !! ");
            }
            else 
            {
                System.out.println("1st PLAYER WON THE GAME !!");
            }
        }
        else if (NumFromGuesser==player2)
        {
             if(player3==player2)
            {
                System.out.println("PLAYER 2 NAD 3 WON THE GAME !! ");
            }
            else
            {
                System.out.println("PLAYER 2 WON THE GAME !! ");
            }
        }
        else if (NumFromGuesser==player3)
        {
            System.out.println("PLAYER 3 WON THE GAME !!");
        }
        else 
        {
            System.out.println(" OHH NOO !! YOU HAVE LOST THE GAME !!");
        }

    }

}

public class output
{
    public static void main(String[] args)
    {
        System.out.println("************************************ ");
        System.out.println("HELLO! WELCOME TO THE GAME !! ");
        System.out.println("************************************ ");
        Umpire u= new Umpire();
        u.NumFromGuesser();
        u.NumFromPlayer();
        u.compare();

    }
}