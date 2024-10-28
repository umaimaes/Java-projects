package guess_Number;
import java.util.Scanner;

public class GuessGame {
    public static void main(String[] args) {
        System.out.println("Welcome to Guess game where two players try to guess each others favorite number");
        System.out.println("who do you wanna play as ? ");
        System.out.println(" write 1 if you wanna be the number provider                   write 2 if you wanna be the guesser  ");
        Scanner playerRole= new Scanner(System.in);
        int Role= playerRole.nextInt();
        if(Role==1){
            System.out.println("you are the number provider");
            ProviderNumber.numberProvider();
        }else if( Role ==2){
            System.out.println(" Guesser you are the guesser");
            System.out.println("number provider please write your number first");
            ProviderNumber.numberProvider();
        }else{
            System.out.println(" unavailable input");
        }
        guesserTurn();
        playerRole.close();
    }

    public static void guesserTurn() {

        Scanner your_guess= new Scanner(System.in);
        int guess;
        do {
            System.out.println("you are ready! what is your guess?");
            guess= your_guess.nextInt();
            if (ProviderNumber.nbr> guess){
                System.out.println("go higher");
            } else if (ProviderNumber.nbr< guess) {
                System.out.println(" go lower");
            }
        }while(ProviderNumber.nbr!= guess);
        System.out.println(" You won Bravo! the number is "+ProviderNumber.nbr);
    }

}
