package ieee;

import java.util.Scanner;

public class sum1ton {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Enter the number n>1: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=1 ; i<=n ; i++){
            sum+=i;
        } 
        System.out.println(sum);
    }
}