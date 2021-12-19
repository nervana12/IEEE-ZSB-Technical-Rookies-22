package ieee;

import java.util.ArrayList;
import java.util.Scanner;

public class prime{
    public static void main(String[] args) {
        ArrayList<Integer> A = new ArrayList<Integer>();
        System.out.println("Enter a number n>1 : ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i=2 ; i<=n ; i++){
            int s=0;
            for (int j=2 ; j<i ; j++){
                if (i % j == 0){
                    s++;
                }
            }
            if (s == 0) A.add(i);
        }
        
        Integer[] B = new Integer[A.size()];
        B = A.toArray(B);
        for (int i=0 ; i<B.length ; i++){
            System.out.print(B[i]+" ");
        }
    }  
}
