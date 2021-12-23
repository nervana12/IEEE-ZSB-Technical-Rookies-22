package ieee;

import java.util.Scanner;

public class prob3_GuessingGame {
    public static void main(String args[]){
        //a random number from 100 to 999
        int a = 100 + (int)(Math.random() * ((999 - 100) + 1));
        int attempts=0;
        System.out.println("Enter your guessed 3-digit number:");
        Scanner input = new Scanner(System.in);
        int b = input.nextInt();
        while( a != b){
            int miss=0 , hit=0;
            attempts++;
            System.out.println("Wrong guess, try again: ");
            b = input.nextInt();
            for(int i=0; i<3; i++){
                if((a%(10)^i)%10 == (b%(10)^i)%10)   hit++;
                for(int j=0; j<3; j++){
                    if((a%(10)^i)%10 == (b%(10)^j)%10)  miss=miss+1-hit;
                }
            }
            System.out.println(hit + " hit " + miss+" miss");
        }
        System.out.println("Correct number, "+ attempts+" attempts");
    }
}

