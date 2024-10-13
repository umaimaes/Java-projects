package guess_Number;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome to Guess number");
        randomNum();
    }


    public static void randomNum() {
        int randomNum;
        randomNum = (int) (Math.random() * 3000)+1;
        System.out.println(randomNum);
        System.out.println(" i'm thinking of a number between 1 and 3000, can you guess it : ");
        guessNum(randomNum);
    }

    public static void guessNum(int randomNum) {
       int num;
       Scanner s = new Scanner(System.in);
        do {
            num = s.nextInt();
            if (num < randomNum) {
                System.out.println("You chose " + num + ". Go higher!");
            } else if (num > randomNum) {
                System.out.println("You chose " + num + ". Go lower!");
            }
        } while (num != randomNum);

        System.out.println("You guessed it! Bravo! the number is " + randomNum);
    }
}













