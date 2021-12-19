package ieee;

import java.util.Scanner;

public class modOfSum {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the number n>1: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1 ; i<=n ; i++){
            if( i%3==0 || i%5==0)
                sum+=i;
        } 
        System.out.println(sum);
    }
}
