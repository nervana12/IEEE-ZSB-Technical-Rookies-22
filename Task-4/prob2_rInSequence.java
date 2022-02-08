package ieee;

import java.util.Scanner;

public class prob2_rInSequence{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sequence of letters: ");
        String seq= input.nextLine(); 
        System.out.println("Enter n; number of all letters:");
        int n = input.nextInt();
        char[] A = seq.toCharArray();
        //number of complete sequences
        int a = n/A.length;
        //number of letters of incomplete sequence
        int b = n%A.length;
        int tot = OfOne(A, A.length)*a + OfOne(A, b);
        System.out.println(tot);
    }
    
    public static int OfOne(char[] a,int x){
        int num=0;
        for (int i=0 ; i<x ; i++){
            if(a[i] == 'r')
                num++;
        }
        return num;
    }
}
