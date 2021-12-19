package ieee;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        System.out.print("Enter number to print: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=0; i<n; i++){
            System.out.print(fib(i)+" ");
        }    
    }
    public static int fib(int n){
	if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
}
