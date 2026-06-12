import java.util.Scanner;
import java.util.Random;
public class NumberGame {
    public static void main(String[] args){
        Scanner hello=new Scanner(System.in);
        Random random =new Random();
        int totalscore=0;
        int round=1;
        String playagain;
        System.out.println("~~~~Number Guessing Game~~~~");
        do{
            int secretnum=random.nextInt(100)+1;
            int maxAttempt=5;
            boolean guessed=false;
            System.out.println("\nRound"+round);
            System.out.println("\nGuess number between 1 to 100");
            System.out.println("\nYou have"+maxAttempt+"attempt" );
            for(int attempt=1;attempt<=maxAttempt;attempt++){
            System.out.println("Attempt:"+attempt);
            int guess=hello.nextInt();
            if(guess == secretnum){
            int score=(maxAttempt-attempt+1)*10;
        totalscore+=score;
        System.out.println("Correct..! You guessed the number." );
        System.out.println("Score earned:"+score);
        guessed=true;
        break;         
        }else if(guess>secretnum){
        System.out.println("Too high");
        }else{
        System.out.println("Too low");
        }
        if(attempt==maxAttempt){
        System.out.println("No attempt left");
        }


        }
        if(!guessed){
        System.out.println("The correct number was :"+secretnum);
        }
        System.out.println("Total Score:"+totalscore);
        System.out.println("\nPlay Another Round?(yes or no):");
        playagain=hello.next();
        round++;


    }while(playagain.equalsIgnoreCase("yes"));
    System.out.println("\n===GAME OVER===");
    System.out.println("Final Score:"+totalscore);
    hello.close();


    }

    
}
