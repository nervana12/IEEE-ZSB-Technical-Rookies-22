package ieee;

import java.util.Scanner;

public class prob9_DiagonalAbsDiff{
    public static int a=0, b=0; //sum of first and second diagonals
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the dimension of the square array: ");
        int n = input.nextInt();
        int[][] A = new int[n][n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                A[i][j] = input.nextInt();
                if(i==j)          a+=A[i][j];
                if (i+j == n-1)   b+=A[i][j];
            }
        }
        System.out.println("The absolute difference between the sums of diagonals= " + Math.abs(a-b));

    }
}
