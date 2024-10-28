package game.com;

import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Rps {
    public static void main(String[] args) {
        game();
    }

    public static void game() {
        Scanner PlayerChoixRole = new Scanner(System.in);
        System.out.println("welcome to Rock paper scissors Game! ");
        System.out.println(" you are playing against a computer");
        System.out.println("Do you wanna go first ? if yes write 1     if you wanna go last write 2");
        int ChoixRole = PlayerChoixRole.nextInt();

        if (ChoixRole == 1) {
            System.out.println("you go first!");
            generateChoices();
        }
        if (ChoixRole == 2) {
            System.out.println("mmm so you think you're smart ha !");
            generateChoices();
        }
    }

    public static void generateChoices(){
        String[] ChoixComputer = {"rock", "paper", "scissors"};
        System.out.println("choose ( either rock, paper or scissors)");
        Scanner PlayerChoixRole = new Scanner(System.in);
        String playerChoice = PlayerChoixRole.next();

        if (Objects.equals(playerChoice, "rock") ||
                Objects.equals(playerChoice, "paper") ||
                Objects.equals(playerChoice, "scissors")) {
            String computerChoice = generateRandomChoice(ChoixComputer);
            System.out.println("i choose " + computerChoice);
            determineWinner(playerChoice,computerChoice);
        } else {
            System.out.println("invalid input");
        }
    }
        public static void determineWinner(String playerChoice, String computerChoice){
            if (playerChoice.equals(computerChoice)){
                System.out.println("tie");
            }else if(playerChoice.equals("rock")&& computerChoice.equals("scissors")||
                    playerChoice.equals("scissors")&& computerChoice.equals("paper")||
                    playerChoice.equals("paper")&& computerChoice.equals("rock")){
                System.out.println("you won");
            }else{
                System.out.println("you lose, i win");
            }

        }


    public static String generateRandomChoice(String[] Choix){
        Random rand = new Random();
        int randomIndex= rand.nextInt(Choix.length);
        return Choix[randomIndex];
    }
}