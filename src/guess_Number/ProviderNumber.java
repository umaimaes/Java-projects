package guess_Number;

import java.util.Scanner;

public class ProviderNumber {
    public static int nbr;
    public static void main(String[] args) {

        numberProvider();
    }

    public static void numberProvider() {

        System.out.print("what is your favorite number: ");
        Scanner number= new Scanner(System.in);
        nbr= number.nextInt();
    }
}
