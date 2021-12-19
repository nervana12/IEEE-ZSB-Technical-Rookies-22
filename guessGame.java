package ieee;

import java.util.Scanner;

public class guessGame {
    public static void main(String[] args) {
        System.out.println("Enter a number between 1,10 : ");
        Scanner input = new Scanner(System.in);
        int tries=0;
        int num = (int)(10*Math.random());
        int n = input.nextInt();
        while( n != num){
            tries++;
            System.out.println("Wrong guess, try again: ");
            n = input.nextInt();
        }
        System.out.println("Yay you got it "+ tries+" tries");
    }
}
