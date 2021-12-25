package ieee;

import java.util.Scanner;

public class  prob1_Bottles{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of bottles: ");
        int n = input.nextInt();
        int[] rem = new int[n];
        int[] cap = new int[n];
        int amount=0;
        System.out.println("Enter the remaining volume of water and capacity of each bottle: ");
        for (int i = 0; i < n; i++){
            rem[i] = input.nextInt(); 
            amount+=rem[i];
            cap[i] = input.nextInt();
        }
        sort(cap);
        if(amount <= cap[n-1]+cap[n-2])
            System.out.println("yes");
        else
            System.out.println("no");
    }
    static void sort(int A[]){
	for (int i = 1; i < A.length; ++i) {
            int key = A[i];
            int j = i - 1;
            while (j >= 0 && A[j] > key) {
                A[j + 1] = A[j];
                j = j - 1;
            }
            A[j + 1] = key;
	}
    }
}
